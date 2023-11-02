package ch7.Inheritance;

public class Professor_Subclass extends Person_Superclass {//Class생성시 Superclass
	//sub class
	private String subject;
	
	
	public Professor_Subclass(String name, int age, String subject) {
		super(name,age);//부모 클래스에 name과 age를 세팅
		this.subject =subject;
		

	}
	public String getSubject() {
		return subject;
}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
//	public String getHeight(String height) {
//		super(height) = height;
//	}
	public void setName(String name) {
		
	}
	
	// Method Override-------------------//
	public String toString() {
	

		return subject;

	}
}
	