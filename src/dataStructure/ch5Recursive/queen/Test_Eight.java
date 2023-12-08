package dataStructure.ch5Recursive.queen;


public class Test_Eight {

		public static void main(String[] args) {
			int row = 8, col = 8;
			int [][] data = new int[row][col];
//			for(int i = 0; i<row;i++)
//				for(int j=0;j<col;j++)
//					data[i][j]=0;
			Bishop.SolveBishop(data, 14);
//			QueenEight.SolveQueen(data);

//			}
		}
	}

