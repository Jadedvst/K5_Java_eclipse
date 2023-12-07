package dataStructure.ch5Recursive.queen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BishopFour {

	public static void SolveBishop(int[][] d) {
		//stack of Points about 20
		//d init d[0][0]=1;
		//stack push
		//go by diag
		// init
		int cnt=0;
		int mode=0;
		int r=0;
		int c=0;
		Stack st = new Stack(20);
		Point p = new Point(r,c);
		

		st.push(p);
		d[r][c]=1;
		cnt++;
		r++;

		
		while(true) {
			if((c=nextMove(d,r,c))==-1) {
				if(st.isEmpty())
					break;
				p =st.pop();
				r=p.getX();
				c=p.getY();
				d[r][c]=0;
				cnt--;
				if((r+1)>=d.length||(c+1)>=d[0].length) c++;
				else {
					r--;
					c++;
				}
				continue; //for it to not go through push
			}
			Point np = new Point(r,c);
			st.push(np);
			d[r][c]=1;
			r++;
			if(r==4) {
				r--;
				c++;
			}
			if((r+c)<4) {
				r+=c;
				c=0;
			}
			else {
				c+=r-3;
				r=3;
			}
			cnt++;
			
			if(cnt==6) {
				mode++;
				System.out.println("mode :: "+mode);
				show(d);
				p =st.pop();
				r=p.getX();
				c=p.getY();
				d[r][c]=0;
				cnt--;
				if(r>=d.length) c++;
				else r++;
				
				
			}
		}
		
	}
	public static void show(int[][] d) {
		for(int[] row: d)
			for(int col:row) {
				System.out.print(col+" ");
			}
		System.out.println();
	}
	
	public static boolean checkSlash(int[][] d, int cr, int cc) {
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
		return true;
	}
	
	public static boolean checkBackSlash(int[][] d, int cr, int cc) {
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
		return true;
	}
	
	public static boolean checkMove(int[][] d, int row, int col) {
		if(checkSlash(d, row, col)&&checkBackSlash(d, row, col)) 
    		return true;
		return false;
	}
	
	public static int nextMove(int[][] d, int row, int col) {
		for(int i =col;i<d[0].length;i++) {
    		if(checkMove(d, row, i%8)) return i%8;
    	}
		return -1;
	}

}
