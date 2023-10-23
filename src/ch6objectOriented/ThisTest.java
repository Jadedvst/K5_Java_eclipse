package ch6objectOriented;

public class ThisTest {
	int i=1;//this.i
	
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i+j;
		
		second(4);//실행문
	}
	
	public void second(int i) {
		int j = 5;
		this.i = i+j;
	}
	
	
	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();//F5:Step into debug
		//실행문
	}

}
