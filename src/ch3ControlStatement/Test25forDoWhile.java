package ch3ControlStatement;

public class Test25forDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int d = 5;
		for (int i = 0; i < 5; i++) {
			System.out.println(i+"f: a=" + a);
			a += d;
		}
		System.out.println("-".repeat(15));
		
		int j=0;
		while(j<5) {
			System.out.println(j+"w: a=" + a);
			a +=d;
			j++;
		}
		
		int k=0;
		do {
			System.out.println(k+"dw: a=" + a);
			a+=d;
			k++;
		}while(k<5);
	}

}
