package ch7.Inheritance;

public class LMSTest {

	public static void main(String[] args) {
		Employee_Override e =new Employee_Override();
		Professor_Subclass p = new Professor_Subclass();
		Student_Modifier s = new Student_Modifier();
		
		e.setName("오");
		e.setAge(47);
		e.setDept("입학처");
		e.setHeight(187);
		
		p.setName("김");
		p.setAge(52);
		p.setSubject("빅데이터");
		p.setHeight(187);
		
		s.setName("빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		System.out.println(e.toString()); //return super.toString() + ":" + dept;//오:47:입학처
		System.out.println(p.toString()); //return subject; //빅데이터
		System.out.println(s.toString()); //return this.getName()+":"+ this.getAge()+":"+major; //빈:20:컴퓨터과학
	}

}
