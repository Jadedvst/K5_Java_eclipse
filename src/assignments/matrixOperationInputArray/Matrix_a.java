package assignments.matrixOperationInputArray;

import java.util.Random;

public class Matrix_a {
	//Field

	int[][] mS;
	int r;
	int c;
	
	//Constructor
	public Matrix_a(int s, int r, int c) {
		Random rd = new Random();
		mS= new int[r][c];
		for(int i =0;i<r;i++) 
			for(int j =0;j<c;j++) {
				this.mS[i][j]=rd.nextInt(30);
			}
		this.r = r;
		this.c= c;
	}

	public Matrix_a(int r, int c) {
		mS= new int[r][c];
	}

	//Method
	
	
	
	public void print() {
		for(int i =0;i<mS.length;i++) {
			for(int j =0;j<mS[0].length;j++){
				System.out.print(mS[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

	public static Matrix_a sum(Matrix_a mA, Matrix_a mB) {
		Matrix_a mC = new Matrix_a(mA.r,mA.c);
		for(int i =0;i<mA.r;i++) {
			for(int j =0;j<mA.c;j++){
				mC.setValue(i,j,mA.getValue(i,j)+mB.getValue(i,j));
			}
		}
		
		return mC;
	}
	public static Matrix_a multiplication(Matrix_a mA, Matrix_a mB) {
		Matrix_a mC = new Matrix_a(mA.r,mB.c);
		for(int i =0;i<mA.r;i++) 
			for(int j =0;j<mB.c;j++)
				for(int k =0;k<mB.r;k++){
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

