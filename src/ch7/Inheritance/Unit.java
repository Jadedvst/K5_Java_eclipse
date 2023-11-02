package edu.ch07.inheritance.game;

public class Unit {

	public static Long M2T = 30L;
	public static Long T2M = 120L;
	
	private Long health;
	
	public Unit(Long health) {
		this.health = health;
	}

	public Long getHealth() {
		return health;
	}
	public void setHealth(Long health) {
		this.health = health;
		System.out.println("Health:" + health);
		if (health < 0L) {
			System.out.println("사망하셨습니다.");
		}
	}
	
	public void attack() {
		System.out.println("공격합니다.");
	}
}
