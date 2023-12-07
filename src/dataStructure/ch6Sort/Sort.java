package dataStructure.ch6Sort;

import java.util.Random;

public class Sort {

	
	public static void main(String[] args) {
		int num=10;
		Random rd = new Random();
		int[] arr = new int[num];
		for(int i=0;i<10;i++) {
			arr[i]=rd.nextInt(30);
		}
		show(arr);
		//arr.clone();
		show(selectionSort(arr,num));
		show(shellSort(arr,num));
	}
	
	static void show(int[]a) {
		for(int it:a)
			System.out.print(it+" ");
		System.out.println("\n");
	}
	
	static int[] selectionSort(int[]arr,int n) {
		int cnt=0;
		int [] a = arr;
		for(int i =1;i<n;i++) {
			int j;	//정렬되지 않은 가장 작은 요소
			int tmp = a[i]; //꺼낸카드
			for(j=i;j>0&&a[j-1]>tmp;j--) {//좌측카드가 꺼낸 카드보다..
				cnt++;
				a[j]=a[j-1];//좌측카드를 우측으로
			}
			a[j]=tmp;//꺼낸 카드를 넣는다 insertion
		}
		System.out.println("[Selection Sort]");
		System.out.println("count = "+cnt);
		return a;
		
	}
	
	static int[] shellSort(int[] arr,int n) {
		int cnt=0;
		int [] a = arr;
		for(int h=n/2;h>0;h/=2)
			for(int i=h;i<n;i++) {
				int j;
				int tmp=a[i];
				for(j=i-h;j>=0&& a[j]>tmp;j-=h) {
					cnt++;
					a[j+h]=a[j];
				}
				a[j+h]=tmp;
			}
		System.out.println("[Shell Sort]");
		System.out.println("count = "+cnt);
		return a;
	}

}
