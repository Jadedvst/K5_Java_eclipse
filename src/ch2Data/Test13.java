package ch2Data;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0b00010001;
		byte b = 0b00100010;
		int b1 = 0b11111111;
//?byte 와 int?
		System.out.println(a);
		
		int c = a & b; // 0
		int c1 = b &b1; //100010
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(c1));

		int d = a | b; // 110011
		System.out.println(Integer.toBinaryString(d));

		int e = a ^ b; // 110011
		System.out.println(Integer.toBinaryString(e));
		
		int f = 12; 
		int g = (~f)+1;//~:one's complement
		System.out.println((g));
		
		int h = f << 1; //24 1100 을 11000
		int i = f >> 1; //6  1100 을 110
		System.out.println(h);
		System.out.println(i);
	}

}
