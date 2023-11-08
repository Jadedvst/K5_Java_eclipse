package cha13GenericAndAnnotation.boundGen;

class Bag<T extends Solid> { //Soild 속성,superclass를 상속 받는 객체만을
	private T thing;
		
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
class Liquid{}


class Book extends Solid{}
class PencilCase extends Solid{}
class Notebook extends Solid{}

class Water extends Liquid{}
class Coffee extends Liquid{}

public class BagTest{
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<Book>(new Book());
		Bag<PencilCase>bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		Bag<Water> bag4= new Bag<>(new Water());//ERROR
		Bag<Coffee> bag5= new Bag<>(new Coffee());//ERROR

	}
}