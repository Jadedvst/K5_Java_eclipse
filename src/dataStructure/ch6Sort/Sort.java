package dataStructure.ch6Sort;

import java.util.Random;

public class Sort {

	
	public static void main(String[] args) {
		int size=10;
//		Random rd = new Random();
//		int[] arr = new int[size];
//		for(int i=0;i<10;i++) {
//			arr[i]=rd.nextInt(30);
//		}
		int[] arr = {34,42,11,22,22,33,1,0,6,17};
		show(arr);
		//arr.clone();
		System.out.println("-".repeat(size*3));
		System.out.println("06-2 버블 정렬");
		show(bubbleSort(arr,size));
		show(bubbleSort2(arr,size));
		show(bubbleSort3(arr,size));
		System.out.println("-".repeat(size*3));
		
		System.out.println("-".repeat(size*3));
		System.out.println("06-3 단순 선택 행렬");
		show(selectionSort(arr,size));
		System.out.println("-".repeat(size*3));
		
		System.out.println("-".repeat(size*3));
		System.out.println("06-4 단순 삽입 정렬");
		show(insertionSort(arr,size));
		System.out.println("-".repeat(size*3));
		
		System.out.println("-".repeat(size*3));
		System.out.println("06-5 셸 정렬");
		show(shellSort(arr,size));
		show(shellSort(arr,size));
		System.out.println("-".repeat(size*3));
		
		System.out.println("-".repeat(size*3));
		System.out.println("06-6 Quick 정렬");
		show(Partition(arr,size));
		show(QuickSort(arr,size));
		show(QuickSortNonRecur(arr,size));
		System.out.println("-".repeat(size*3));
		
		System.out.println("-".repeat(size*3));
		System.out.println("06-7 병합 정렬");
		show(MergeArray(arr,size));
		show(MergeSort(arr,size));
		System.out.println("-".repeat(size*3));
	}
	
	static void show(int[]a) {
		for(int it:a)
			System.out.print(it+" ");
		System.out.println("\n");
	}
	
	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;		
	}

	static int[] bubbleSort(int[]arr, int n) {
		int cnt=0;
		int[]a=arr;
		for(int i =0;i<n-1;i++)
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					swap(a,j,j-1);
					cnt++;
				}
			}
		System.out.println("[Bubble Sort]");
		System.out.println("count = "+cnt);
		return a;
	}
	
	static int[] bubbleSort2(int[]arr, int n) {
		//교환이 없을시 이미 정렬 완료라고 판단
		int cnt=0;
		int[]a=arr;
		for(int i =0;i<n-1;i++) {
			//매 정렬 시 교환 0으로 초기화
			int exchg =0;
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					swap(a,j,j-1);
					cnt++;
					exchg++;
				}
			}
			if(exchg==0) break;
		}
		System.out.println("[Bubble Sort2]" +" count = "+cnt);
		return a;
	}
	
	private static int[] bubbleSort3(int[] arr, int n) {
		int cnt=0;
		int[]a=arr;
		int strt = 0;
		for(int i =0;i<n-1;i++) {
			int exchg =0;
			for(int j = n-1; j>strt;j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					cnt++;
					exchg++;
				}
			strt=n-exchg;
			}
		if(exchg==0) break;
		}
		System.out.println("[Bubble Sort3]");
		System.out.println("count = "+cnt);
		return a;
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
	

	
	private static int[] insertionSort(int[] arr, int size) {
		int cnt=0; int [] a = arr;
		return a;
	}






	private static int[] Partition(int[] arr, int size) {
		int cnt=0; int [] a = arr;
		return a;
	}






	private static int[] QuickSort(int[] arr, int size) {
		int cnt=0; int [] a = arr;
		return a;
	}






	private static int[] QuickSortNonRecur(int[] arr, int size) {
		int cnt=0; int [] a = arr;
		return a;
	}






	private static int[] MergeArray(int[] arr, int size) {
		int cnt=0; int [] a = arr;
		return a;
	}






	private static int[] MergeSort(int[] arr, int size) {
		int cnt=0; int [] a = arr;
		return a;
	}






}
