package cha10CollectionAPI.list.testArrayList;

public class Professor extends Person {//Class생성시 Superclass
	//sub class
	private String subject;
	
	public Professor(String name, int age, String subject) {
		//부모 클래스의 생성자
		super(name,age);//부모 클래스에 name과 age를 세팅
		this.subject =subject;
		

	}

	public String getSubject() {
		return subject;
}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	@Override
	public String toString() {
		return super.toString()+":"+subject;

	}
}
	