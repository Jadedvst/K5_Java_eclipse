package dataStructure.ch5Recursive.queen;


public class Test_Four {

		public static void main(String[] args) {
			int row = 4, col = 4;
			int [][] data = new int[row][col];
//			for(int i = 0; i<row;i++)
//				for(int j=0;j<col;j++)
//					data[i][j]=0;
			
			BishopFour.SolveBishop(data);
			
		}
	}


