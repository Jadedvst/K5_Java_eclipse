package cha10CollectionAPI;

public class ArrayListofObjectArray {

	public static void main(String[] args) {
		static void List(int a) {
		List<Point[]> diag =  new ArrayList<>(7);
//		Point [][] diag = new Point[7][];
		for(int i=0;i<7;i++) {
			Point[] parr;
			if(i<4) {	
				parr=new Point[i+1];
				for(int j=0;j<i+1;j++) {
					Point dp = new Point(j, i-j);
					parr[j]=dp;
				}
			}
			else {
				parr=new Point[7-i];
				int idx=0;
				for(int j=i-3;j<7-i;j++) {
					Point dp = new Point(j, i-j);
					parr[idx++]=dp;
				}
			}
			
			diag.add(i, parr);
		}
	
//		System.out.println(diag.get(0));
		for (Point[] parr : diag) {
			System.out.println(Arrays.toString(parr));
		}
		
//		[[0, 0]]
//				[[0, 1], [1, 0]]
//				[[0, 2], [1, 1], [2, 0]]
//				[[0, 3], [1, 2], [2, 1], [3, 0]]
//				[[0, 4], [1, 3], [2, 2]]
//				[[0, 5], [1, 4]]
//		[[0, 6]]
//		
		}
	}

}
