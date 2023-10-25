package ch5Instance;

public class Test40_2 {

	public static int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	private static double avg(int ... a) {//인자의 갯수가 정해지지 않았을 경우 (가변인수)
											//int ... a (5.7) a[]
		double sum = 0.0;
		for (int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;	
	}
	
	private static int min(int ... a) {
	//	int num = 1000;
		int num = a[0];
		for (int i=0;i<a.length;i++) {
			if(num>a[i]) num=a[i];
		}
		return num;
	}
	private static int max(int ... a) {
		int num = 0;
		for (int i=0;i<a.length;i++) {
			if(num<a[i]) num=a[i];
		}
		return num;
	}
	//////////////////////////////////////////
	public static void main(String[] args) {

		System.out.println("sum: "+sum(10,20));	
		System.out.println("avg: "+avg(1,2,3,4,5));
		
		int res = min(10,48,6,47,32);
		System.out.println("min: "+res);
		res = max(10,48,6,47,32);
		System.out.println("max: "+res);
	}

}
