package ch8Polymorphism;

import ch8Polymorphism.MyLinkedList2way.Node;

public class MyLinkedList2wayERROR {
	
	public static void main(String[] args) {
		MyLinkedList2wayERROR myList = new MyLinkedList2wayERROR();
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
			head = newNode; //head= Java
		}else {
			Node next = head; //
			Node pre = newNode; // ERROR : 생성자가 달라도 주소가 같으면 같은 값
								//			즉, next 와 pre 가 같은 주소일 경우 next.link == pre.link
			while(next.link != null) {
				
				next = next.link; // 2)
				
			}
			next.link = pre; //
			pre.link = next;  //next.link = pre.link ㅜㅜㅜㅜㅜㅜㅜ
			
		}
	}


	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (true) {
				System.out.println(file.data);
				
				if (next.next == null) {//다음링크가 없을때
					break;
				}
				next = next.next;
			}
			System.out.println("-".repeat(20));
			while (next != null) {//file이 마지막값
				System.out.println(next.data);
				next = file.prev;
			}

		}
	}

	
}