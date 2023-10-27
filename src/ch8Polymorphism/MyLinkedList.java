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
	
	private Node head = null; // Field

	private class Node {
		private String data;
		private Node link; 
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
			head = newNode;
		}else {
			Node next = head; //이미 인스턴스가 생성되어서 다른 인스턴스를 만들시 생성자를 쓸 필요가 없다?
			while(next.link != null) {
				next = next.link;
			}
			
			next.link = newNode;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}

	
}
