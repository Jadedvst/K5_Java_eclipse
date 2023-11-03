package cha11Exceptions.customException;

public class NegativeNumberException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeNumberException() {
		super("음수는 허용하지 않습니다");
		
	}

}
