package ch5Object;

public class parameterPassing {
	public static void main(String[] args) {
   
	int f(int x){//밑에서 x값이 parameter passing
    //int: 반환값 타입 지정
	int value;
	value = 2*x*x +4*x+3;
	return value;//Parameter passing
	}
    
    main (){
    	int y;
    	y=f(2);//parameter passing
    	sysout(y);//y 값이 return 
    }
	}
}
