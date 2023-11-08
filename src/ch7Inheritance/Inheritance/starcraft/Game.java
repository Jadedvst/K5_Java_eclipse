package ch7Inheritance.Inheritance.starcraft;

public class Game {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		
		m.attack();
		t.attack();
		
		m.attack(t);
		m.attack(t);
		m.attack(t);
		m.attack(t);
	}
}
