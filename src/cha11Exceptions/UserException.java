package cha11Exceptions;

public class UserException {
	
	public void d() {
		throw new IndexOutOfBoundsException("에러가 강제로 발생했습니다.");
		
		int aa = 0; //Exception 이 터지면 실행되지 않아서 ERROR
	}
	
	public void c()  throws Exception{//try-catch 책임 넘기기!
		System.out.println("C1");
		int v = 10/0;
		System.out.println("C2");
	}
	public void b() throws Exception {
		System.out.println("B1");
		c();
	
		System.out.println("No catch Exception");

		System.out.println("B2");
	}
	public void a() {
		System.out.println("A1");
		try {
			b();
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
			e.printStackTrace();//에러가 생긴 곳을 print
		}
		System.out.println("A2");
		
	}
	public static void main(String[] args)  {
		//예외 객체를 자신을 호출한곳에 던지기
		Test04_throws th = new Test04_throws();
		th.a();
		
		//A1 B1 C1 Exception: / by zero A2
		
		System.out.println("Sleepfor 3sec");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
	
		}//3000 Milisec측 3초동안 sleep
		
		System.out.println("Fin");
		
	}

}

