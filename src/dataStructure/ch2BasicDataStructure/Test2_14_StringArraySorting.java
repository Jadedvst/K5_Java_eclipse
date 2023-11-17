package dataStructure.ch2BasicDataStructure;

public class Test2_14_StringArraySorting {

	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		System.out.println();
		sortData(data);
		showData(data);
	}
	static void showData(String[]arr) {
		for(String str:arr) {
			System.out.print('"'+str+'"');
		}
	}

	static void swap(String[]arr, int ind1, int ind2) {
		String temp;
		temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
	}
	static void sortData(String []arr) {
		for(int i = 0;i<arr.length;i++)
			for(int j = i;j<arr.length;j++)
				if(arr[i].compareTo(arr[j])>0)
					swap(arr,i,j);

	}

}
