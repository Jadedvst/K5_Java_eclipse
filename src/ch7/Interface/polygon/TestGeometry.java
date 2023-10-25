package ch7.Interface.polygon;

public class TestGeometry {

	public static void main(String[] args) {
		Point  p = new Point();
		p.addPoint(10,20);
		System.out.println("길이 : " + p.getLength());
		System.out.println("면적 : " + p.getArea());
		
		
		Line l = new Line();
		p.addPoint(10,20);
		p.addPoint(40,40);
		System.out.println("길이 : " + p.getLength());
		System.out.println("길이 : " + p.getArea());
		

	}

}
