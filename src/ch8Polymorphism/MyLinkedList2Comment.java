package ch8Polymorphism;

// 외부 클래스
public class MyLinkedList2Comment {
	//main 선언
	public static void main(String[] args) {
		// MLL의 생성자로 heap 에 인스턴스 생성
		MyLinkedList2Comment myList = new MyLinkedList2Comment();
		
		myList.print();
		// MLL의 Method로 객체 추가
		myList.add("Java");
		myList.add("JSP");
		myList.add("Servlet");
		myList.add("Python");
		myList.add("Spring");
		
		myList.add("Java", "C++");
		myList.delete("Java");
		myList.delete("Spring");
		myList.add("JSP", "C#");
		
		//추가 및 조정 후 출력
		myList.print();

	}
//----------------------------------------------------------//
	//노드 
	private Node head = null;
//	private Node last = null;

	//내부 클래스 Node//
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
		Node file = head;
		if(head==null) {
			head = newNode; //head= Java
		}else {
			 //1)file: null->Java// 2)Java//
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
		if (head == null) return null;
		Node file = head;
		do {
			if (file.data.equals(data))//"Java"
				return file; //Java instance
			file = file.next;
		}while(file != null);//file.next 인지 file 인지 조심!!!
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
	public void delete(String data) {
		Node node = find(data);
		
		if (node == null)	return;
		
		Node p = node.prev;
		Node n = node.next;
		if (p != null && n != null) {
			p.next = n;
			n.prev = p;
		} else if (p == null && n != null){
			n.prev = null;
			head = n;
		} else if (p != null && n == null){
			p.next = null;
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
