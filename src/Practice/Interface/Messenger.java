package Practice.Interface;

public interface Messenger {
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	//start if true message
			//message 입력, 출력
			
			//clear message, or change keyboard

	public abstract String getMessage();//abstract Method
	
	public abstract void setMessage(String msg);


	public default void setlogin(boolean login){
		log();
		if (login == true) {
			System.out.println("로그인이 되었습니다.");
		}else {
			System.out.println("로그아웃 되었습니다.");
		}
	}
	
	private static void log() {
		System.out.println("Start!");
	}
}
