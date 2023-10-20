package ch5Instance;

public class parameterPassing {
	
   
	public static int f(int x){//밑에서 x값이 parameter passing
				//int: 반환값(return)의 타입 지정
	int value;
	value = 2*x*x +4*x+3;
	return value;//Parameter passing
	}
    
	public static void main(String[] args) {
    	int y;
    	y=f(2);//parameter passing
    	System.out.println("y = "+y);//y 값이 return 
    }
}
