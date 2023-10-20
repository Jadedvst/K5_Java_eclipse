package ch4Array;

import java.util.Scanner;

public class Test32Array {

	public static void main(String[] args) {
		int i;
		
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
		int []arr= {10,20,30,40,50};
		
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-".repeat(10));
		
		i=0;
		while(i < 5){
			arr[i] = (i + 1) * 10; // arr의 i번지에 (i+1)*10를 저장
			System.out.println(arr[i]);
			i+=1;
		}
		System.out.println("-".repeat(10));
		i=0;
		do {arr[i] = (i + 1) * 10; // arr의 i번지에 (i+1)*10를 저장
		System.out.println(arr[i]);
		i+=1;
		}while(i < 5);
	

	}
}
