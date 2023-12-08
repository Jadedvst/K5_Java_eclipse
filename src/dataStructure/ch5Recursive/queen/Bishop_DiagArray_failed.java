package dataStructure.ch5Recursive.queen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bishop_DiagArray_failed {

	public static void SolveBishop(int[][] board) {
		// stack of Points about 20
		// board init board[0][0]=1;
		// stack push
		// go by diag
		// init
		int cnt = 0;
		int mode = 0;
		int dep = 0;
		int wid = 0;
		Stack st = new Stack(20);
		Point p = new Point(dep, wid);

		st.push(p);
		board[dep][wid] = 1;
		cnt++;
		dep++;
		
		System.out.println(nextMove(board,dep,wid));

		while (true) {
			if ((wid = nextMove(board, dep, wid)) == -1) {
				if (st.isEmpty())
					break;
				p = st.pop();
				dep = p.getX();
				wid = p.getY();
				board[dep][wid] = 0;
			
					cnt--;
//				After pop, check diag
				if ((dep + 1) >= board.length || (wid + 1) >= board[0].length)
					continue;
				else {
					dep--;
					wid++;
				}
				continue; // for it to not go through push
			}
			Point np = new Point(dep, wid);
			st.push(np);
			board[dep][wid] = 1;
			dep++;
			if (dep == 4) {
				dep--;
				wid++;
			}
			//all init at left bottom
			if ((dep + wid) < 4) {
				dep += wid;
				wid = 0;
			} else {
				wid += dep - 3;
				dep = 3;
			}
			cnt++;

			if (cnt == 6) {
				mode++;
				System.out.println("mode :: " + mode);
				show(board);
				p = st.pop();
				dep = p.getX();
				wid = p.getY();
				board[dep][wid] = 0;
				cnt--;
				if (dep >= board.length)
					wid++;
				else
					dep++;

			}
		}

	}

	public static void show(int[][] board) {
		for (int[] dep : board)
			for (int wid : dep) {
				System.out.print(wid + " ");
			}
		System.out.println();
	}

	public static boolean checkSlash(int[][] board, int cr, int cc) {
		// NE
		for (int i = 1; i < board.length; i++) {
			int tr = cr - i;// (5,3)->(4,4)
			int tc = cc + i;
			if (tr < 0 || tc >= board[0].length)
				break;
			if (board[tr][tc] == 1)
				return false;
		}
		// SW
		for (int i = 1; i < board.length; i++) {
			int tr = cr + i;// (5,3)->(4,4)
			int tc = cc - i;
			if (tr >= board.length || tc < 0)
				break;
			if (board[tr][tc] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkBackSlash(int[][] board, int cr, int cc) {
		// NW
		for (int i = 1; i < board.length; i++) {
			int tr = (cr - i);// (5,3)->(4,4)
			int tc = (cc - i);
			if (tr < 0 || tc < 0)
				break;
			if (board[tr][tc] == 1)
				return false;
		}
		// SE
		for (int i = 1; i < board.length; i++) {
			int tr = (cr + i);// (5,3)->(4,4)
			int tc = (cc + i);
			if (tc >= board[0].length || tr >= board.length)
				break;
			if (board[tr][tc] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkMove(int[][] board, int dep, int wid) {
		if (checkSlash(board, dep, wid) && checkBackSlash(board, dep, wid))
			return true;
		return false;
	}

	public static Point nextMove(int[][] board, int dep, int wid) {
		Point nmp= new Point(-1,-1);
		for (int i =dep; i < board.length; i++)
			for(int j = wid; i<board[0].length;j++) {
				if (checkMove(board, i, j)) {
					nmp.setX(i);
					nmp.setY(j);
					return nmp;
				}
			}
		return nmp;
	}

}
