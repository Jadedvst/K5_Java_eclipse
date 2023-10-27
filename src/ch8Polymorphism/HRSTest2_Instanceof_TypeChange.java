package ch8Polymorphism;

public class HRSTest2_Instanceof_TypeChange {

	public static void calcTax(Object e) {
		if(e instanceof Salesman) {
			System.out.println("Salesman 입니다."+"\n");
			System.out.println(((Salesman)e).annual_sales);//TypeChange
		}else if(e instanceof Manager) {
			System.out.println("Manager 입니다."+"\n");
			System.out.println(((Manager)e).num_team);
		}else if(e instanceof Consultant) {
			System.out.println("Consultant 입니다."+"\n");
			System.out.println(((Consultant)e).num_project);
		}else {
			System.out.println("Employee 입니다.");
		}
	}



	public static void main(String[] args) {
		
		Object s = new Salesman();
		Object m = new Manager();
		Object c = new Consultant();
		
		
		calcTax(s);
		calcTax(m);
		calcTax(c);

	}
}