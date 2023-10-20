package ch4Array;

public class Method_MatrixMultiplication {

	public static void main(String[] args) {
		int i;
		int j;
		int[][] A = {{1,2,3},
					 {4,5,6}};
		int[][] B = {{1,2},
					 {3,4},
					 {5,6}};
		int[][] C = new int [A.length][B.length];
		int product=0;
		for( i=0;i< A.length ;i++) {
			product=0;
			for( j=0;j< A.length ;j++) {
				product += (A[i][j])*(B[j][i]);
				
				System.out.println("");
			}
			C[i][j] += product;
		}
			

		for ( i = 0; i < C.length; i++) {
			for ( j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j] + "");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
