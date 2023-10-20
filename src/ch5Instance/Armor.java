package ch5Instance;

//Class
public class Armor {
	
	//Field//////////////////////////////
	String name;
	public int height; // public,private:접근 제한자 access modifier
	public int weight;
	private int speed;
	String color;
	boolean isFly;
	 
	//Method : 함수 ///////////////////////
	
	public void setName(int value) {
		String value = "홍";
		name = value;
	}
	//parameter(int value)가 다르면 다른 함수 취급
	//==Method overloading//: 총 함수 종류 줄이기위함,변수만 바꿈
	public void setName() {
		String value = "홍";
		name = value;
	}
	//-----------------------------------------
	public void setHeight(int value) {
		if (value >0) {
			height = value;
			System.out.println("height = "+height);
		}
		else 
			System.out.println("잘못된입력입니다.");
	}
	//-------------------------------------------
	public void speedUP(int value) {//value 값을 받는다
		speed += value;
		System.out.println("정수 스피드 증가");
	}
	public void speedUP(double value) {//value 값을 받는다
		speed += value;
		System.out.println("실수 스피드 증가");
	}
	public int getSpeed() {
		return speed;//speed 값을 내보낸다(돌려준다)
	}
	
	//----------------------------------------------
		
	public int takeOff() {//default상태일때는 타Class에서 사용 불가
		System.out.println("비행하다");
		System.out.println("아이언맨");
		return 0;//위치에 따라 unreachable
	}

	void land() {}
	void shootLaser() {}
	void launchMissile() {}
}

