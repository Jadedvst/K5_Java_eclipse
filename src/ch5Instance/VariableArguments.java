package ch5Instance;
public class VariableArguments {


	public void test(int... v) {
		System.out.println("tset(int...v)호출");
		for (int x: v) {
			System.out.println(" "+ x);
		}
	}
	
	void land() {}
	void shootLaser() {}
	void launchMissile() {}
}

