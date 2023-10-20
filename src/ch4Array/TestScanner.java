package ch4Array;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ctrl shift o 자동 import

		int arr[] = new int[3];

		System.out.println("국어 점수:");// sysout:모니터, sysin:키보드
		arr[0] = sc.nextInt();

		System.out.println("수학 점수:");
		arr[1] = sc.nextInt();

		System.out.println("영어 점수:");
		arr[2] = sc.nextInt();

//		for (int i = 0; i < 3; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		///////확장된 for////////
		for (int i:arr) {//for(변수 선언:배열 변수명)
			System.out.println(i);
		}
		int avg = (arr[0] + arr[1] + arr[2]) / 3;
		System.out.println("평균은 = " + avg);
	}
}
