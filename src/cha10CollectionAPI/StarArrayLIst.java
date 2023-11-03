package cha10CollectionAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StarArrayLIst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int repeat = 5;
	
		//Scanner 객체 생성후 반복값 입력
		//Test값 = 5
		//배열 객체(ArrayList) 생성
		
		//저장할 문장을 생성해서 배열을 저장
			//repeat 횟수만큼 반복(for loop)
		
		//저장된 문자열을 출력
		
		
		List<String> Stars = new ArrayList();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String star =" ".repeat(n-i+1) +("* ".repeat(i+1) +" *".repeat(n-i+1)+" ").repeat(2);
			Stars.add(star);
		}
			
		for(int i=0;i<Stars.size();i++) {
			System.out.println(String.format("%s", Stars.get(i)));
		}
		
		
		/////////////////////////////////////////////
		
		List<String> Stars2 = new ArrayList();
		
		
		for(int i=1;i<5;i++) {
			StringBuffer star = new StringBuffer();
			for(int j=0;j<i;j++) {
			//	star+="*";
				star.append("*");
			}
			Stars2.add(star.toString());
		}
			
		Stars2.forEach(s-> System.out.println(s));
		
		System.out.println(Stars2.toString());
		
		//////////////////////////////////////////
		List<List<String>> StarsArr = new ArrayList();
		List<String> Starsarr = new ArrayList();
		
		for(int i=1;i<5;i++) {
		
			for(int j=0;j<i;j++) {
				Starsarr.add("*");
			}
			StarsArr.add(Starsarr);
		}
			
		StarsArr.forEach(s-> System.out.println(s));
		
	
	}

}

/*

*
**
***
****
*****

*/