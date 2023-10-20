package ch4Array;

public class Test39FORandArray {

	public static void main(String[] args) {
		int[][] arr = new int[5][10];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		////////////행렬 ///////////////
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "");
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		/////////// 대각선 합///////////////
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + ",");
					sum += arr[i][j];
				}

			}

		}
		System.out.println("Sum:" + sum);
		///////////////////////
		int shortsum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < arr[0].length && i<arr.length) // >면 한번더 루프재생시 에러
			shortsum += arr[i][i];
		}
		System.out.println(shortsum);
		/////////////////////////FOR 안에 조건문 추가///////////////////////////////
		shortsum = 0;
		for (int i = 0; i < arr.length && i < arr[0].length; i++) {
			shortsum += arr[i][i];
			if (i > 5)
				break;
		////////////////////////////////////////////////////////////////////////
		}
		System.out.println(shortsum);
	}

}
