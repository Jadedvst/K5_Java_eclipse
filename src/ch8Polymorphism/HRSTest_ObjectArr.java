package ch8Polymorphism;

//-------------------------------------------------------//
public class HRSTest_ObjectArr {
	//HRSTest

	public static void main(String[] args) {
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		
		Manager m1 = new Manager();
		Employee m2 = new Manager();
		Object m3 = new Manager();
		
		Object arr[] = new Object[6];//Object type 의 배열
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
				
		
		for(int i =0; i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
//-------------------------------------------------------//







