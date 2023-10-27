package ch8Polymorphism;

import java.util.Scanner;
enum Status {
	READY, SEND, COMPLETE, CLOSE// 아래 주석과 같음
}

//class Status {
//	public static final int READY = 1;
//	public static final int SEND = 2;
//	public static final int COMPLETE = 3;
//	public static final int CLOSE = 4;
//}

public class EnumTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int work = 0;
		Status work= null;
		System.out.println("현 상태는?");
		int n =sc.nextInt();
	
		
		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
		default://다른 경우에도 기본적으로
			work = Status.CLOSE;
			break;
		}
		
		System.out.println("현 작업 상태: "+work);
	}
}