package ch6objectOriented;

public class Stack {

	public static void main(String[] args) {
		int a =100;
		{
			int c=200;//stack 에 저장
		}//{}를 벗어나면 stack 에서 삭제
		a = null;
		System.out.println(c); //즉, c는 존재하지 않는값
		System.out.println(a); //null: 존재하지 않는 값

	}

}
