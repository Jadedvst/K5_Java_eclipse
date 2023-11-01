package ch9API;

public class Test02_equalsIgnoreCase {

	public static void main(String[] args) {
		
		
		
		String s1 = new String("java");
		String s2 = "java"; 
		//main program 의 변수로 선언 !=field 변수,main내에 있으므로 Main의 변수
		
		String s3 = new String("java");
		String s4 = "java";
		
		String s5="JAVA";
		
		//------------------------------------------------------------//
		System.out.println("------------------------------------------------");
		//the '==' operator matches the references.
		//Since in this example there are 2 elements s1 and s2 and
		//as they have different references/addresses so the output of is s1==s2 will be false. 
		if(s1==s2) {
			System.out.println("동일 문자열을 가집니다.");
			System.out.println(s1+s2);
		}else{
			System.out.println("다른 문자열을 가집니다.");
			System.out.println(s1.toString()+s2.toString());
		}
		//	But if you use 'equals()' the output will be true as the values will be compared
		//and as per the question the values are same. 
		if(s1.equals(s2)) {
			System.out.println("동일 문자열을 가집니다.");
			System.out.println(s1+s2);
		}else {
			System.out.println("다른 문자열을 가집니다.");
			System.out.println(s1.toString()+s2.toString());
		}
		System.out.println("------------------------------------------------");
		
		
		if(s1.equals(s3)) {
			System.out.println("동일 문자열을 가집니다.");
			System.out.println(s1+s3);
		}else {
			System.out.println("다른 문자열을 가집니다.");
			System.out.println(s1+s3);
		}
		System.out.println("------------------------------------------------");
		if(s4.equals(s5)) {
			System.out.println("동일 문자열을 가집니다.");
			System.out.println(s4+s5);
		}else {
			System.out.println("다른 문자열을 가집니다.");
			System.out.println(s4+s5);
		}
		
		if(s1.equalsIgnoreCase(s5)) {
			System.out.println("동일 문자열을 가집니다.");
			System.out.println(s1+s5);
		}else {
			System.out.println("다른 문자열을 가집니다.");
			System.out.println(s1+s5);
		}
		
		
	}

}
