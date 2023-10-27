package Practice.geo;

public class GeoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeoPoint p = new GeoPoint();
		p.inputCoordi(10,20);
		p.getLength();
		p.getArea();
		System.out.println("길이:"+p.getLength());
		
		GeoLine l = new GeoLine();
		l.inputCoordi(10,20);
		l.inputCoordi(10,30);
		l.getLength();
		l.getArea();
		System.out.println("길이:"+l.getLength());
		
	}

}