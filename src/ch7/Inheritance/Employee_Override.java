package ch7.Inheritance;

public class Employee_Override extends Person_Superclass {//Class생성시 Superclass
	//sub class
	private String dept;
	
	public String getDept() {
		return dept;
}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// Method Override-------------------//
	//부모 클래스와 같은 이름의 메서드 작성시 덮어씌워짐
	//부모 클래스의 메서드를 사용하고 싶을시 super() 호출
	
	@Override 
	//toString ctrl+space (void 함수 안의 경우 안됨)
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+ ":" + dept;
		}

	public void setHeight(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
	