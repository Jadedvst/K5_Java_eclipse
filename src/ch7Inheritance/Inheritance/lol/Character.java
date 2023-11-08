package ch7Inheritance.Inheritance.lol;

public class Character extends Unit {
	public Character () {
		super(50L);
	}
	public void attack() {
		super.attack();
		System.out.println("총을 쏩니다.");
	}
}
