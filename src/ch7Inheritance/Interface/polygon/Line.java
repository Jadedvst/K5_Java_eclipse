package ch7Inheritance.Interface.polygon;

public class Line extends Geometry {

	@Override
	public double getLength() {
		int[] xArr = getXArr();
		int[] yArr = getYArr();
		
		
//		xArr[0],yArr[0];
//		xArr[1],yArr[1];
		double leng = Math.sqrt(Math.pow(xArr[0]-xArr[1],2)
								+ Math.pow(yArr[0]-yArr[1], 2));
		return leng;
		//return leng;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
