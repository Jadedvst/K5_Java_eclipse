package ch9API;

import java.util.Arrays;
import java.util.Random;

public class Test15_RandomEnhancedforArray {

	public static void main(String[] args) {
		Random r1 = new Random();

		
		for(int i=0; i<5; i++) {
			System.out.print(r1.nextInt()+"\t");//\t:tab
			System.out.print(r1.nextInt(100)+"\t");
			System.out.print(r1.nextBoolean()+"\t");
			System.out.print(r1.nextDouble()+"\t");
			System.out.println();
		}
		
		Random r2 = new Random(55); //Random(seed): 출력 값 지정 및 저장

		int[][] nArr= new int[5][5];
		for(int j=0; j<5; j++) {
			for(int k = 0; k<5; k++)
			nArr[j][k]=r2.nextInt(10);
		}
		
		for(int j=0; j<5; j++) {
			for(int k = 0; k<5; k++) 
		//	Arrays.sort(nArr);
			System.out.print(nArr[j][k]+" ");
		System.out.println();
		}
		
	//	for (int[] num:nArr) {
//		for (int tnum:nArr(Arrays.))
	//		System.out.print(num+" ");
	//	}
		
		Random r3 = new Random(5); //Random(seed): 출력 값 지정 및 저장

		int[] iArr= new int[5];
		for(int j=0; j<5; j++) {
			iArr[j]=r3.nextInt(10);
		}
		
		System.out.print("\n");
		Arrays.sort(iArr);
		for (int num:iArr) // enhanced for loop
			System.out.print(num+" ");
		System.out.print("\n");
		System.out.println(Arrays.toString(iArr));
	}

}
