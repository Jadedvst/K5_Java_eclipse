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
		int cnt = 0, mode = 0;
		int ir = 0, ic = 0;
		Stack st = new Stack(10);
		Point p = new Point(ir,ic);
		d[ir][ic]=1; //(0,0)
		cnt++;
		st.push(p);
		ir++;
		System.out.println(checkRow(d, 0));
		System.out.println(checkCol(d, 0));
		
		System.out.println(CheckMove(d, ir, 1));
		System.out.println(CheckMove(d, ir, 2));
		
		System.out.println(CheckMove(d, 2, 1));
		System.out.println(CheckMove(d, 3, 0));
		d[1][2]=1;
		d[2][4]=1;
		d[3][6]=1;
		d[4][1]=1;
		System.out.println(nextMove(d,6,2));
		System.out.println(checkRow(d, 6));
		System.out.println(checkCol(d, 3));
		System.out.println(checkDiagSE(d, 6, 3));
		System.out.println(checkDiagSW(d, 6, 3));
		
//		System.out.println(nextMove(d,ir,ic));
//		d[ir++][2]=1;
//		System.out.println(nextMove(d,ir,ic));
//		d[ir++][4]=1;
//		System.out.println(nextMove(d,ir,ic));

//		while(cnt<5) {
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
		
	
//		while (true) {
//			if (st.isEmpty() && ir == 8) //ir가 8이면 8개 배치 완료, stack이 empty가 아니면 다른 해를 구한다 
//				break;
//			if ((ic= nextMove(d, ir, ic))== -1) {//다음 이동할 열을 ic로 주는데 -1이면 더이상 이동할 열이 없음을 나타냄
//				p =st.pop();
//				ic = (p.getY()+1)%8;
//				ir--;
//				cnt--;
//			}
//			else {
//				Point np = new Point(ir,ic);
//				st.push(np);
//				d[ir][ic]=1;
//				ir++;
//				cnt++;
//			}
//
//			if (cnt == 8) { //8개를 모두 배치하면
//				mode++;
//				break;
//			}
//
//		}
		
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

	public static boolean checkDiagSW(int[][] d, int cr, int cc) { //x++, y-- or x--, y++ where 0<= x,y <= 7

		for(int i=1;i<d[0].length;i++) {
			int tr=(cr+i)%8;
			int tc=(cc-i+8)%8;
			if(d[tr][tc]==1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cr, int cc) {//x++, y++ or x--, y--

		for(int i=1;i<d[0].length;i++) {
			int tr=(cr+i)%8;
			int tc=(cc+i)%8;
			if(d[tr][tc]==1)
				return false;
		}
		return true;
	}
    public static boolean CheckMove(int[][]d, int row, int col) {//(r,c)로 이동 가능한지를 check
    	if(checkRow(d, row)&&checkCol(d, col)&&checkDiagSW(d, row, col)&&checkDiagSE(d, row, col)) 
    		return true;
    	return false;
    }
    public static int nextMove(int[][]d, int row, int col) {//다음 row에 대하여 이동할 col을 조사
    	//주어진 행에 대해 놓을수 있는 col 반환  없을시 -1
    	for(int i =col;i<d[0].length+col;i++) {
    		if(CheckMove(d, row, i%8)) return i%8;
    	}
    	//for loop 로 check move후 stack에 저장
    	return -1;
    }
		
	}

