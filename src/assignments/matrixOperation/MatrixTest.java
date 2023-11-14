package assignments.matrixOperation;

import java.util.Arrays;
import java.util.Random;

public class MatrixTest {

	public static void main(String[] args) {
		//Random
		Random rd = new Random();
		int[] array = new int[24];
		for(int i =0;i<24;i++) {
			array[i]= rd.nextInt(101);
		}
//		sortArray(array);
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
//		int[] array= {0,1,2,
//					  3,4,5,
//					  6,7,8,
//					  9,0,1,
//					  0,1,2,
//					  3,4,5,
//					  6,7,8,
//					  9,0,1};

		Matrix mA = new Matrix(array, 0,3,4);
		Matrix mB = new Matrix(array, 12,3,4);
		mA.print();
		System.out.println("-".repeat(50));
		mB.print();
		
		System.out.println("-".repeat(50));
		Matrix mC = Matrix.sum(mA,mB);
		mC.print();
		System.out.println("=".repeat(50));
		
		Matrix muA = new Matrix(array, 0,3,4);
		Matrix muB = new Matrix(array, 12,4,3);
		muA.print();
		System.out.println("-".repeat(50));
		muB.print();
		System.out.println("-".repeat(50));
		Matrix muC = Matrix.multiplication(muA,muB);
		muC.print();
		
		
	}

//	private static void sortArray(int[] array) {
//		for(int i=0;i<array.length;i++) {
//			int temp;
//			if(array[i]>=)
//		}
//		
//	}

}
