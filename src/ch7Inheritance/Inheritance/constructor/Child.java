package ch7Inheritance.Inheritance.constructor;

public class Child extends Parent{
	
	public Child() {
		// 부모의 생성자가 먼저 실행 후, 자손의 생성자 실행
		// 생략가능함
		super();
		// 부모가 여러개의 생성자가 있을 때 기본 생성자를 생략 할 경우
		// 자손의 기본 생성자도 에러, 그럴 경우에는 super("~") 이렇게 사용
//		super("지여니");
	}
	
	public Child(String name) {
		// 부모 타입으로 이동, 생략하면 기본 생성자가 실행됨
		super(name);
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
