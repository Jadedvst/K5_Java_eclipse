package ch8Polymorphism;

//-------------------------------------------------------//
public class HRSTest_Object {
	//HRSTest
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		if(s.equals(c)) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		Salesman s2 =s;
		Employee s3 = s; //부모 클래스여서 인스턴스 생성 가능
		Object o1 = s;	// 참조변수의 타입은 언제나 자기자신 혹은 부모, 조상격 클래스만 가능
						// b/c heap 영역에 조상, 부모, 자기자신의 인스턴스가 생성되었기 때문
		Object o2 = c;	//자식격에만 할당가능
		Employee e1 = d;
		
		//Director d1 = s;//ERROR: cannot convert from Salesman to Director
		//Manager m = new Manager();//abstract 이여서 instance 생성 불가
		
		
		System.out.println(s.toString());
		
		if(s.equals(s2)) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		if(s.equals(s3)) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		if(s.equals(o1)) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		
//		s.calcBonus();
//		c.calcBonus();
//		d.calcBonus();
	}
}
//-------------------------------------------------------//

abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}


class Salesman extends Employee {
	
	int annual_sales;//연간 판매 실적
	
	public void calcSalary() {
	System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
	System.out.println("Salesman 급여 = 기본급 * 12 * 4");
	}
	
	@Override
	public String toString() {
		return "toString overriding,"+super.toString();
	}
}
	
class Consultant extends Employee {
	
	int num_project;
	
	public void calcSalary() {
	System.out.println("Salesman 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
	System.out.println("Salesman 급여 = 기본급 * 12 * 2");
	}
}

class Manager extends Employee {//calcBonus를 구현하지 않아서
	int num_team;
	
	public void calcSalary() {
	System.out.println("Salesman 급여 = 기본급 + 팀 성과 수당");
	}

	@Override
	public void calcBonus() {
	System.out.println("Manager Edited");
	}
	// TODO Auto-generated method stub
	
}


class Director extends Manager {
	 //extends Employee 일 경우 calcSalary 가 없어서 abstract로 바꾸라는 에러가 뜸
	public void calcBonus() {
	System.out.println("Salesman 급여 = 기본급 * 12 * 6");
	}
}



