package ch5Object;

public class AccessModifier {
//////////접근 제한자 access modifier//////////
	
	String name; //(default) 같은 패키지
	public int height; // 공용, 조건없음
	private int weight; //같은 클래스
	String color; //(default) 같은 패키지
	protected boolean isFly; // 같은 패키지 상속관계
	
	//Method : 함수 이름
		void takeOff() {
			System.out.println();
		}
		void land() {}
		void shootLaser() {}
		void launchMissile() {}
	
	////////////외부파일//////////	
		public static void main(String[] args) {
			Armor arm = new Armor();
			//Armor 에서 private 인 경우,Error
			arm.name = "홍";
			System.out.println(arm.name);
		}
}
