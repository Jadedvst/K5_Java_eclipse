package dataStructure.ch6Sort;

import java.util.Random;

import dataStructure.ch5Recursive.given.IntStack;

public class Sort {
	static int recur=0;
	public static void main(String[] args) {
		int size=10;
//		Random rd = new Random();
//		int[] arr = new int[size];
//		for(int i=0;i<10;i++) {
//			arr[i]=rd.nextInt(30);
//		}
		int[] arr = {6,4,3,7,1,9,7,11,39,0};
		System.out.println("n="+arr.length);
		show(arr);
		
		//arr.clone();
		System.out.println("-".repeat(size*5));
		System.out.println("06-2 버블 정렬");
		show(bubbleSort1(arr.clone(),size));
		show(bubbleSort2(arr.clone(),size));
		show(bubbleSort3(arr.clone(),size));
		System.out.println("-".repeat(size*5));
		
	
		System.out.println("06-3 단순 선택 행렬");
		show(selectionSort(arr.clone(),size));
		System.out.println("-".repeat(size*5));
	
		System.out.println("06-4 단순 삽입 정렬");
		show(insertionSort(arr.clone(),size));
		System.out.println("-".repeat(size*5));
		
		System.out.println("06-5 셸 정렬");
		show(shellSort(arr.clone(),size));
		show(shellSort(arr.clone(),size));
		System.out.println("-".repeat(size*5));
		
		System.out.println("06-6 Quick 정렬");
		partition(arr.clone(),size);
		int[] qarr = arr.clone().clone();
		System.out.print("[Quick Sort]");
//		show(qarr);
		quickSort(qarr,0, size-1);
		show(qarr);
		show(quickSortNonRecur(arr.clone(),0, size-1));
		System.out.println("-".repeat(size*5));

		System.out.println("06-7 병합 정렬");
		int[] brr = {8,5,9,8,7,0,2};
		System.out.println("A");
		show(arr);
		System.out.println("B");
		show(brr);
		System.out.println("C");
		show(mergeArray(arr,arr.length, brr, brr.length));
		show(mergeSort(arr,size));
		System.out.println("-".repeat(size*5));
	}
	
