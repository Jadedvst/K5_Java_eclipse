package ch7Inheritance.Inheritance.lol;

public class Tower extends Unit{
//	private int damage = 100;
//	private int radius = 10;
//	
	public Tower() {
		super(100L);
	}
	
	public void attack() {
		System.out.println("포를 쏩니다");
	}
	

//	public int attack(int distance) {
//		if (radius >= distance)	
//		return this.damage;
//	
//	}
}
