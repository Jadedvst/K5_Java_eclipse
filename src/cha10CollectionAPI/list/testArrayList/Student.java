package cha10CollectionAPI.list.testArrayList;

public class Student extends Person {//Class생성시 Superclass
	//sub class
	private String major;
	
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}

	public String getMajor() {
		return major;
}

	public void setMajor(String major) {
		this.major = major;
	}
	
	// Method Override-------------------//
	public String toString() {
		
//		return name + ":"+ age + major; Error due to  접근제한자(private)
		return super.toString()+":"+major;//getName은 public

	}
}
	

	