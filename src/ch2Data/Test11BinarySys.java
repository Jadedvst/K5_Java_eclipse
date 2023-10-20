package ch2Data;

public class Test11BinarySys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0b00010100; // 2진수로 표현시 0b
		int b = 0b11111111111111111111111111101011;
		int c = 0b11111111111111111111111111101100;
		int cnegop = (~a) + 1;
		System.out.println(a);// 10진수로 출력
		System.out.println(b);
		System.out.println(c);
		System.out.println(cnegop);

		int d = 017; // 8진법
		int e = 026;
		int f = 0xf; // 16진법
		System.out.println(d + " " + e + " " + f);
	}

}
