package ch7Inheritance.Interface;

public class MessengerTest {
	public static void main(String[] args) {
	
		IphoneMessenger iphone = new IphoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기"+ Messenger.MIN_SIZE);
		System.out.println("메신저 최소 문자 크기"+ Messenger.MAX_SIZE);
		
		System.out.println(" ");
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();
		Messenger.getConnection(); //public, static이기에 instance 생성은 필요없음
//		Messenger.log();		   //private
		
		System.out.println(" ");
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		
		galaxy.fileDownload();
		galaxy.fileUpload();
		
	}

}
