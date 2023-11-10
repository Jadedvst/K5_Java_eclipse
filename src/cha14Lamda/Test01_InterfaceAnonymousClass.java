package cha14Lamda;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass1의 객체");
	}
}

class MyClass2 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass2의 객체");
	}
}

public class Test01_InterfaceAnonymousClass{
	public static void main(String[] args) {
		
		
		//방법 1: implements Keyword로 클래스 선언
		MyClass1 myc1 = new MyClass1();
		MyClass2 myc2 = new MyClass2();
		myc1.print();
		myc2.print();
		
		//방법 2: 익명클래스(객체) 사용, 익명클래스에 대한 생성자를 돌림(클래스,객체 둘다 생성)
		//		 프로그램에서 일시적으로 한번만 사용되고 버려지는 객체를 위한 클래스 생성
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명클래스 사용");
			}
		};//instance 생성시 ;필요:치환문이기에 한문장에 끝나는것으로 봄
		mi.print();
		
		//방법 3: 익명클래스를 선언,생성,호출 한번에
		//		 선언하는 변수가 없어서 한번만 사용가능
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언,생성,호출을 한번에");
			}
		}).print();
		
		//방법 4: 매개변수
		test(myc1);//MyInterface를 implement 하고 있어서 myc1 타입을 MyInterface으로 사용가능
		test(mi);
		
		//방법 5: 리턴타입
		MyInterface mir2 = test2();
		mir2.print();
		
		//방법6: 람다 함수(익명함수), test3와 같은 
		MyInterface mir3 = test3();
		mir3.print();
		MyInterface ml = ()->System.out.println("hello");
		ml.print();
	}
	//방법 4: 함수 매개변수
	static void test(MyInterface mi) {//함수 매개변수의 타입이 인터페이스
		System.out.println("함수에서 메서드 호출");
		mi.print();
	}
	//방법 5:
	static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("메소드의 리턴 값이 인터페이스 객체");
			}
		};
		return mi;
	}
	
	static MyInterface test3() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("hillo");
			}
		};
		return mi;
	}
}