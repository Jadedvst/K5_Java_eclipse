package dataStructure.ch5Recursive.maze;

public class Test_MazingProblem {

	public static void main(String[] args) {
		//given data
		int input[][] = { // 12 x 15
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }};
		
		
		//matrix 확인
		
//		System.out.println("maze[12,15]::");
//		showMatrix(maze, 13, 16);
//		System.out.println("maze[14,17]::");
//		showMatrix(maze, 14, 17);
		
		
		int[][] mark=input;
		System.out.println("maze::");
		showMatrix(mark, 12, 15);
		mark=MazingProblem.solution(input);
		
		System.out.println("mark::");
		showMatrix(mark, 12, 15);
		
		
	}

//	private static void path(int[][] maze, int[][] mark, int i, int j) {
//		// TODO Auto-generated method stub
//		
//	}

	private static void showMatrix(int[][] maze, int row, int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
		
	}

}
