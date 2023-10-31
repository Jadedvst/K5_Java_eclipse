package ch8Polymorphism;

public class MyLinkedList2way {
	
	public static void main(String[] args) {
		MyLinkedList2way myList = new MyLinkedList2way();
		myList.print();
		
		myList.add("Java");
		myList.add("JSP");
		myList.add("Servlet");
		myList.add("Python");
		myList.add("Spring");
		myList.print();

	}
//----------------------------------------------------------//
	
	private Node head = null; // Field

	
	private class Node { //내부 클래스
		private String data;
		private Node next;
		private Node prev;
	
		//Nodes are a basic data structure 
		//which contain data and one or more links to other nodes. 
		//Nodes can be used to represent a tree structure or a linked list. 

		public Node(String data) {
			this.data = data;
		}
	}

	public void add(String data) {
		Node newNode = new Node(data); 
		
		if(head==null) {
			head = newNode; //head= Java
		}else {
			Node file = head; //1)next: null->Java// 2)Java//
			while(file.next != null) {
				file = file.next; // 2)next: Java-> JSP//
			}
			file.next = newNode; //1)next: null->JSP//2)->Ser
			newNode.prev = file;  // 아 열받아 아ㅏㅏㅏnewNode 도 heap 에 할당된 인스턴스!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			
			// Node pre 라고 따로 만들면 heap에 인스턴스가 새롭게 만들어짐
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node file = head;
			while (true) {
				System.out.println(file.data);
				
				if (file.next == null) //다음링크가 없을때
					break;
			
				file = file.next;
			}
			System.out.println("-".repeat(20));
			while (file != null) {//file이 마지막값
				System.out.println(file.data);
				file = file.prev;
			}

		}
	}

	
}
