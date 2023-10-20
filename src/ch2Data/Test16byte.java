package ch2Data;

public class Test16byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 23;
		int b = a; // Implicit type change
		System.out.println(b); //23
		
		byte c= 23; short d= 47; int e =65;
		int f = c + d + e;
		System.out.println(f);
		
		int g = 23;
		byte h = (byte) g; //explicit type casting, implicit impossible
		System.out.println(h);
		
		byte i = 10;
		byte j = 20;
		byte k = (byte)(i+j);
		System.out.println(k);//30
	}

}
