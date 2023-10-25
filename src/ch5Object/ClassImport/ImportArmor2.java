package ch5_2ClassImport;
import ch5Instance.*;//패키지의 모든 파일 import
public class ImportArmor2 {
public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		Armor arm = new Armor(); //객체 생성자
		//new 가 객체 생성, arm이 주소를 지님
		//arm. 을 누르면 목록이 나옴
	
		mo.test(null);
}	
}
