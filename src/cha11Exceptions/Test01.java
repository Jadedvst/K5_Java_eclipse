package cha11Exceptions;

public class Test01 {

	public static void main(String[] args) {

		try {
		int arr[]=new int[3];
		//0,1,2
		arr[3]=30;
		System.out.println("OK");
		//Exception e 가 최고티어
		//굳이 구체적으로 나누고 싶을시 아래처럼 사용
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("잘못된 인덱스 사용!");
		}
		System.out.println("Good");
	}

}
