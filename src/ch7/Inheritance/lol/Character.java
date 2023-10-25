package ch7.Inheritance.game;

public class Character extends Unit {
	public Character () {
		super(50L);
	}
	public void attack() {
		super.attack();
		System.out.println("총을 쏩니다.");
	}
}
