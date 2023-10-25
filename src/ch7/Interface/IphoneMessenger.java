package ch7.Interface;

public class IphoneMessenger extends GraphicIOS implements Messenger {
	
	@Override //부모에 있는 메서드에서만 사용 가능(생략 가능)
	public String getMessage() {
		return "iPhone";
	}
	@Override 
	public void setMessage(String msg) {
		System.out.println(getMessage()+"에서 메서지를 설정합니다:"+msg);
	}
	
	public void clearMessage() {
		System.out.println("좌우를 흔들어 문자열을 지웁니다.");
	}
	

}
