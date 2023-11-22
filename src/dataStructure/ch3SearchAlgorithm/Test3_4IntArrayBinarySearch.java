package dataStructure.ch3SearchAlgorithm;


//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
import java.util.Random;

public class Test3_4IntArrayBinarySearch {
	static void inputData(int [] data) {
		//난수 생성 입력
		Random rd = new Random();
		for(int i=0;i<10;i++)
			data[i] = rd.nextInt(45);
	}
	static void showData(int[] data){
		System.out.println("-".repeat(30));
		for(int i=0;i<10;i++)
			System.out.print(data[i]+" ");
		System.out.println();
	}
	static void sortData(int[] data){
		int temp=0;
		for(int i=0;i<10;i++)
			for(int j=i;j<10;j++)
				if(data[i]>data[j]) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
	}
	static int linearSearch(int[] data, int key){
		for(int i=0;i<data.length;i++)
			if(key==data[i])
				return i;
			return -1;
	}
//	static int[] linearSearchMultiple(int[] data, int key){
//		int j=1;
//		int[] mult= {-1};
//		for(int i=0;i<data.length;i++)
//			if(key==data[i]) {
//				mult[j++]=i;
//			}
//		return mult;
//	}


	static int binarySearch(int[] data, int key){
		int start = 0;
		int end = data.length-1;
		do {
			int mid = (start+end)/2;
			if(data[mid]==key)
				return mid;
			else if (key>data[mid])
				start=mid+1;
			else 
				end=mid-1;
		}while(start<=end);
		return -1;	
	}
	
	static int binarySearchRecursive(int[] data, int key, int start ,int end){
		if(start>end)
			return -1;
		else{
			int mid = (start+end)/2;
			if(data[mid]==key)
				return mid;
			else if (key>data[mid])
				return binarySearchRecursive(data, key, mid+1 ,end);
			else 
				return binarySearchRecursive(data, key, start ,mid-1);
		}
		
	}
	

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData(data);
		sortData(data);
		System.out.println("-".repeat(30));
		for (int num: data) {
			System.out.print(num+" ");
		}
		int key = 33;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): '"+key+"' at " + result);
//		int[] r = linearSearchMultiple(data, key);
//		System.out.println("\nlinearSearchMultiple(): '"+key+"' at "); 
//		for(int i=0;i<r.length;i++)
//			System.out.println(r[i]);

		key = 39;
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): '"+key+"' at " + result);
		result = binarySearchRecursive(data, key,0,data.length-1);
		System.out.println("\nbinarySearchRecursive(): '"+key+"' at " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): '"+key+"' at " + idx);


	}

}
