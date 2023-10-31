package ch8Polymorphism;

// 외부 클래스
public class MyLinkedList2Class {
	//main 선언
	public static void main(String[] args) {
		// MLL의 생성자로 heap 에 인스턴스 생성
		MyLinkedList2Class myList = new MyLinkedList2Class();
		
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



		private Node head = null;

		private class Node {
			private String data;
			private Node prev;
			private Node next;

			public Node(String data) {
				this.data = data;
			}
		}
		
		private Node find(String data) {
			if (head == null) return null;

			Node next = head;
			do {
				if (next.data.equals(data))
					return next;
				next = next.next;
			} while (next != null);
			return null;
		}
		
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
		
		private boolean isDuplicated(String data) {
			Node fnode = find(data);
			if (fnode != null) {
				System.out.println("["+data+"]는 이미 존재하는 데이터입니다.");
				return true;
			}
			return false;
		}
		
		public void add(String prev, String data) {
			if (isDuplicated(data))	return;

			Node node = find(prev);
			if (node == null)
				add(data);
			else {
				Node newNode = new Node(data);
				newNode.prev = node;
				newNode.next = node.next;
				node.next.prev = newNode;
				node.next = newNode;
			}
		}

		public void add(String data) {
			if (isDuplicated(data))	return;

			Node temp = head;
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			} else {
				while (temp.next != null) {
					temp= temp.next;
				}
				temp.next = newNode;
				newNode.prev = temp; 
			}
		}

		public void print() {
			if (head == null) {
				System.out.println("등록된 데이터가 없습니다.");
			} else {
				System.out.println("등록된 데이터는 다음과 같습니다.");
				Node next = head;
				while (true) {
					System.out.println(next.data);
					
					if (next.next == null)
						break;
					
					next = next.next;
				}
				
				System.out.println("-".repeat(20));
				while (next != null) {
					System.out.println(next.data);
					next = next.prev;
				}
			}
		}
	}
