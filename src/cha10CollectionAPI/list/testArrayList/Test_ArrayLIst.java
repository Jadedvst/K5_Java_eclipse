package cha10CollectionAPI.list.testArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test_ArrayLIst {

	public static void main(String[] args) {
		
		//Listinstance에 학생, 교수 데이터를 하나의 리스트에 올 저장
		// Person{(name,age){Professor(subject),Student(subject)}}
		Random rd = new Random();
		List<Person> list = new ArrayList<>();
		
		Person p1 = new Professor("교수1",40,"자바");
		list.add(p1);
		
		Person p2 = new Professor("교수2",50,"파이썬");
		list.add(p2);
		
		for (int i =1; i<=10; i++) {
			Student s = new Student("학생"+i,rd.nextInt(20,30),"컴공과");
			list.add(s);
		}
		list.forEach(p->{
			System.out.println(p);
		});
		}

	}


