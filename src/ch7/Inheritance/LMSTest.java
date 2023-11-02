package ch7.Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cha10CollectionAPI.testArrayList.Person;
import cha10CollectionAPI.testArrayList.Professor;
import cha10CollectionAPI.testArrayList.Student;

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
		p.getHeight(187);
		
		s.setName("빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		System.out.println(e.toString()); //return super.toString() + ":" + dept;//오:47:입학처
		System.out.println(p.toString()); //return subject; //빅데이터
		System.out.println(s.toString()); //return this.getName()+":"+ this.getAge()+":"+major; //빈:20:컴퓨터과학
	
	
		Professor_Subclass p1 = new Professor_Subclass("교수1",40,"자바");
		Person p2 = new Professor("교수2",50,"파이썬");
		Student s1 = new Student("학생",20,"컴공과");
		
		System.out.println(s1.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());


		
	}

}
