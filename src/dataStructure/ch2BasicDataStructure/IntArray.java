package dataStructure.ch2BasicDataStructure;

import java.util.Random;
import java.util.Scanner;

public class IntArray {
	//작은 함수를 만들어서 코드 정리
	static void swap(int[] arr,int i,int j) {
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void sort(int[] arr) {
		for (int i =0;i<arr.length;i++)
			for (int j =i;j<arr.length;j++)
				if(arr[i]>arr[j])
					//작은 함수를 만들어서 코드 정리
					swap(arr,i,j);
	}
	
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i =0;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner std = new Scanner(System.in);
		System.out.println("키의 최대값을 구합니다");
		System.out.print("사람 수: ");
		int num = std.nextInt();
		int []a = new int[num];
		for (int i =0;i<num;i++) {
			a[i] =rd.nextInt(200);
			System.out.print("height["+i+"]:"+a[i]+" ");
		}
		System.out.println();
		sort(a);
		for (int i =0;i<num;i++) {
			System.out.print("height["+i+"]:"+a[i]+" ");
		}
		
		System.out.println("\n키의 최대값은 "+maxOf(a) +" 입니다");
	}

}
