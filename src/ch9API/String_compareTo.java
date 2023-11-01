package ch9API;

public class String_compareTo {

	public static void main(String[] args) {
		String n1 = new String("9");
		String n2 = new String("29");
		
		if (n1.compareTo(n2)<0)//neg if n1<n2
			System.out.println("'"+n1+"'"+ "<"+"'"+ n2 +"'");
		else				   //pos if n1>n2
			System.out.println("'"+n1+"'"+ ">"+"'"+ n2 +"'");

	}

}
