package cha10CollectionAPI.testArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test_Default {

	public static void main(String[] args) {
		
		//Listinstance에 학생, 교수 데이터를 하나의 리스트에 올 저장
		// Person{(name,age){Professor(subject),Student(subject)}}
		Random rd = new Random();
		List<Person> list = new ArrayList<>();
		
		Professor p1 = new Professor();
		p1.setName("홍길동");
		p1.setAge(40);
		p1.setSubject("물리");
		list.add(p1);
		
		Professor p2 = new Professor();
		p2.setName("홍이동");
		p2.setAge(50);
		p2.setSubject("Engineering Mathmatics");
		list.add(p2);
		
		for (int i =1; i<=10; i++) {
			Student s = new Student();
			s.setName("학생"+i);
			s.setAge(rd.nextInt(20,30));
			s.setMajor("컴공과");
			list.add(s);
		}
		list.forEach(p->{
			System.out.println(p);
		});
		}

	}


