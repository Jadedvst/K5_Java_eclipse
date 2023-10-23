package ch4Array;

public class Method_MatrixMultiplication {

	public static int[][] C(int ... a){
		int i;
		int j;
		int k;
		int[][] A = {{1,2,3},
					 {4,5,6}};
		int[][] B = {{1,2},
					 {3,4},
					 {5,6}};
		int[][] C = new int [A.length][B[0].length];
		
		
		for( i=0;i< A.length ;i++) {
			for( j=0;j< B[i].length ;j++) {
				for( k=0;k< B.length ;k++) {
					C[i][j]+= (A[i][k])*(B[k][j]);
//					System.out.println(C[i][j]);
				}
				
			}
		}
		return C;
			
	}
		
		public static void main(String[] args) {

			for ( i = 0; i < C.length; i++) {
				for ( j = 0; j < C[i].length; j++) {
					System.out.print(C[i][j] + "");
					System.out.print(" ");
				}
				System.out.println("");
			}
	}

}
