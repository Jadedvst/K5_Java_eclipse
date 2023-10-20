package ch5ClassImport;
import ch5Instance.*;//패키지의 모든 파일 import
public class MO {
public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		
		mo.speedUP(71.34);
		//speed = mo.speedUP(100);
		//System.out.println("speed = "+speed);
		//변수 종류가 여러개일떄는 function에서 선언,정의 ex)sysout
	
		}
}
