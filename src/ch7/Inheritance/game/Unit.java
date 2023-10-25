package ch7.Inheritance.game;

public class Unit {

	private String name;
	private long health;

	public static long T2C = 30L;
	
	

	public Unit(long health) {//자손 클래스로 부터 값을 얻겠다
		this.health = health; //초기화 자료
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getHealth() {
		return health;
	}
	public void setHealth(long health) {
		this.health = health;
	}


	public void attack() {
		System.out.println("공격합니다");
	}
	
	public String toString() {
		return name +":"+ health +","+damage;
		
	}


}
