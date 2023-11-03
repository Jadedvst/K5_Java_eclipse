package cha11Exceptions.customException;

public class Test05_testCustom {
	
	int battery =0;
	
	public void charge(int time) {
		
		if (time<0) {
			time = 0;
			try {
			throw new NegativeNumberException();//예외 강제발생
			} catch(NegativeNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		battery += time;
		System.out.println("현재 배터리 : "+battery);
	}


	public static void main(String[] args) {
		Test05_testCustom test = new Test05_testCustom();
		test.charge(30);
		test.charge(20);
		test.charge(-10);

	}

}
