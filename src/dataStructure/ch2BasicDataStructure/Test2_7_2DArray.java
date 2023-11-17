package dataStructure.ch2BasicDataStructure;
//교재 60 - 실습 2-6
//2번 실습
import java.util.Random;
public class Test2_7_2DArray {

	public static void main(String[] args) {
		int [][]A = new int[2][3];
		int [][]B = new int[3][4];
		int [][]C = new int[2][4];
		int [][]D = new int[2][3];
		inputData(A);inputData(B);inputData(D);
		System.out.println("A[][]");
		showData(A);
		System.out.println("D[][]");
		showData(D);
		System.out.println();
		System.out.println("B[][]");
		showData(B);
		int [][]E = addMatrix(A,D);
		System.out.println("E[][]");
		showData(E);
		int [][]C = multiplyMatrix(A,B);
		int [][]F = transposeMatrix(A);
		boolean result = equals(A, D);
		System.out.println(" equals(A,D) = " + result);
	}
	static void inputData(int [][]data) {

	}
	static void showData(int[][]items) {

	}
	static boolean equals(int[][]a, int[][]b) {


	}
	static int[][] addMatrix(int [][]X, int[][]Y) {

	}

}
