package ch7Inheritance.Inheritance.test;

public class Child extends Parent {
	public Child() {
		System.out.println("Child()");
	}
	
	public Child(String name) {
		super(name); //생성자에서만 가능
		System.out.println("Child(String name)");
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
