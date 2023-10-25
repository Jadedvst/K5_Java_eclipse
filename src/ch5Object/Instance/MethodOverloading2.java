package ch5Instance;
public class MethodOverloading2 {

//==Method overloading//: 총 함수 종류 줄이기위함,변수만 바꿈
	//parameter(int value)가 다르면 다른 함수 취급
	//이름, 매개변수 개수, 타입 등이 모두 같으면 매개변수 이름이 달라도 오류발생
	public void test(int... v) {
		System.out.println("tset(int...v)호출");
		for (int x: v) {
			System.out.println(" "+ x);
		}
	}
	
	void land() {}
	void shootLaser() {}
	void launchMissile() {}
}

