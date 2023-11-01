package ch9API;

public class Test12_Autoboxing {

	public static void main(String[] args) {
		int n1 = 10;
		Integer obj1 = n1; //Autoboxing: Integer.Valueof(n1)
		
		Integer obj2 = Integer.valueOf("20");
		int n2 = obj2; //obj2.intValue()

		Integer obj3 = 30; //new Integer(30)
		
		int n3 = obj3 +40;
		
		int n4 = Integer.parseInt("-123"); //.parseInt: int 로 바꿈
		//String 비교의 경우 "9">"21": 9와 null 이므로 9 와 2를 비교
		//int 비교의 경우	   9 < 21
		
		System.out.println(n1+":"+obj1);
		System.out.println(obj2+":"+n2);
		System.out.println(n3);
		System.out.println(n4);
		

	}

}
