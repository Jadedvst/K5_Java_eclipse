package Practice.geo;

public class GeoPoint extends Geo {

	float x;
	float y;
	
	@Override
	public void inputCoordi(float x, float y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public double getLength() {
		return y - x ;
	}

	@Override
	public double getArea() {
		return 0.0;
	}
	

}
