package ch7Inheritance.Interface.polygon;

public class TestGeometry {

	public static void main(String[] args) {
		Point  p = new Point();
		p.addPoint(10,40);
		System.out.println("점 간 길이 : " + p.getLength());
		
		Line l = new Line();
		l.addPoint(10,20);
		l.addPoint(40,60);
		System.out.println("선 길이 : " + l.getLength());
		
		PolyTrain t = new PolyTrain();
		t.addPoint(0, 0);
		t.addPoint(30, 0);
		t.addPoint(0, 40);
		System.out.println("삼각형 길이 : " + Math.round(t.getLength()*100)/100.0);
		System.out.println("삼각형 면적 : " + t.getArea());
		
		t.clearPoint();
		t.addPoint(0, 0);
		t.addPoint(10, 0);
		t.addPoint(20, 10);
		t.addPoint(40, 40);
		t.addPoint(0, 40);
		System.out.println("다각형 길이 : " + Math.round(t.getLength()*100)/100.0);
		System.out.println("다각형 면적 : " + t.getArea());
	}

}
