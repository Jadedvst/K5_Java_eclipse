package ch7.Interface.polygon;

public class Point extends Geometry {
	
	@Override
	public double getLength() {
		int[] xArr = getXArr();
		int[] yArr = getYArr();
	
		return yArr[0] - xArr[0];
		}
		

	@Override
	public double getArea() {
		
		return 0;
	}

}