	static void show(int[]a) {
		for(int it:a)
			System.out.print(it+" ");
		System.out.println();
	}
	
	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;	
	}

	static int[] bubbleSort1(int[]a, int n) {
		int cnt=0; int check=0; 
		for(int i =0;i<n-1;i++)
			for(int j=n-1;j>i;j--) {
				check++;
				if(a[j-1]>a[j]) {
					swap(a,j,j-1);
					cnt++;
				}
			}
		System.out.print("[Bubble Sort1] "+cnt+"/"+check+" times: ");
		return a;
	}
	
	static int[] bubbleSort2(int[]a, int n) {
		//정렬이 마쳤기에 교환이 없을거라 판단
		int cnt=0; int check=0; 
		for(int i =0;i<n-1;i++) {
			//매 정렬 시 교환 0으로 초기화
			int exchg =0;
			for(int j=n-1;j>i;j--) {
				check++;
				if(a[j-1]>a[j]) {
					swap(a,j,j-1);
					cnt++;
					exchg++;
				}
			}
			if(exchg==0) break;
		}
		System.out.print("[Bubble Sort2] "+cnt+"/"+check+" times: ");
		return a;
	}
	
	private static int[] bubbleSort3(int[] a, int n) {
		//교환이 없을시 이미 정렬 완료라고 판단
		int cnt=0; int check=0; 
		int k = 0; // a[k]보다 앞은 정렬 완료
		while(k<n-1) {// k값을 계속 변화 시켜 줄것이고 교환이 필요한게 없을때 끝나기에
			int find_k = n-1; //이번 턴에 마지막 요소를 교환한 위치
			for(int j=n-1;j>k;j--) {
				check++;
				if(a[j-1]>a[j]) { //교환가능한지 체킹하는 부분. 가능할시에 교환하고 find_k값 업데이트
					swap(a,j-1,j);
					cnt++;
					find_k = j;
				}
			}
			k = find_k;
		}
		System.out.print("[Bubble Sort3] " +cnt+"/"+check+" times: ");
		return a;
	}


	static int[] selectionSort(int[]a,int n) {
		int cnt=0; int check=0; 
//		for(int i=1;i<n;i++) {
//			//정렬되지 않은 가장 작은 요소
//			int min;
			//꺼낸카드
		
		//좌측카드가 꺼낸 카드보다..
		//좌측카드를 우측으로
		//꺼낸 카드를 넣는다 insertion
//		}
		
		for(int i =1;i<n;i++) {
			int j;	//정렬되지 않은 가장 작은 요소
			int tmp = a[i]; //꺼낸카드
			for(j=i;j>0&&a[j-1]>tmp;j--) {//좌측카드가 꺼낸 카드보다..
				cnt++;
				a[j]=a[j-1];//좌측카드를 우측으로
			}
			a[j]=tmp;//꺼낸 카드를 넣는다 insertion
		}
		System.out.println("[Selection Sort] " +cnt+" times: ");
		return a;
		
	}
	
	static int[] shellSort(int[] a,int n) {
		int cnt=0; int check=0; 
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
		System.out.println("[Shell Sort] " +cnt+" times: ");
		return a;
	}
	

	
	private static int[] insertionSort(int[] a, int size) {
		int cnt=0; int check=0; 
		System.out.println("[Shell Sort] "+cnt+" times: ");
		return a;
	}






	private static int[] partition(int[] a, int n) {
		int cnt=0; int check=0; 
		int pl =0;		//왼쪽 포인터
		int pr = n-1;	//오른쪽 포인터
		int x = a[n/2]; //pivot
		
		//피벗 기준으로 나누기
		do {
			check++;
			//위치에 맞는 값은 작업이 필요없으니 포인터 이동
			while (a[pl]<x) pl++; 
			while (a[pr]>x) pr--;
			//만약 포인터가 중간에 멈췄으면 pl값이 더 작다는것이고 그것은 다시말해 정렬이 필요하다는 뜻
			if (pl<=pr) {
				swap(a,pl++,pr--);
				cnt++;
			}
		}while(pl<=pr);
		System.out.print("[Partition] " +cnt+"/"+check+" times pivot="+x+":");
	
		System.out.print("(");
		for(int i=0;i<=pl-1;i++)
			System.out.print(" "+a[i]);
		
		System.out.print(" )<(");
		if(pl>pr+1) {
			for(int i=pr+1;i<=pl-1;i++)
				System.out.print(" "+a[i]);
		}
		System.out.print(" )<(");
		for(int i=pr+1;i<n;i++)
			System.out.print(" "+a[i]);
		System.out.println(" )");

		return a;
	}
	


	private static void quickSort(int[] qarr, int left, int right) {
		int cnt=0; int check=0; int[]a =qarr;
		int pl = left;
		int pr = right;
		int x  = a[(pl+pr)/2];
//		System.out.println("[Quick Sort]" +cnt+"/"+check+" times pivot="+x+":");
//		System.out.printf("a[%d~%d]: {",left,right);
//		for(int i=left;i<right;i++)
//			System.out.printf("%d,",a[i]);
//		System.out.printf("%d}\n",a[right]);
//		partition(a,pl,pr);
		do {
			check++;
			//위치에 맞는 값은 작업이 필요없으니 포인터 이동
			while (a[pl]<x) pl++; 
			while (a[pr]>x) pr--;
			//만약 포인터가 중간에 멈췄으면 pl값이 더 작다는것이고 그것은 다시말해 정렬이 필요하다는 뜻
			if (pl<=pr) {
				swap(a,pl++,pr--);
				cnt++;
			}
		}while(pl<=pr);
//		System.out.printf("a[%d~%d]: {",left,right);
//		for(int i=left;i<right;i++)
//			System.out.printf("%d,",a[i]);
//		System.out.printf("%d}\n",a[right]);
		
		if(left<pr) quickSort(a,left,pr);
		if(pl<right) quickSort(a,pl,right);
//		show(a);
//		System.out.println(recur++);

		 //재귀이기에 return으로 할시에 a가 다 변형되기 전 값이 출력 될수 있다
		 //가설: 위의 quickSort에 arr를 a로 다시 받아야 하는 걸수도 있다.
	}


	private static int[] quickSortNonRecur(int[] a, int left, int right) {
		int cnt=0; int check=0; 
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty()!=true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left+right)/2];
			
			do {
				check++;
				while (a[pl]<x) pl++; 
				while (a[pr]>x) pr--;
				if (pl<=pr) {
					swap(a,pl++,pr--);
					cnt++;
				}
			}while(pl<=pr);
			
			if(left<pr) {
				lstack.push(left);//lstack[0],[1]
				rstack.push(pr);//rstack[0],[1]
			}
			if(pl<right) { //뒤에 쌓이므로 맨 오른쪽 배열부터 순차적으로 처리된다
				lstack.push(pl);//lstack[1],[2]
				rstack.push(right);//lstack[1],[2]
			}
		}
		System.out.print("[Quick Sort NonRecur]" +cnt+"/"+check+" times: ");
		return a;
	}

	private static int[] mergeArray(int[] a, int na, int[] b, int nb) {
		int cnt=0; int check=0; 
		int pa =0;
		int pb =0;
		int pc =0;
		int[] c = new int[na+nb];
		while(pa<na && pb<nb) //둘중 작은 값을 c에저장
			c[pc++]=(a[pa]<=b[pb])? a[pa++]: b[pb++];
		
		while(pa<na)
			c[pc++]=a[pa++];
		
		while(pb<nb)
			c[pb++]=b[pb++];
		
		return c;
	}






	private static int[] mergeSort(int[] arr, int size) {
		int cnt=0; int check=0; int [] a = arr;
		return a;
	}






}
