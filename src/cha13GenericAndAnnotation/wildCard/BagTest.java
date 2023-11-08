package cha13GenericAndAnnotation.wildCard;

class Bag<T extends Solid> { //Soild 속성,superclass를 상속 받는 객체만을
	private T thing;
	private String owner;
		
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	boolean isSameOwner(Bag<?> obj) {// 어떤 클래스,타입이든 다 가능
		if(this.owner.equals(obj.getOwner()))//.equals,==,.compareTo()
			return true;
		return false;
	}

	public Bag(T thing) {
		this.thing = thing;
	}
	
	public T getThing() {
		return thing;
	}
	
	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은 "+thing.getClass().getName());
	}
	

}

class Solid{}
class Book extends Solid{}
class PencilCase extends Solid{}

public class BagTest{
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<Book>(new Book());
		Bag<PencilCase>bag2 = new Bag<>(new PencilCase());
	
		bag.setOwner("푸름");
		bag2.setOwner("푸름");
		
		boolean result = bag.isSameOwner(bag2);
		
		if (result) System.out.println("소유자 동일");
		else System.out.println("소유자 불일치");

	}
}