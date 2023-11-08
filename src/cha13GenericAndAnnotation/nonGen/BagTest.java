package cha13GenericAndAnnotation.nonGen;

class Bag {
	private Object thing;
		
	public Bag(Object thing) {
		this.thing = thing;
	}
	
	public Object getThing() {
		return thing;
	}
	
	public void setThing(Object thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("Object의 타입은 "+thing.getClass().getName());
	}

}

class Book{}
class PencilCase{}
class Notebook{}

public class BagTest{
	public static void main(String[] args) {
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());
		
		// Strong Type Checking// type이 다 오브젝트
		Book book = (Book) bag.getThing();
		PencilCase pc = (PencilCase) bag2.getThing();
		Notebook nb = (Notebook ) bag3.getThing();
		bag2=bag3; //non Type MisMatch
		
		bag.showType();
		bag2.showType();
		bag3.showType();
	}
}