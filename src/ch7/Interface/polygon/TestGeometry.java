package ch7.Interface.polygon;

public class TestGeometry {

	public static void main(String[] args) {
		Point  p = new Point();
		p.addPoint(10,40);
		System.out.println("길이 : " + p.getLength());
		System.out.println("면적 : " + p.getArea());
		
		
		Line l = new Line();
		l.addPoint(10,20);
		l.addPoint(40,40);
		System.out.println("길이 : " + l.getLength());
		System.out.println("길이 : " + l.getArea());
		

	}

}
