package ch6objectOriented;

public class ArmorTest {

	public static void main(String[] args) {
		Armor suit1 = new Armor();//Instance
		Armor suit2 = new Armor();
		
		suit1.setName("mark 6");
		suit1.setHeight(180);
		
		suit2.setName("mark 10");
		suit2.setHeight(170);

		
		
		System.out.println(suit1.getName()+": "+suit1.getHeight());
		System.out.println(suit2.getName()+": "+suit2.getHeight());
	}

}
