package cha14Lamda;

interface Multiply{
	double getValue();
}
public class Test02_Lamda {
	//람다는 그래서 메서드가 하나만을 가질 수 있음
	//따라서 람다만을 위한 인터페이스를 함수형 인터페이스라 칭한다
	public static void main(String[] args) {
		Multiply m;
		m=()->3.14*2;
		System.out.println(m.getValue());

	}

}
