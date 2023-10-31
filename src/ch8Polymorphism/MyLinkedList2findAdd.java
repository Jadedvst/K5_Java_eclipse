package ch8Polymorphism;

public class MyLinkedList2findAdd {
	
	public static void main(String[] args) {
		MyLinkedList2findAdd myList = new MyLinkedList2findAdd();
		myList.print();
		
		myList.add("Java");
		myList.add("JSP");
		myList.add("Servlet");
		myList.add("Python");
		myList.add("Spring");
		
		myList.add("Java", "C++");
		myList.delete("Java");
		myList.delete("Spring");
		myList.add("JSP", "C#");
		
		myList.print();

	}
//----------------------------------------------------------//
	
	private Node head = null;// Field
//	private Node last = null;

	
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
	
	//노드 추가 Method
	public void add(String data) {
		Node newNode = new Node(data); 
		
		if(head==null) {
			head = newNode; //head= Java
		}else {
			Node file = head; //1)file: null->Java// 2)Java//
			while(file.next != null) {
				file = file.next; // 2)file: Java-> JSP//
			}
			file.next = newNode; //1)file: null->JSP//2)->Ser
			newNode.prev = file;
			
//			last = file.next;
			// Node pre 라고 따로 만들면 heap에 인스턴스가 새롭게 만들어짐
		}
		
	}
	
	private Node find(String data) {
		Node file = head;
		do {
			if (file.data.equals(data))//"Java"
				return file; //Java instance
			file = file.next;
		}while(file.next != null);
		return null;
	}
	
	public void add (String prev, String data) {
		Node node = find(prev);
		if (node == null) // 
			add(data); // 제일 뒤에 추가
		else {
			Node newNode = new Node(data);//"C++"instance
			newNode.prev = node;//C++.prev=Java
			newNode.next = node.next;//C++.next = Java.next= JSP
			node.next.prev = newNode;//JSP.prev => C++
			//doubly linked list
			node.next = newNode;// JSP => C++
		}
	}
	//----------리스트에서 삭제시 맨 앞과 뒤를 주의----------//
	public void delete (String data) {
		Node node = find(data);
		if (node == null) return;
		
		if (node.prev == null){ //'A'B
			head = node.next;
			node.next.prev = null;
		}
		else if (node.next == null){//C'D'
	//		last = node.prev;
			node.prev.next = null;
		}
		else {//A'B'C
			node.prev.next = node.next;
			node.next.prev = node.prev;
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
				
				if (file.next == null) {//다음링크가 없을때
					break;
				}
				file = file.next;
			}
			
			System.out.println("-".repeat(20));
			while ( file != null) {//file이 마지막값
				System.out.println(file.data);
				file = file.prev;
//				last = null;
			}

		}
	}

	
}
