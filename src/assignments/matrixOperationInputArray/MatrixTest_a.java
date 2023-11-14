package assignments.matrixOperationInputArray;



public class MatrixTest_a {

	public static void main(String[] args) {


		Matrix_a mA = new Matrix_a(0,3,4);
		Matrix_a mB = new Matrix_a(12,3,4);
		mA.print();
		System.out.println("-".repeat(50));
		mB.print();
		
		System.out.println("-".repeat(50));
		Matrix_a mC = Matrix_a.sum(mA,mB);
		mC.print();
		System.out.println("=".repeat(50));
		
		Matrix_a muA = new Matrix_a(0,3,4);
		Matrix_a muB = new Matrix_a(12,4,3);
		muA.print();
		System.out.println("-".repeat(50));
		muB.print();
		System.out.println("-".repeat(50));
		Matrix_a muC = Matrix_a.multiplication(muA,muB);
		muC.print();
		
		
	}

}
