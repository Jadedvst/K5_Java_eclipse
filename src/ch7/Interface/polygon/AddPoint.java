package ch7.Interface.polygon;

public class AddPoint {

public static void main(String[] args) {
	private int[] xArr;
	private int[] yArr;
	
	int[] getXArr() {return xArr;}
	int[] getYArr() {return yArr;}
	
	void addPoint(int x, int y) {
		
		if (xArr == null) {// Line 일 경우 heap에 메모리가 할당되어있
			xArr = new int[1];
			yArr = new int[1];
			xArr[0] = x;
			yArr[0] = y;
		}else {
			int tlen= xArr.length;
			int [] txArr = new int[tlen+1];
			int [] tyArr = new int[tlen+1];
			for(int i=0;i<xArr.length;i++) {
				txArr[i]=xArr[i];
				tyArr[i]=yArr[i];
			}
			txArr[tlen] = x;
			tyArr[tlen] = y;
			xArr = txArr;
			yArr = tyArr;		
		}
					
		xArr[0] = x;
		yArr[0] = y;
	}
	

}
