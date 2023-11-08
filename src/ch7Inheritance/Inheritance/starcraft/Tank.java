package ch7Inheritance.Inheritance.starcraft;

public class Tank extends Unit {
	
	public Tank() {
		super(100L);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("포탄 발사~");
	}

	public void attacked(Marine m) {
		super.setHealth(super.getHealth() - Unit.MARINTOTANK);
	}
}
