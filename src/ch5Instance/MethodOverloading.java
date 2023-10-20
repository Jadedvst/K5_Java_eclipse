package ch5Instance;

//Class
public class MethodOverloading {
	
	String name;
	public int height; 
	public int weight;
	private int speed;
	private double dbspeed;
	String color;
	boolean isFly;
	 
	public void show() {//?
		System.out.println(speed);//정수
		System.out.println(name);//문자열
		System.out.println(height);//정수
	}
	
	//==Method overloading//: 총 함수 종류 줄이기위함,변수만 바꿈
		//parameter(int value)가 다르면 다른 함수 취급
		//이름, 매개변수 개수, 타입 등이 모두 같으면 매개변수 이름이 달라도 오류발생
	public void setName(int value) {
		String value = "홍";
		name = value;
	}

	public void setName() {
		String value = "홍";
		name = value;
	}
	//////////////////////////
	public void speedUP(int value) {//value 값을 받는다
		speed += value;
		System.out.println("정수 스피드 증가");
		System.out.println("speed = "+speed);
	}
	public void speedUP(double value) {//value 값을 받는다
		dbspeed += value;
		System.out.println("실수 스피드 증가");
		System.out.println("speed = "+dbspeed);
	}
}