package Practice.geo;

public abstract class Geo {

	private float[] xC;
	private float[] yC;

	public abstract double getLength();
	public abstract double getArea();
	
	float[] xCoordi(){return xC;}
	float[] yCoordi(){return yC;}
	
	public void inputCoordi(float x, float y) {
		if (xC == null) {
			xC[0] = x;
			yC[0] = y;
		}else {
			
			
		}
		
	
		
		
	}
}