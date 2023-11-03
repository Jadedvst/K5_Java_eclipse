package cha11Exceptions;

public class Test02 {

	public static void main(String[] args) {
		try {//(FileInputStream fi = new FileInputStream("a.txt")
			// try문 안 혹은 소괄호 안에선 자동으로 닫아줌
			System.out.println("1");
			System.out.println("2");
			String s = null;
			s.length();
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류 방생");			
		} finally {
			System.out.println("OK");
		}
		System.out.println("4");
	}

}
