package ch5Object.ClassImport;
import ch5Object.Instance.*;
public class ImportArmor {
public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		Armor arm = new Armor(); //객체 생성자
		//new 가 객체 생성, arm이 주소를 지님
		//arm. 을 누르면 목록이 나옴
		
		arm.setHeight(100);//메서드 호출
		arm.setHeight(-20);
		System.out.println("-".repeat(15));
		
		int result = arm.takeOff();
		System.out.println("-".repeat(15));
		
		arm.speedUP(100);
		int speed = arm.getSpeed(); 
		//speed == 로컬변수 즉 여기 speed != class{Armor int speed}
		//애초에 같으면 int 로 다시 선언,정의 할 필요없다
		System.out.println("speed = "+speed);
		System.out.println("-".repeat(15));
		
		System.out.println(arm.height);
		}
}
