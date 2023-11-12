package ch2Data;

public class Test5 {

	public static void main(String[] args) {

		/////////// 증감 연산자///////////////////
		int A1 = 10;
		int A2 = 10;
		// A1++ == A1+=1
		int A3 = A1++ + --A2; // a++ 연산 후 정산,++a 정산 후 연산
		System.out.println(A3);
		System.out.println("A1 =" + A1 + " A2 =" + A2);
		System.out.println(A1 == A2);// 논리 연산자

		/////////// AND/////OR////////////////
		char gender = 'M';
		int balance = 100;
		System.out.println(gender == 'F' && balance > 10);
		System.out.println(gender == 'F' & balance++ > 10);
		// &&: 첫번째항이 거짓일시 종료
		// &: 모든 항을 체크. 즉 실행 됨으로 a++ 도 적용가능
		System.out.println(!(gender != 'F') || balance++ > 10);
	}

}
