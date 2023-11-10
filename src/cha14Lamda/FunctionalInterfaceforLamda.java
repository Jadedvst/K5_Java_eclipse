package cha14Lamda;

interface Something{
	public void print(); 
}
public class FunctionalInterfaceforLamda {
	public static void main(String[] args) {
	(new Something() {
		@Override
		public void print() {
			System.out.println("흠");
		}
	}).print();
	
	Something lam = ()->System.out.println("람다식 그럼 메서드가 여러개일떈?");
	lam.print();//람다는 그래서 메서드가 하나만을 가질 수 있음
				//따라서 람다만을 위한 인터페이스를 함수형 인터페이스라 칭한다
}
}