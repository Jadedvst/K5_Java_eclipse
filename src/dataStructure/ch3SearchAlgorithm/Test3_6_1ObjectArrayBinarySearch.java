package dataStructure.ch3SearchAlgorithm;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;
	public PhyscData(String string, int i, double d) {
		this.name=string;
		this.height=i;
		this.vision=d;
	}
	@Override
	public int compareTo(PhyscData o) {
		if(height-o.height==0)
			if(vision-o.vision==0.0)
				return name.compareTo(o.name);
			else
				return (int) Math.ceil(vision-o.vision);
		return height-o.height;
	}
}
public class Test3_6_1ObjectArrayBinarySearch {
	private static void sortData(PhyscData[] data) {
		PhyscData temp;
		for(int i=0;i<data.length;i++)
			for(int j=i;j<data.length;j++)
				if(data[i].compareTo(data[j])>0) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
	}
	static void showData(PhyscData[]arr) {
		System.out.println();
		for (PhyscData p: arr) {
			System.out.println(p.name+": \t("+p.height+" "+p.vision+")");
		}
		System.out.println();
	}
	
	static String showData(PhyscData p) {
		return p.name+": ("+p.height+" "+p.vision+")";
	}
	
	
	private static int linearSearch(PhyscData[] data, PhyscData key) {
		for(int i=0;i<data.length;i++) {
			//compareTo: height차이:0, vision차이:0 then name.compareTo(o.name) 값
			if(key.compareTo(data[i])==0)
				return i;
		}
		return -1;
	}

	private static int binarySearch(PhyscData[] data, PhyscData key) {
		int start = 0;
		int end = data.length;
		do {
			int mid = (start+end)>>>1;
			int cmp = key.compareTo(data[mid]);
			if(cmp==0)
				return mid;
			else if(cmp<0)
				end=mid-1;
			else
				start=mid+1;
		}while(start<=end);
		return -1;
	}

	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("길동", 182, 0.6),
				new PhyscData("길동", 167, 0.2),
				new PhyscData("길동", 167, 0.5),
		};
		showData(data);
		sortData(data);
		showData(data);
		PhyscData key = new PhyscData("길동", 167, 0.2);
		int result = linearSearch(data, key);
		String strkey=showData(key);
		System.out.println("\nlinearSearch(): '"+ strkey+"' at " + result);
		
		key = new PhyscData("길동", 167, 0.5);
		strkey=showData(key);
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): '"+strkey+"' at " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): '"+strkey+"' at " + idx);
	}


}
