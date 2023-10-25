package ch5Class;
import ch5Instance.*;
public class classImport {
public static void main(String[] args) {
		Armor arm = new Armor(); //객체 생성자
		//new 가 객체 생성, arm이 주소를 지님
		//arm. 을 누르면 목록이 나옴
		
		arm.setHeight(100);//메서드 호출
		arm.setHeight(0);
		int result = arm.takeOff();
		
		System.out.println("result = "+result);
		arm.speedUP(100);
		int speed = arm.getSpeed();
		System.out.println("speed = "+speed);
		
		}
}
