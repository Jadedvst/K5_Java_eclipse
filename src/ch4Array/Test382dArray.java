package ch4Array;

public class Test382dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i =0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=num++;
			}
		}
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"|");
				System.out.print("\t");
			}
		System.out.println("\n".repeat(5));	
		}
		
		
//		
//		int[][] arr2 = new int[5][5];
//		int num2 = 1;
//		for (int i =0; i<arr2.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				arr[i][j]=num2++;
//				System.out.print(arr[i][j]+"|");
//				System.out.print("\t");
//			}
//			System.out.println("\n".repeat(5));	
//		}
	}

}
