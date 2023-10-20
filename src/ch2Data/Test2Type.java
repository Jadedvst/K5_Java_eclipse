package ch2Data;

public class Test2Type {

	public static void main(String[] args) { 
	
	byte num1=127;
	short num2=767;
	int depositAmount=21457657;
	long num3 = 45769998;
	System.out.println(num3-num1*num2);
	
	double pi = 3.14;
	float pif = 3.14F;//코드에서 실수 3.14는 double로 해석:default로 해석
	
	System.out.println(pi-pif);
	
	boolean isMarried = true;
	char gender = 'F';
	gender = 'M';
	String greet = "good morning"; //greet가 참조변수이다
	// String: not keyword, Java built-in class library
	System.out.println(pi +"\n"+ isMarried +"\t"+ gender + greet);
//	\n 다음줄, \t tab
}

}
