package ch7.Inheritance;

public class Person_Superclass {//Superclass
	
	//Private Field
	private String name;
	private int age;

	//Public Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Method Overriding//
	public String toString() {
		//모든 클래스가 toString()을 다 가지고 있음
		//B/c 모든 클래스가 Class Object와 상속관계 (extend Object)
		return name + ":"+ age;
	}

}
