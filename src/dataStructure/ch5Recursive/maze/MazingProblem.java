package dataStructure.ch5Recursive.maze;




class Offsets{
	int r;
	int c;
	Offsets(int r, int c){
		this.r=r;
		this.c=c;
	}
}

public class MazingProblem {
	

	public static int[][] solution(int[][] input) {
		//in order to put 1 in the border
		//input(0,11)(0,14) to maze(0,13)(0,16)
		int[][] maze = new int[14][17];
		for(int i=0;i<14;i++) {
			for(int j=0;j<17;j++) {
				if(i==0||i==13||j==0||j==16) //무조건 boundary는 1이니까 다 ||
					maze[i][j]=1;
				else
					maze[i][j]=input[i-1][j-1];//maze(1,1)=input(0,0), maze(12,15)=input(11,14)
			}
		}
		
	
		//이동 방법 Offset 배열로 {N, NE, E, SE, S, SW, W, NW}
		Offsets[] moves= new Offsets[8];
		moves[0]= new Offsets(-1, 0);//N (배열로 생각)
		moves[1]= new Offsets(-1, 1);//NE
		moves[2]= new Offsets( 0, 1);
		moves[3]= new Offsets( 1, 1);
		moves[4]= new Offsets( 1, 0);
		moves[5]= new Offsets( 1,-1);
		moves[6]= new Offsets( 0,-1);
		moves[7]= new Offsets(-1,-1);
		
		//maze에 따라 mark 남기기
		int[][] mark = new int[14][17];
		path(maze, mark, 12, 15, moves); //최종값 주의(12,15)에서 0테두리 추가했으니 1씩 추가
//		Practice_Path.practice_path(maze, mark, 13, 16, moves);
		
		//결과 출력
		int[][] result = new int[14][17];
		for(int i=0;i<12;i++) {
			for(int j=0;j<15;j++) {
				result[i][j]=mark[i+1][j+1];//maze(1,1)=input(0,0), maze(12,15)=input(11,14)
			}
		}
		return result;
	}

	private static void path(int[][] maze, int[][] mark, int ix, int iy, Offsets[] moves) {
//		enum Directions {N, NE, E, SE, S, SW, W, NW}
		mark[1][1] = 1;
		PathStack st = new PathStack(50);//충분한 이동경로 설정
		Mouse init = new Mouse(0,0,0);
		init.r = 1;
		init.c = 1;
		init.dir = 2;//E :: 2
		mark[init.r][init.c]=1; //궤적을 1로 표기
		st.push(init); //궤적 기록
		
		while(!st.isEmpty()){//stack not empty
			Mouse msp = st.pop();//현pos 가져오기
			int i = msp.r;
			int j = msp.c;
			int d = msp.dir;
			mark[i][j]=0;//backtracking 궤적은 0로 표시
			while (d < 8) // moves forward
			{	
				int g = i+ moves[d].r;
				int h = j+ moves[d].c;
				if ((g == ix) && (h == iy)) { // reached exit input값으로 출구 받음
					mark[i][j]=1;
					mark[g][h]=1;
					return;	// output path
				}
				if ((maze[g][h] == 0) && (mark[g][h] == 0)) { // new position
					mark[i][j]=1;
					Mouse ms = new Mouse(0,0,0);//다른 객체를 지녀야함
					ms.r = i;
					ms.c = j;
					ms.dir = d+1; //backtraking 후 경로 재탐색
					st.push(ms); 
					i = g;
					j = h;
					d = 0;
				} else {
					d++;//7까지 체크 후 나감
				}
			}
		}

	System.out.println("no path in maze ");
	}
}
		
		
		




























	



