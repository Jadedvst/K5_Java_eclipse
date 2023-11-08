package ch7Inheritance.Inheritance.lol;

public class Unit {

	private String name;
	private long health;
	private int mp;

	public static long T2C = 30L;
	
	
//-------------------------------------------------------------------//
	public Unit(String name) {//자손 클래스로 부터 값을 얻겠다
		this.name = name; //초기화 자료
	}
	public Unit(long health) {//자손 클래스로 부터 값을 얻겠다
		this.health = health; //초기화 자료
	}
	
	public Unit(int mp) {//자손 클래스로 부터 값을 얻겠다
		this.mp = mp; //초기화 자료
	}


//-------------------------------------------------------------------//
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
