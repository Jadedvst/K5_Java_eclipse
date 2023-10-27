package ch6objectOriented;

public class StaticMethod {
	
	// main 을 실행하려면 instance 가 있어야함
	// static 이 있을시 instance 가 필요없기에 main 실행시 static 으로 실행
	public static void main(String[] args) {
		StaticMethod at = new StaticMethod();
		at.noStatic();
	//	noStatic(); Error
		
		yesStatic();
	}
	
	public void noStatic() {
		System.out.println("No Static: for Instance making");
		
		yesStatic();
	}
	
	//Instance 와 무관하게 사용하는 메서드는 Static 선언
	public static void yesStatic() {
		System.out.println("Yes Static: (Class Method) no need for Instance ");
	}//공유되면 안되는 값. 지정값
	

	
}
