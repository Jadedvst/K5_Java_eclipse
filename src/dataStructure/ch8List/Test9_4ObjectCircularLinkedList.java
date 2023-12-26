package dataStructure.ch8List;
/*
 * 정수 리스트 > 객체 리스트> 객체 원형 리스트
 */
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


class SimpleObject3 {
	static final int NO = 1; // 번호를 읽어 들일까요?
	static final int NAME = 2; // 이름을 읽어 들일까요?

	private String no; // 회원번호
	private String name; // 이름

	// --- 문자열 표현을 반환 ---//
	@Override
	public String toString() {
		return "(" + no + ") " + name;
	}

	public SimpleObject3(String no, String name) {
		this.no = no;
		this.name = name;
	}
	public SimpleObject3() {
		this.no = null;
		this.name = null;
	}
	// --- 데이터를 읽어 들임 ---//
	void scanData(String guide, int sw) {
		Scanner sc = new Scanner(System.in);
		System.out.println(guide + "할 데이터를 입력하세요." + sw);

		if ((sw & NO) == NO) { // & 는 bit 연산자임
			System.out.print("번호: ");
			no = sc.next();
		}
		if ((sw & NAME) == NAME) {
			System.out.print("이름: ");
			name = sc.next();
		}
	}
	
	void ranData() {
		Random rd = new Random();
		int rnum = rd.nextInt(10);
		System.out.println("insert "+rnum);
		no = Integer.toString(rnum);
		name = "회원"+Integer.toString(rnum);
	}

	// --- 회원번호로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject3> NO_ORDER = new NoOrderComparator();

	private static class NoOrderComparator implements Comparator<SimpleObject3> {
		@Override
		public int compare(SimpleObject3 d1, SimpleObject3 d2) {
			return (d1.no.compareTo(d2.no) > 0) ? 1 : (d1.no.compareTo(d2.no) < 0) ? -1 : 0;
		}
	}

	// --- 이름으로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject3> NAME_ORDER = new NameOrderComparator();

	private static class NameOrderComparator implements Comparator<SimpleObject3> {
		@Override
		public int compare(SimpleObject3 d1, SimpleObject3 d2) {
			return d1.name.compareTo(d2.name);
		}
	}
}

class Node3 {
	SimpleObject3 data;
	Node3 link;

	public Node3(SimpleObject3 element) {
		data = element;
		link = null;
	}
	
	public Node3() { //원형, 이중시 head node null로 따로 지정
		this.data = null;
		link = this;
	}
}

class CircularList {
	Node3 first;

	public CircularList() { //head node
		first = new Node3();
	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		System.out.println(first.data);
		Node3 p = first.link;
		if(p!=first) {
			System.out.println(p.data);
			p=p.link;
		}
		System.out.println("=> "+ p.data+"\n");
	}

	public void Add(SimpleObject3 element, Comparator<SimpleObject3> cc) // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
	{
		///////e 추가시 더 실행하지 않게 return 필수!!!!!!!!!!!!!////////
		Node3 p = first, q =null, e = new Node3(element);
		// 초기 head값 밖에 없을때
		//first e first
		if(p.link==p){
			first.link = e;
			e.link = first;
			return;
		}
		q=p; //q = first
		p=first.link;
		
		while(p!=first) {
			// p데이터가 클시에 집어넣는다.
			if(cc.compare(p.data, element)>=0) {
				if(p.link==first){
					// 원소 하나: head값에 집어넣기
					//first=q p first
					//first=q=p e first
					if(first.data==null) {
						first = p;
						first.link = e;
						e.link = first;
						return;
					}
					// first=q p q
					// first=q e p q
					else {
						first.link = e;
						e.link = p;
						p.link = first;
						return;
					}
				}
				// first q p first: q를 밑에서 정의
				// first q e p first
				q.link = e;
				e.link = p;
				p.link = first;
				return;
			}
			// p데이터가 작을시 q에 저장
			else{
				if(p.link==first){
					// 원소 하나: head값에 집어넣기
					//first=q p first
					//first=q=e p first
					if(first.data==null) {
						first = e;
						first.link = p;
						p.link = first;
						return;
					}
					// first=q p q
					// first=q p e q
					else {
						p.link = e;
						e.link = first;
						return;
					}
				}
				q = p;
				p = p.link;
				//list의 마지막, 즉 현 p가 first
				if(p==first) {
					//first q p=first
					//first q e p=first
					q.link = e;
					e.link = first;
					return;
				}
			}
		}
		
		
	}

	public boolean Search(SimpleObject3 element, Comparator<SimpleObject3> cc) { // 전체 리스트를 순서대로 출력한다.
		return false;
	}
	
	public int Delete(SimpleObject3 element, Comparator<SimpleObject3> cc) // delete the element
	{
		return -1;
	}
	
	// --- 리스트가 비어있는가? ---//
	public boolean isEmpty() {
		return first.link == first;
		//맨처음 head노드는 자기자신을 가르킴. 
		//하나 삽입시 headnode와 삽입된 노드가 서로 가리킴
		//ex) 10.rlink 가 null, 11.link가 null이 나와야 하기에
		// 처음 삽입 부터 자기자신을 가리키면 10.rlink = 10이 되어버린다
	}
}

public class Test9_4ObjectCircularLinkedList {
	
	// --- 메뉴 선택 ---//

	public static void main(String[] args) {
		System.out.println("CircularLinkedList");
		Scanner sc = new Scanner(System.in);

		CircularList list = new CircularList();
		SimpleObject3 data;
		SimpleObject3 data2;
		list.Show();
		data = new SimpleObject3();
//		data.scanData("입력", 3);
//		list.Add(data, SimpleObject3.NO_ORDER);
		data2 = new SimpleObject3();
		data.ranData();
		list.Add(data, SimpleObject3.NO_ORDER);
		list.Show();
		data2.ranData();
		list.Add(data2, SimpleObject3.NO_ORDER);
		list.Show();
		data = new SimpleObject3();
		data.ranData();
		list.Add(data, SimpleObject3.NO_ORDER);
		list.Show();
		data2 = new SimpleObject3();
		data2.ranData();
		list.Add(data2, SimpleObject3.NO_ORDER);
		list.Show();
	}
}
