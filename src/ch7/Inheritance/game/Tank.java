package edu.ch07.inheritance.game;

public class Tank extends Unit {
	public Tank() {
		super(100L);
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println("포를 쏩니다.");
	}
	public void attacked(Marine marine) {
		super.setHealth(super.getHealth() - Unit.M2T);
	}
}
