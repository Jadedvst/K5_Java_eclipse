package ch7.Inheritance;

public class Student_Modifier extends Person_Superclass {//Class생성시 Superclass
	//sub class
	private String major;
	
	public String getMajor() {
		return major;
}

	public void setMajor(String major) {
		this.major = major;
	}
	
	// Method Override-------------------//
	public String toString() {
		
//		return name + ":"+ age + major; Error due to  접근제한자(private)
		return this.getName()+":"+ this.getAge()+":"+major;//getName은 public

	}
}
	

	