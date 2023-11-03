package cha11Exceptions.customException;

public class StrictNegativeNumberException extends Exception {
	int a;
	StrictNegativeNumberException (int b){
		a=b;
	}
	
	public String toString() {
		return ("Exception Number = "+ a );
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StrictNegativeNumberException() {
		super("음수는 허용하지 않습니다");
		
	}
	
	public StrictNegativeNumberException(String message, Throwable cause) {
		super("Negative num");
		
	}

}
