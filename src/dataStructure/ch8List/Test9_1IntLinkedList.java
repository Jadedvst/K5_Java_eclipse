package dataStructure.ch8List;

import java.util.Random;
import java.util.Scanner;


class LinkedList1{
	Node1 first;
	class Node1 {
		int data;
		Node1 link;

		public Node1(int element) {
			data = element;
			link = null;
		}
	}
	public LinkedList1() {
		first = null;
	}
	
	public void Show() { // 전체 리스트를 순서대로 출력한다.
		Node1 p = first;
		while(p!=null) {
			System.out.print(p.data + " ");
			p = p.link;
		}
		System.out.println();
	}
	
	public boolean Search(int element) {
		Node1 p = first;
		while(p!=null) {
			if(p.data==element) {
				return true;
			}
			p=p.link;
		}
		return false;
	}
	
	
	
	public void Add(int element) { // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
		Node1 tmp = new Node1(element);
		Node1 p = first, pp = null;
		if(first == null) {
			first = tmp; return;
		}
		while(p!=null) {
			if(element<p.data) {
				tmp.link = p;
					if(pp==null) { // pp가 선언안됨: p가 first인 상황
						first = tmp; //p는? 애초에 tmp.link =p;
						return; //Loop가 돌지 않게 나가는 구문 필수
					}
					else {
						pp.link = tmp;
						return;
					}
			}
			else {
				//q 갱신 p가 끝값일시 tmp 넣기
				pp = p;
				p = p.link;
				if(p==null) { // tmp 보다 크거나 작은걸 확인해야 함으로 위에서 마무리
					pp.link = tmp;
					tmp.link = null;
					return;
				}
			}
		}
	}
	
	public int Delete(int element) {
		Node1 p = first, q = null;
		while (p != null) {
			if (p.data == element){
				if(q == null) { // 처음 위치
					first = first.link;
					return element;
				}
				if (p.link == null){// 끝 위치
					q.link = null;
					p = null;
					return element;
				}
				q.link = p.link; // p.삭제 , 일반 케이스 먼저 짜기
				return element;
			}
			q = p; //전노드
			p = p.link; //현노드
		}
		return -1;
	}
	
	public boolean isEmpty() {
		if (first == null) return true;
		return false;
	}

	


}
public class Test9_1IntLinkedList {
	enum Menu {
		Add("insert"), Delete("delete"), Show("print"), Search("search"), Exit("exit");
		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}
// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		}while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}
	
	public static void main(String[] args) {
		Menu menu;
		Random rand = new Random();
		System.out.println("Linked List");
		LinkedList1 list = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		int data = 0;
		
		System.out.println("inserted");
		
		do {
			list.Show();
			switch (menu = SelectMenu()) {
			case Add: // 머리노드 삽입
				data = rand.nextInt(20);
//				double d = Math.random();
//				data = (int) (d * 50);
				list.Add(data);
				break;
			case Delete: // 머리 노드 삭제
				if(list.isEmpty()) {
					System.out.println("리스트가 비었습니다.");
					break;
				}
				System.out.println("삭제: ");
				data = sc.nextInt();
				int num = list.Delete(data);
				System.out.println("삭제된 데이터는 " + num);
				break;
			case Show: // 꼬리 노드 삭제
				list.Show();
				break;
			case Search: // 회원 번호 검색
				if(list.isEmpty()) {
					System.out.println("리스트가 비었습니다.");
					break;
				}
				System.out.println("검색: ");
				int n = sc.nextInt();
				boolean result = list.Search(n);
				if (!result)
					System.out.println("검색 값 = " + n + ": 데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + n + ": 데이터가 존재합니다.");
				break;
			case Exit: // 꼬리 노드 삭제
				break;
			}
		} while (menu != Menu.Exit);
	}
}
