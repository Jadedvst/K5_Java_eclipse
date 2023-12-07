package dataStructure.ch5Recursive.queen;



//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking
/*
* 체스판은 8 x 8
* 체스의 기물: king/가로세로대각선 1칸만 이동, queen/가로세로 대각선/같은 편의 기물을 넘을 수 없다,
*  Rook/가로,세로 이동/다른 기물을 넘을 수없다, bishop/대각선, knight/1-2칸 이동/다른 기물을 넘을 수 있다,
*  pawn/처음 이동은 2칸까지 가능, 그 후 한칸만 가능, 잡을 때는 대각선 가능
*  체스판 최대 배치 문제 : king/16, Queen/8, rook/8, bishop/?, knight/?
*  rook 2개/a, h, knight 2개/b, g, bishop 2개/c, f, queen 1개/black queen은 black 칸에, 폰 8개
*/
public class QueenEight {
	
	public static void SolveQueen(int[][] d) {
		int cnt = 0, mode =0 ;
		int ir = 0, ic = 0;
		Stack st = new Stack(100);
		Point p = new Point(ir,ic);
		d[ir][ic]=1; //(0,0)
		cnt++;
		st.push(p);
		ir++;
//		System.out.println(checkRow(d, 0));
//		System.out.println(checkCol(d, 0));
		
	
//		d[1][6]=1;
//		d[2][4]=1;
//		d[3][7]=1;
//		d[4][1]=1;
//		d[5][3]=1;
//		d[6][5]=1;
//		System.out.println(nextMove(d,7,5));
//		System.out.println(checkRow(d, 7));
//		System.out.println(checkCol(d, 7));
//		System.out.println();
//		System.out.println(checkSlash(d, 7, 7));
//		System.out.println(checkBackSlash(d, 7, 7));
//		
		
//		System.out.println(nextMove(d,ir,ic));
//		d[ir++][2]=1;
//		System.out.println(nextMove(d,ir,ic));
//		d[ir++][4]=1;
//		System.out.println(nextMove(d,ir,ic));

//		while(cnt<7) {
//			int i = nextMove(d,ir,ic);
//			if(i!=-1) {
//				d[ir][i]=1;
//				System.out.println(cnt);
//				ir++;
//				cnt++;
//				ic=i+1;
//		
//			}
//		}
		
		while (true) {
			if ((ic= nextMove(d, ir, ic))== -1) {//다음 이동할 열을 ic로 주는데 -1이면 더이상 이동할 열이 없음을 나타냄
				if (st.isEmpty()) //ir가 8이면 8개 배치 완료, stack이 empty가 아니면 다른 해를 구한다 
					return;
				Point pp =st.pop();
				ir = pp.getX();
				ic = pp.getY();				
				d[ir][ic]=0;//이전값 제외 필요함
				ic++;
				cnt--;
				continue;
			}
			Point np = new Point(ir,ic);
			st.push(np);
			d[ir][ic]=1;
			ir++;
			ic=0;
			cnt++;		
			
			if (cnt == 8) { //8개를 모두 배치하면
				mode++;
				System.out.println("mode :: "+ mode);
				showQueen(d);
				Point pp =st.pop();
				ir = pp.getX();
				ic = pp.getY();
				d[ir][ic]=0;
				cnt--;
				ic++;

			}
		}
		
	}
	
	private static void showQueen(int[][] d) {
		for (int[] element: d) {
			for(int j =0; j<d[0].length;j++) {
				System.out.print(" " + element[j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	public static boolean checkRow(int[][] d, int crow) {
		for(int i=0;i<d[0].length;i++)
			if(d[crow][i]==1)
				return false;
		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {
		for(int i=0;i<d.length;i++)
			if(d[i][ccol]==1) {
				return false;
			}
		return true;
	}

	public static boolean checkSlash(int[][] d, int cr, int cc) { //x++, y-- or x--, y++ where 0<= x,y <= 7
		//NE
		for(int i=1;i<d.length;i++) {
			int tr=cr-i;//(5,3)->(4,4)
			int tc=cc+i;
			if(tr<0||tc>=d[0].length)
				break;
			if(d[tr][tc]==1)
				return false;
		}
		//SW
		for(int i=1;i<d.length;i++) {
			int tr=cr+i;//(5,3)->(4,4)
			int tc=cc-i;
			if(tr>=d.length||tc<0)
				break;
			if(d[tr][tc]==1)
				return false;
			}
//		for(int i=1;i<d.length;i++) {
//			int tr=(cr-i+8)%8;//(5,3)->(4,4)
//			int tc=(cc+i)%8;
//			System.out.println(tr+","+tc);
//			if(d[tr][tc]==1)
//				return false;
//		}
		return true;
	}

	public static boolean checkBackSlash(int[][] d, int cr, int cc) {//x++, y++ or x--, y--
		//NW
		for(int i=1;i<d.length;i++) {
			int tr=(cr-i);//(5,3)->(4,4)
			int tc=(cc-i);
			if(tr<0||tc<0)
				break;
			if(d[tr][tc]==1)
				return false;
		}
		//SE
		for(int i=1;i<d.length;i++) {
			int tr=(cr+i);//(5,3)->(4,4)
			int tc=(cc+i);
			if(tc>=d[0].length||tr>=d.length)
				break;
			if(d[tr][tc]==1)
				return false;
			}
//		for(int i=1;i<d.length;i++) {
//			int tr=(cr+i)%8;
//			int tc=(cc+i)%8;
//			if(d[tr][tc]==1)
//				return false;
//		}
		return true;
	}
    public static boolean CheckMove(int[][]d, int row, int col) {//(r,c)로 이동 가능한지를 check
    	if(checkRow(d, row)&&checkCol(d, col)&&checkSlash(d, row, col)&&checkBackSlash(d, row, col)) 
    		return true;
    	return false;
    }
    public static int nextMove(int[][]d, int row, int col) {//다음 row에 대하여 이동할 col을 조사
    	//주어진 행에 대해 놓을수 있는 col 반환  없을시 -1
//    	for(int i =col+1;i<d[0].length+col;i++) {
    	for(int i =col;i<d[0].length;i++) {
    		if(CheckMove(d, row, i%8)) return i%8;
    	}
    	//for loop 로 check move후 stack에 저장
    	return -1;
    }
		
}

