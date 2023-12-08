package dataStructure.ch5Recursive.queen;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Bishop {

	public static void SolveBishop(int[][] board, int max) {
		// stack of Points about 20
		// board init board[0][0]=1;
		// stack push
		// go by diag
		// init
		int cnt = 0;
		int mode = 0;
		int dep = 0;
		int wid = 0;
		Stack st = new Stack(board.length*board[0].length+10);
		HashMap<String,Integer> modes = new HashMap<>();
		Point p = new Point(dep, wid);
		st.push(p);
		board[dep][wid] = 1;
		cnt++;
		wid++;
		
		
//		System.out.println(nextMove(board,dep,wid));
		//말을 둔 후 보드를 다 체크
		//팝 후 다음 자리 부터 확인
		//푸쉬도 다음 자리 부터 확인
		
		while (true) {
//			System.out.println(dep+","+wid);
//			show(board);
			Point np =nextMove(board,dep,wid);
			if((wid=(np.getY()))==-1) {
				if(st.isEmpty())
					break;
				p=st.pop();
				cnt--;
				dep=p.getX();
				wid=p.getY();
				board[dep][wid]=0;
				wid++;
				if(wid==board[0].length) {
					wid=0;
					dep++;
				}
				continue;
			}
			dep = np.getX();
			st.push(np);
			cnt++;
			board[dep][wid]=1;
			wid++;
			if(wid==board[0].length) {
				wid=0;
				dep++;
			}

			if(cnt==max) { //mode4: 16개 mode8: 256
//			if(dep==board.length&&cnt>=4) {
				mode++;
				System.out.println("(count="+cnt+")");
				String str ="mode::"+mode+"\n"+showString(board);
				System.out.println(str);
				modes.put(str,cnt);
				p=st.pop();
				cnt--;
				dep=p.getX();
				wid=p.getY();
				board[dep][wid]=0;
				wid++;
				if(wid==board[0].length) {
					wid=0;
					dep++;
				}
			}
			
		}

	}
	
	public static void show(int[][] board) {
		String str = "";
		for (int[] dep : board) {
			for (int wid : dep) {
				System.out.print(wid + " ");
//				str+=wid+" ";
			}
		System.out.println();
//			str+="\n";
		}
//		return str;
	}
	
	public static String showString(int[][] board) {
		String str = "";
		for (int[] dep : board) {
			for (int wid : dep) {
				str+=wid+" ";
			}
			str+="\n";
		}
		return str;
	}
	
//	cnt 배출이 여러개일경우, value에 cnt 를 저장하여 cnt 배열대로 뽑기
//  호출시 for(i=max 부터 돌아서)
//		getKeysByValue(modes,i)
//	public static <T, E> Set<T> getKeysByValue(HashMap<T, E> map, E value) {
//	    Set<T> keys = new HashSet<T>();
//	    for (Entry<T, E> entry : map.entrySet()) {
//	        if (Objects.equals(value, entry.getValue())) {
//	            keys.add(entry.getKey());
//	        }
//	    }
//	    return keys;
//	}

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
		if(dep>=board.length) return nmp;
		
		// 아래 for문으로 다 돌리지 않게 주의!!!!!!
		for(int j = wid; j<board[0].length;j++) {
//			System.out.println("checkj");
			if (checkMove(board, dep, j)) {
				nmp.setX(dep);
				nmp.setY(j);
				return nmp;
			}
		}
		for (int i =dep+1; i < board.length; i++) {
//			System.out.println("checki");
			for(int j = 0; j<board[0].length;j++) {
//				System.out.println("checkj");
				if (checkMove(board, i, j)) {
					nmp.setX(i);
					nmp.setY(j);
					return nmp;
				}
			}
		}
		return nmp;
	}

}
