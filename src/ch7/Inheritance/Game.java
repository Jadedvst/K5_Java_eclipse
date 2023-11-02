package edu.ch07.inheritance.game;

public class Game {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		
		t.attack();

		m.attack();
		
		m.attack(t);
		m.attack(t);
		m.attack(t);
		m.attack(t);
		
	}
}
