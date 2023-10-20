package ch3ControlStatement;

//Annotiation: 정보알림 , @override
//한줄 주석
/*
 * 여러줄 주석
 * 단축키 사용에 의한 주석 처리
 * ctrl shift /
 */
public class Test1if {
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int score = 90;
		int bonus;
		
		String result = "";
		if (score > 100) {
			bonus = 10;
		}else if (score<200) {
			//(100<score & score <200)
			bonus = 20;
		}else
			bonus = 30;
		score += bonus;
		
		System.out.println();
	}

}
