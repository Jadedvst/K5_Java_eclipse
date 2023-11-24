package dataStructure.ch3SearchAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData4 {
	String name;
	int height;
	double vision;
	public PhyscData4(String name, int height, double vision) {
		this.name = name; 
		this.height = height; 
		this.vision = vision;
	}
	@Override
	public String toString() {
		return "<" + name + "\t: " + height + ", " + vision + ">";
	}

	//다형성으로 인해 A variable = new A(); 에서 A가 다름, HOC가 Comparator를 implement하기에 가능
	public static final Comparator<PhyscData4> HEIGHT_ORDER = new HeightOrderComparator(); //생성자
/*	//Generics//
	    처리 대상의 자료형에 의존하지 않도록 Class(인터페이스) 구현 기능이다
	
	//HEIGHT_ORDER//
		HeightOrderComparator의 인스턴스를 나타내는 constant field (static final field)
	   (A constant field is a field for which you specify the actual index value that is stored in the database.)
	   
		final 필드는 객체마다 저장되고, 생성자의 매개값을 통해서 여러가지 값을 가질 수 있기 때문에 상수가 될 수 없다.
		The HEIGHT_ORDER field is declared as public static final, making it a constant accessible from outside the class.

	//new HeightOrderComparator()//
		This is the instantiation of the HeightOrderComparator class, creating a new instance of it. 
		The HeightOrderComparator appears to be a separate class that implements the Comparator<PhyscData4> interface.

	
	//Why use Final?//
		1. Immutability: Once assigned, it cannot be reassigned to a different value.
	
		2. Readability and Intent: Using final explicitly communicates the intent that NAME_ORDER is 
			meant to be a constant value representing a specific ordering for PhyscData4 objects.
	
		3. Compiler Optimization: The final keyword can also provide opportunities for compiler optimization.
		It allows the compiler to perform certain optimizations based on the knowledge that the variable's value won't change.
*/
	private static class HeightOrderComparator implements Comparator<PhyscData4>{//Private으로 숨기기 위해서 위에서 따로 호출
		public int compare(PhyscData4 p1, PhyscData4 p2) {
			if(p1.height-p2.height==0)
				if((int) Math.ceil(p1.vision - p2.vision)==0)
					return p1.name.compareTo(p2.name);
				else
					return (int) Math.ceil(p1.vision - p2.vision);
			return p1.height-p2.height;
		}
	}
	
	public static final Comparator<PhyscData4> NAME_ORDER = new NameOrderComparator();
	
	private static class NameOrderComparator implements Comparator<PhyscData4>{//Private으로 숨기기 위해서 위에서 따로 호출
		public int compare(PhyscData4 p1, PhyscData4 p2) {
			if(p1.name.compareTo(p2.name)==0)
				if(p1.height-p2.height==0)
					return (int) Math.ceil(p1.vision - p2.vision);
				else
					return p1.height-p2.height;
			return p1.name.compareTo(p2.name);
		}
	}
}

public class Test3_8ObjectFinalComparator {
	public static void main(String[] args) {
		PhyscData4[] data = {
				new PhyscData4("홍길동", 162, 0.3),
				new PhyscData4("홍동", 164, 1.3),
				new PhyscData4("홍길", 152, 0.7),
				new PhyscData4("김홍길동", 172, 0.3),
				new PhyscData4("길동", 182, 0.6),
				new PhyscData4("길동", 167, 0.2),
				new PhyscData4("길동", 167, 0.5),
		};
		System.out.println("=".repeat(5)+"Original"+"=".repeat(5));
		showData(data);
		System.out.println("=".repeat(5)+"OrderbyHEIGHT"+"=".repeat(5));
		Arrays.sort(data, PhyscData4.HEIGHT_ORDER);
		showData(data);
		PhyscData4 key = new PhyscData4("길동", 167, 0.2);
		int idx = Arrays.binarySearch(data, key, PhyscData4.HEIGHT_ORDER);
//		int idx = Arrays.binarySearch(T[]a, T key, Comparator<?super T> HEIGHT_ORDER);
		//HEIGHT_ORDER가 
		System.out.println("\nArrays.binarySearch(): result = " + idx+"\n");
		
		System.out.println("=".repeat(5)+"OrderbyNAME"+"=".repeat(5));
		Arrays.sort(data, PhyscData4.NAME_ORDER);
		showData(data);
		int ndx = Arrays.binarySearch(data, key, PhyscData4.NAME_ORDER);//
		System.out.println("\nArrays.binarySearch(): result = " + ndx+"\n");
		
	}
	static void showData(PhyscData4[]arr) {
		System.out.println();
		for (PhyscData4 pp: arr) {
			System.out.println(pp+" ");
		}
		System.out.println();
	}
}
