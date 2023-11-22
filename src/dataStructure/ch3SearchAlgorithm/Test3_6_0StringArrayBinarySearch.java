package dataStructure.ch3SearchAlgorithm;


//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
public class Test3_6_0StringArrayBinarySearch {

	private static void sortData(String[] d) {
		String temp="";
		for(int i=0;i<d.length;i++)
			for(int j=i;j<d.length;j++)
				if(d[i].compareTo(d[j])>0) {
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
	}

	private static void showData(String[] d) {
		System.out.println("-".repeat(100));
		for(int i=0;i<d.length;i++)
			System.out.print(d[i]+", ");
		System.out.println();
		System.out.println("-".repeat(100));
		
	}
	
	private static int linearSearch(String[] d, String key) {
		for(int i=0;i<d.length;i++)
			if(key==d[i])
				return i;
		return -1;
	}
	
	private static int binarySearch(String[] d, String key) {
		int start = 0;
		int end = d.length-1;
		do {
			int mid = (start+end)/2;
			int cmp = key.compareTo(d[mid]);
			if(cmp==0)
				return mid;
			else if(cmp<0)
				end=mid-1;
			else
				start=mid+1;
		}while(start<=end);
		return -1;
	}
	
//	private static int binarySearchR(String[] d, String key, int start, int end) {
//		
//	}

	
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "감", "배", "사과", "포도", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		sortData(data);
		showData(data);

		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): '"+key+"' at " + result);

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): '"+key+"' at " + result);

		//Arrays. 썼을시 String이 없으니 Object로 써야함, 둘이 같은 타입
		int idx = Arrays.binarySearch(data, key);

		System.out.println("\nArrays.binarySearch(): '"+key+"' at " + idx);

	}



}
