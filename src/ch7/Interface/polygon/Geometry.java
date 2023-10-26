package ch7.Interface.polygon;



 class SimplePoint extends Geometry{
		public double getLength() {
			int[] xArr = getXArr();
			int[] yArr = getYArr();
			
			
//			xArr[0],yArr[0];
//			xArr[1],yArr[1];
			double leng = Math.sqrt(Math.pow(xArr[0]-xArr[1],2)
									+ Math.pow(yArr[0]-yArr[1], 2));
			return xArr[0]-xArr[1];
			//return leng;
		}

		public double getArea() {
			return 0;
		}
	
}	


 class SimpleTest{
	public static void main(String[] args) {
		SimplePoint s = new SimplePoint();
		Line l = new Line();
		l.addPoint(10,20);
		l.addPoint(40,40);
		System.out.println("길이 : " + l.getLength());
		System.out.println("길이 : " + l.getArea());
		
	}
}	

//////////////////////////////////////////////////
public abstract class Geometry {
	
	
	public abstract double getLength();
	public abstract double getArea();
	
	
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


