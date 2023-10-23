package ch6objectOriented;

public class Armor {//Armor instance를 위한 template
	private String name;
	private int height;
	
	// set에서 이름을 받아서 name을 내보냄
	public String getName() {
		return name;
	}
	public void setName(String name) {//Source>Generate Getter Setter
		this.name = name;//this.현재 클래스
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
