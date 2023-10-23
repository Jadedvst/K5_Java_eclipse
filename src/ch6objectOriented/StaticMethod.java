package ch6objectOriented;

public class StaticMethod {
	
	
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
