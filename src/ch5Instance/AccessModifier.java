package ch5Instance;

public class AccessModifier {
	// == 접근 제한자

	//// 패키지(folder,directory)
	String name;
	public int height; // 공용, 조건없음
	private int weight; // 같은 클래스
	String color; // (default) 같은 패키지
	protected boolean isFly;
	/* 같은 패키지 상속관계 (inheritance)
      (O)student is a person
      (X)person is a student
	*/
	
	//////////// 외부파일//////////
	public static void main(String[] args) {
		Armor arm = new Armor();
		// Armor 에서 private 인 경우,Error

		arm.name = "홍";
		arm.weight = 10;// public
		arm.color = "red";// default
		System.out.println(arm.name + arm.weight);
		System.out.println(arm.color);
	}
}
