package ch7.Interface.polygon;

public class TestGeometry {

	public static void main(String[] args) {
		Point  p = new Point();
		p.addPoint(10,20);
		
		System.out.println("길이 : " + p.getLength());
		System.out.println("면적 : " + p.getArea());
		
		
//		int l = new Line();
//		p.addPoint(10,20);
//		p.printPoint();
//		System.out.println("길이 : " + p.getLength());
//		System.out.println("길이 : " + p.getArea());
//		
//		int p = new Point();
	}

}
