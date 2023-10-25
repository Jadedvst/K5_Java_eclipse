package ch7.Inheritance.starcraft;

public class Marine extends Unit {
	
	public Marine() {
		super(50L);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("총~");
	}
	
	public void attack(Tank t) {
		t.attacked(this);
	}
}
