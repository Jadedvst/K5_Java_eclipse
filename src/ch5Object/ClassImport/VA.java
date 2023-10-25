package ch5.ClassImport;
import ch5Object.Instance.*;
public class VA {
public static void main(String[] args) {
		
		VariableArguments mo = new VariableArguments();
		Armor arm = new Armor(); //객체 생성자
		//new 가 객체 생성, arm이 주소를 지님
		//arm. 을 누르면 목록이 나옴
	
		mo.test(1,2);
		mo.test(1,2,3);
}	
}
