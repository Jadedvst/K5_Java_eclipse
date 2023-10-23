package ch5Instance;

import java.util.Date;

class Sub{//한 곳에서는 하나의 클래스만 퍼블릭이여야함
	private String name;
	public int age;
	
	private int sum() {return 0;}
	public int avg() {return 0;}
}
public class Test40Review {

	public static void main(String[] args) {
		Sub s = new Sub();
		
		Date d = new Date();//높은 확률로 import util
	}

}
