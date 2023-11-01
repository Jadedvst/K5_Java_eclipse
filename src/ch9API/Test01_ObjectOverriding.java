package ch9API;

public class Test01_ObjectOverriding {

	public static void main(String[] args) {
		String s = new String("kim");
		String s1 = new String("Hong");
		
		//객체 마다 고유의 해시코드 출력
		Object obj1 = new Object();
		System.out.println(obj1.hashCode());
		System.out.println(Integer.toHexString(obj1.hashCode()));
		Object obj2 = new Object();
		System.out.println(obj2.hashCode());
		
		//.equals
		if(obj1.equals(obj2)) 
			System.out.println("길다");
		else
			System.out.println("다르다");
		if(obj1 == obj2)
			System.out.println("==");
		else
			System.out.println("!=");
		
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
		//p401. 
		System.out.println(obj1.toString());
		
		//Overriding
		MyObject obj4 = new MyObject();
		System.out.println(obj4.toString());
		
		//정수 실수는 클래스에 정의되어있어서 비교가능???????
		if (s.compareTo(s1)<0)
			System.out.println();
	}

}
