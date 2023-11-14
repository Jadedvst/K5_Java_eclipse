package assignments.ArraySorting_Lamda;

import java.util.Arrays;
import java.util.Random;

public class IntArraySorting {

	public static void main(String[] args) {
		int [] data = new int[20];
		Random rd = new Random();
		for (int i = 0; i < data.length; i++)
			data[i]=rd.nextInt(100);
		Arrays.sort(data);
		//출력 
		for (int num: data)//for num in data
			System.out.print(num+" ");
	
	}
}
