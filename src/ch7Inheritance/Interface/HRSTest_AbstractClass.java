package ch7Inheritance.Interface;

//-------------------------------------------------------//
public class HRSTest_AbstractClass {
	//HRSTest
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
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
	public void calcSalary() {
	System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
	System.out.println("Salesman 급여 = 기본급 * 12 * 4");
	}
}
	
class Consultant extends Employee {
	public void calcSalary() {
	System.out.println("Salesman 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
	System.out.println("Salesman 급여 = 기본급 * 12 * 2");
	}
}

	
abstract class Manager extends Employee {//calcBonus를 구현하지 않아서
	public void calcSalary() {
	System.out.println("Salesman 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager {
	 //extends Employee 일 경우 calcSalary 가 없어서 abstract로 바꾸라는 에러가 뜸
	public void calcBonus() {
	System.out.println("Salesman 급여 = 기본급 * 12 * 6");
	}
}



