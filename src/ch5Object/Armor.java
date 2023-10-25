package ch5Object;


//Class
public class Armor {
	
	//Field
	private String name;
	private int height; // public,private:접근 제한자 access modifier
	private int weight;
	String color;
	boolean isFly;

	
	//Method : 함수 이름
	void takeOff() {}
	void land() {}
	void shootLaser() {}
	void launchMissile() {}
	
	public static int f(int x){//밑에서 x값이 parameter passing
    //int: 반환값 타입 지정
	int value;
	value = 2*x*x +4*x+5;
	return value;//Parameter passing
	}
    
	// 함수, 즉 Method를 실행하는 부분
	public static void main(String[] args) {
    	int y;
    	y=f(2);//parameter passing
    	System.out.println("y = "+y);//y 값이 return 
    }
	
}

