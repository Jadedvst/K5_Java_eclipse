package ch8Polymorphism;

public class MyLinkedList {
	
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.print();
		
		myList.add("Java");
		myList.add("JSP");
		myList.add("Servlet");
		myList.print();

	}
//----------------------------------------------------------//
	
	private Nodeq head = null; // MLL의 시작 노드의 참조값

	//내부클래스 노드//
	private class Nodeq {
		private String data;//필드변수
		private Nodeq link; //현재 노드의 참조변수
		//Nodes are a basic data structure 
		//which contain data and one or more links to other nodes. 
		//Nodes can be used to represent a tree structure or a linked list. 

		public Nodeq(String data) {//노드 생성자
			this.data = data;
		}
	}
//노드 추가 Method
	public void add(String data) {
		//새 노드
		Nodeq newNode = new Nodeq(data); 
		
		//리스트 시작점 head가 null 이면 새 입력값으로 시작
		if(head==null) {
			head = newNode;
			
		
		}else {
			// head 존재시 새 임시변수에 시작점 저장
			Nodeq next = head; //heap의 인스턴스주소를 가져오는 참조변수(stack 에 위치)
			
			//다음 link가 있을시 다음으로 이동
			while(next.link != null) {
				next = next.link;
			}
			//다음 새로운 값을 링크에 저장
			next.link = newNode;
		}
	}

	public void print() {
		//출력값 없을 시 리턴
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
			return;
	
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			//출력 값이 있을시	시작값을 next 에 불러온다
			Nodeq next = head;
			//next값이 없을때까지 출력, 링크를 통해서 다음으로 이동
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}

	
}
