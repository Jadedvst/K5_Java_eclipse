package cha11Exceptions.customException;

public class UserException2 {
	
	public void charge(int time) {
		
		if (time<0) {
			try {
			throw new NegativeNumberException();//예외 강제발생
			} catch(NegativeNumberException e) {
				//예외 처리
			}
		}
	}
}

