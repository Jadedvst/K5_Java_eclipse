package ch2Data;

public class andOr {

	public static void main(String[] args) {
		//OR: 앞의 구문이 true 일 경우 바로 true 배출
		System.out.println((1<2) | (1>3));
		
		//OR: 앞의 구문과 뒤의 구문 둘 다 true 여야 true 
		System.out.println((1<2) || (1>3));//따라서 뒤가 dead code
		
		//AND: 앞의 구문이 False 일 경우 바로 false 배출
		System.out.println((1<2) & (1>3));
		
		//AND: 앞의 구문과 뒤의 구문 둘 다 false 여야 false
		System.out.println((1<2) && (1>3));

	}

}
