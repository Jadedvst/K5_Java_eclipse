package ch7Inheritance.Inheritance.starcraft;

public class Unit {
	public static Long MARINTOTANK = 30L;
	private Long health;
	
	public Unit(Long health) {
		this.health = health;
	}

	public Long getHealth() {
		return health;
	}

	public void setHealth(Long health) {
		this.health = health;
		System.out.println("health: " + health);
		if(health < 0L) {
			System.out.println("사망");
		}
	}
	
	public void attack() {
		System.out.println("공격합니다.");
	}
}
