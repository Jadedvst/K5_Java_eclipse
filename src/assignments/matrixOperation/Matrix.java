package assignments.matrixOperation;

public class Matrix {
	//Field

	int[][] mS;
	
	public Matrix(int[] array, int s, int r, int c) {
		mS= new int[r][c];
		for(int i =0;i<r;i++) 
			for(int j =0;j<c;j++) {
				this.mS[i][j]=array[s++];
			}
	}
	public Matrix(int r, int c) {
		mS= new int[r][c];
	}

	public void print() {
		for(int i =0;i<mS.length;i++) {
			for(int j =0;j<mS[0].length;j++){
				System.out.print(mS[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

	public static Matrix sum(Matrix mA, Matrix mB) {
		Matrix mC = new Matrix(mA.getRow(),mA.getColumn());
		for(int i =0;i<mA.getRow();i++) {
			for(int j =0;j<mA.getColumn();j++){
				mC.setValue(i,j,mA.getValue(i,j)+mB.getValue(i,j));
			}
		}
		
		return mC;
	}
	public static Matrix multiplication(Matrix mA, Matrix mB) {
		Matrix mC = new Matrix(mA.getRow(),mB.getColumn());
		for(int i =0;i<mA.getRow();i++) 
			for(int j =0;j<mB.getColumn();j++)
				for(int k =0;k<mB.getRow();k++){
					mC.setValue(i,j,mA.getValue(i,k)*mB.getValue(k,j));
			}
		
		
		return mC;
	}

	private void setValue(int i, int j, int k) {
		mS[i][j]+=k;
	}
	private int getValue(int i, int j) {
		return mS[i][j];
	}
	private int getColumn() {
		return mS[0].length;
	}

	private int getRow() {
		return mS.length;
	}
}
