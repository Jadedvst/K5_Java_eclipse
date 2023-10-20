package ch2Data;

public class Test15TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////삼함 연산자////////////////////
		char c = 'F';
		String gender = (c == 'F') ? "여자":"남자";
		System.out.println(gender);
		
		int currentHour = 5;
		String time = (currentHour >= 6) ? "end!":"not yet";
		System.out.println(time);
	}

}
