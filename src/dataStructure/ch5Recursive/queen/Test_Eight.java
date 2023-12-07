package dataStructure.ch5Recursive.queen;


public class Test_Eight {

		public static void main(String[] args) {
			int row = 8, col = 8;
			int [][] data = new int[row][col];
//			for(int i = 0; i<row;i++)
//				for(int j=0;j<col;j++)
//					data[i][j]=0;
			
			QueenEight.SolveQueen(data);
			
//			for (int[] element: data) {
//				for(int j =0; j<data[0].length;j++) {
//					System.out.print(" " + element[j]);
//				}
//				System.out.println();
//			}
		}
	}

