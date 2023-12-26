package dataStructure.ch9Tree;
/*
 * 23.9.25 4회차 실습 코드
 */
import java.util.Random;
import java.util.Scanner;


//정수를 저정하는 이진트리 만들기 실습

class TreeNode {
	TreeNode LeftChild;
	int data;
	TreeNode RightChild;

	public TreeNode() {
		LeftChild = RightChild = null;
	}
	
	public TreeNode(int x) {
		LeftChild = RightChild = null;
		data = x;
	}
}

class Tree {
	TreeNode root;

	Tree() {
		root = null;
	}
	
	TreeNode inorderSucc(TreeNode current) {
		TreeNode temp = current.RightChild;
		if (current.RightChild != null)
			while (temp.LeftChild != null)
				temp = temp.LeftChild;
		return temp;
	}

	boolean isLeafNode(TreeNode current) {
		if (current.LeftChild == null && current.RightChild == null)
			return true;
		else
			return false;
	}

	void inorder() {
		inorder(root);
	}

	void preorder() {
		preorder(root);
	}

	void postorder() {
		postorder(root);
	}

	void inorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			inorder(CurrentNode.LeftChild);
			System.out.print(" " + CurrentNode.data);
			inorder(CurrentNode.RightChild);
		}
	}

	void preorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			System.out.print(CurrentNode.data + " ");
			preorder(CurrentNode.LeftChild);
			preorder(CurrentNode.RightChild);
		}
	}

	void postorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			postorder(CurrentNode.LeftChild);
			postorder(CurrentNode.RightChild);
			System.out.print(CurrentNode.data + " ");
		}
	}

	boolean insert(int x) {// binary search tree를 만드는 입력 => A + B * C을 tree로 만드는 방법: 입력 해결하는 알고리즘 작성 방법을
							// 설계하여 구현
		TreeNode p = root;
		TreeNode q = null;
		TreeNode temp = new TreeNode(x);
		// 최고 조상
		if (p==null) {
			root = temp;
			return true;
		}
		while(p!=null) {
			q = p;
			// left node
			if (x<p.data) {
				p = p.LeftChild;
			}
			// right node
			else if (x>p.data) {
				p = p.RightChild;
			}
			else return false;
		}
		if(x<q.data) {
			q.LeftChild = temp;
			return true;
		}
		else if(x>q.data) {
			q.RightChild = temp;
			return true;
		}
		return false;
	}

	boolean delete(int x) {
		TreeNode p = root;
		TreeNode q = null;
		int checklr = 0;
		// 최고 조상
		if(p==null) return false;
		while(p!=null) {
			// left node
			if (x<p.data) {
				q = p;
				p = p.LeftChild;
				checklr=0;
			}
			// right node
			else if (x>p.data) {
				q = p;
				p = p.RightChild;
				checklr=1;
			}
			// found data
			else break;
		}
		
//			else {
				//root.data == x
//				if(q==null) {
//					q = p; //root=q
//					if(p.LeftChild != null) {
//						p = p.LeftChild;
//						// new root
//						root = p;
//						// Need to connect p.Children to non-null as LeftChild of new root
//						// Need to connect root(q)'s RightChild to new root(p)'s RightChild
//						if(p.LeftChild != null) {
//							q.LeftChild=p.LeftChild;
//							q = p;
//							p = p.LeftChild;
//							p.RightChild = q.RightChild;
//						}
//						else if(p.RightChild != null) {
//							//Left Node is null
//							q.LeftChild=p.RightChild;
//						}
//						else q.LeftChild=null;
//						q.LeftChild=p.LeftChild;
//						q = p;
//						p = p.LeftChild;
//						p.RightChild = q.RightChild;
//					}
//					else if(p.RightChild != null) {
//						//Left Node is null
//						q.LeftChild=p.RightChild;
//					}
//					else q.LeftChild=null;
//				}
//				while(p.LeftChild == null || p.RightChild == null) {
//					if(checklr==0) {
//						if(p.LeftChild != null) {
//							q.LeftChild=p.LeftChild;
//							q = p;
//							p = p.LeftChild;
//							p.RightChild = q.RightChild;
//						}
//						else if(p.RightChild != null) {
//							//Left Node is null
//							q.LeftChild=p.RightChild;
//						}
//						else q.LeftChild=null;
//					}else {
//						if(p.LeftChild != null) {
//							q.RightChild=p.LeftChild;
//							q = p;
//							p = p.LeftChild;
//							p.RightChild = q.RightChild;
//						}
//						else if(p.RightChild != null) {
//							//Left Node is null
//							q.RightChild = p.RightChild;
//						}
//						else q.RightChild=null;
//					}
//					return true;
//				}
//			};
		}
		return false;
	}

	boolean search(int x) {
		TreeNode p = root;
		TreeNode q = null;
		// 최고 조상
		while(p!=null) {
			q = p;
			// left node
			if (x<p.data) {
				p = p.LeftChild;
			}
			// right node
			else if (x>p.data) {
				p = p.RightChild;
			}
			else return true;
		}
		return false;
	}
}

public class Chap9_Test_BinaryTreeInt {
	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), InorderPrint("순차출력"), Exit("종료");

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
		Scanner stdIn = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
			System.out.print(" : ");
			key = stdIn.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		Tree t = new Tree();
		Menu menu; // 메뉴
		int count = 0;
		int num;
		boolean result;
		do {
			t.inorder();
			System.out.println();
			switch (menu = SelectMenu()) {
			case Add: // 노드 삽입
				System.out.println("The number of items (max 10) = ");
				count = stdIn.nextInt();
				if(count>10) {
					System.out.println("Insert less than 10");
					break;
				}
				int[] input = new int[10];
				for (int ix = 0; ix < count; ix++) {
					input[ix] = rand.nextInt(20);
					System.out.println(input[ix]);
				}
				for (int i = 0; i < count; i++) {
					if (!t.insert(input[i]))
						System.out.println("Insert Duplicated data");
				}
				break;

			case Delete: // 노드 삭제
				System.out.println("삭제할 데이터:: ");
				num = stdIn.nextInt();
				if (t.delete(num))
					System.out.println("삭제 데이터 = " + num + " 성공");
				else
					System.out.println("해당 데이터가 없습니다.");
				;
				break;

			case Search: // 노드 검색
				System.out.println("검색할 데이터:: ");

				num = stdIn.nextInt();
				result = t.search(num);
				if (result)
					System.out.println(" 데이터 = " + num + "존재합니다.");
				else
					System.out.println("해당 데이터가 없습니다.");
				break;

			case InorderPrint: // 전체 노드를 키값의 오름차순으로 표시
				t.inorder();
				System.out.println();
				break;
			}
		} while (menu != Menu.Exit);
	}
}
