package dataStructure.ch4StackandQueue;

/*
 * 교재에 있는 소스코드
 * 입력하여 실행 실습
 * 정수형 스택 소스 코드
 */

import java.util.Scanner;

public class Test4_2IntStack {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(4); // 최대 64 개를 푸시할 수 있는 스택
		int menuNum = 0;
		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			
			if(menuNum==0) {
				System.out.print("(1)push　(2)pop　(3)peek　(4)dump (5)indexOf (6)clear stack (9)NEXT MENU (0)종료: ");
				int menu = stdIn.nextInt();
				if (menu == 0)
					break;
				int x;
				switch (menu) {

				case 1: // 푸시
					System.out.print("데이터: ");
					x = stdIn.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;

				case 2: // 팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;

				case 3: // 피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;

				case 4: // 덤프
					s.dump();
					break;
					
				case 5: // 인덱스 찾기
					System.out.print("찾는 값: ");
					x = stdIn.nextInt();
					int idx=s.indexOf(x);
					System.out.println("찾는 값의 인덱스: "+idx);
					break;
				case 6:
					s.clear();
					System.out.println("스택이 비었습니다");
					break;
				case 9:
					menuNum+=1;
					break;
				}
			}
			if(menuNum==1) {
				System.out.print("(1)PREVIOUS MENU　(2)getCapcity　(3)size of data　(4)isEmpty (5)isFull (0)종료: ");
				int menu = stdIn.nextInt();
				if (menu == 0)
					break;				
				switch(menu) {
				
				case 1:
					menuNum-=1;
					break;
				case 2:
					System.out.println(s.getCapacity());
					break;
				case 3:
					System.out.println(s.size());
					break;
				case 4:
					System.out.println(s.isEmpty());
					break;
				case 5:
					System.out.println(s.isFull());
					break;
				
				}
			}	
		}
	}
}