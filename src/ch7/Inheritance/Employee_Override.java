package ch7.Inheritance;

public class Employee_Subclass extends Person_Superclass {//Class생성시 Superclass
	//sub class
	private String dept;
	
	public String getDept() {
		return dept;
}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// Method Override-------------------//
	
	@Override 
	//toString ctrl+space (void 함수 안의 경우 안됨)
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+ ":" + dept;
		}
	
}
	