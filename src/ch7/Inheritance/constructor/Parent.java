package ch7.Inheritance.constructor;

public class Parent {
	
	private String name;
	
	public Parent() {
		this.name = "parentName";
	}
	
	public Parent(String name) {
		this.name = name;
		System.out.println("Parent(String name)");
	}
	
	
	public String getName() {
		return name;
	}
}
