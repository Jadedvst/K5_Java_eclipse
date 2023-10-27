package ch7.Interface.polygon;

public class PolyTrain extends Geometry {

	@Override
	public double getLength() {
		int[] xArr = getXArr();
		int[] yArr = getYArr();
		int num = xArr.length;
		
		double leng = Math.sqrt(Math.pow(xArr[0]-xArr[num-1],2)
				+ Math.pow(yArr[0]-yArr[num-1], 2));
		
		for (int i = 1; i < num; i++){
			
		leng += Math.sqrt(Math.pow(xArr[i-1]-xArr[i],2)
				+ Math.pow(yArr[i-1]-yArr[i], 2));
		}
		return leng;

	}

	@Override
	public double getArea() {
		int[] xArr = getXArr();
		int[] yArr = getYArr();
		int num = xArr.length;
		
		double gaussXY = xArr[num-1]*yArr[0];
		double gaussYX = xArr[0]*yArr[num-1];
		for (int i = 1; i < num; i++){
			gaussXY += xArr[i-1]*yArr[i];
			gaussYX += xArr[i]*yArr[i-1];
		}
		double area = Math.abs((gaussXY+gaussYX)/2);
		return area;
	}

}