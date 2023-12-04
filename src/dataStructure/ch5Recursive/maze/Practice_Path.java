package dataStructure.ch5Recursive.maze;

public class Practice_Path {
	
	//need data 
	public static String whatdata() {
		//int[][] maze, int[][] mark, int endX, int endY, Offset[] moves
		return "int[][] maze, int[][] mark, int endX, int endY, Offsets[] moves";
	}
	public static void practice_path(int[][] maze, int[][] mark, int endX, int endY, Offsets[] moves) {
		//시작 init for stack start
		//Stack init
		
		//while stack exists
			// data pop for backtracking (i,j)
			// while for all direction
				// g,h for next coordinate
				// out if reached end after marking
				// if maze is 0, not marked, mark my position, add to stack with new Object, then leave
				// else, next direction
		
		
		//시작 init for stack start
		//Stack init
		PathStack st = new PathStack(50);
		Mouse init = new Mouse(0,0,0);
		init.r=1;
		init.c=1;
		init.dir=2;
		st.push(init);
			//while stack exists
			while(!st.isEmpty()) {
				// data pop for backtracking (i,j)
				Mouse pos = st.pop();
				int i = pos.r;
				int j = pos.c;
				int d = pos.dir;
				mark[i][j]=3;//backtrack
				// while for all direction
				do {
					// g,h for next coordinate
					int g = i + moves[d].r;
					int h = j + moves[d].c;
					// out if reached end after marking
					if(g==endX && h == endY) {
						mark[i][j]=1;
						return;
					}
					// if maze is 0, not marked, mark my position, add to stack with new Object, then leave
					if(maze[g][h]==0 && mark[g][h]==0) {
						mark[i][j]=1;
						st.push(new Mouse(i,j,++d));
						i=g;
						j=h;
						d=0;
					}
					// else, next direction
					else {
						d++;
					}
				}while(d<8);
			}
	}
	
	
}
