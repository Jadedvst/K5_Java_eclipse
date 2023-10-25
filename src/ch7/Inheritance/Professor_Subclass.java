package ch7.Inheritance;

public class Professor_Subclass extends Person_Superclass {//Class생성시 Superclass
	//sub class
	private String subject;
	
	public String getSubject() {
		return subject;
}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getHeight(String height) {
		super(height) = height;
	}
	public void setName(String name) {
		
	}
	
	// Method Override-------------------//
	public String toString() {
	

		return subject;

	}
}
	