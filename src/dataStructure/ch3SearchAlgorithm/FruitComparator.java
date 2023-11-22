package dataStructure.ch3SearchAlgorithm;


import java.util.Comparator;


//Fruit 객체 생성 클래스
class FruitCategory{
	String name;

	//생성자
	public FruitCategory(String string) {
		this.name=string;
	}
}
//Fruit 객체 생성 클래스
class Fruit extends FruitCategory{
	int price;
	String expire;
	
	//생성자
	public Fruit(String string, int i, String string2) {
		super(string);
		this.price=i;
		this.expire=string2;
	}
	
	@Override
	public String toString() {
	      return "<" + super.name + ", " + price + ", " + expire+ ">";
	  }

	public int getPrice() {
		return price;
	}
	public String getName() {
		return super.name;
	}

}

class Fruit2 extends FruitCategory{
	int price;
	String expire;
	
	//생성자
	public Fruit2(String string, int i, String string2) {
		super(string);
		this.price=i;
		this.expire=string2;
	}
	
	@Override
	public String toString() {
	      return "<" + super.name + ", " + price + ", " + expire+ ">";
	  }

	public int getPrice() {
		return price;
	}
	public String getName() {
		return super.name;
	}

}
//-------------------------------------------------------------------------------------
//Fruit 타입 객체를 비교하는 클래스
class FruitsNameComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit f1, Fruit f2) {
		if(f1.name.compareTo(f2.name)==0)
			if(f1.price-f2.price==0)
				return f2.expire.compareTo(f1.expire);
			else
				return f1.price-f2.price;
		return f1.name.compareTo(f2.name);
	}
	
}
class FruitsPriceComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit f1, Fruit f2) {
		if(f1.price-f2.price==0)
			if(f1.name.compareTo(f2.name)==0)
				return f2.expire.compareTo(f1.expire);
			else
				return f1.name.compareTo(f2.name);
		return f1.price-f2.price;
	}
	
}
//======================================================================================
public class FruitComparator {
	//현클래스에서 main에서 실행할 methods===================================================
	static void swap(Fruit[] arr, int idx1, int idx2) {
		Fruit temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	static void showData(Fruit[] arr) {
		System.out.println();
		for (Fruit fx: arr) {
			System.out.print(fx+" ");
		}
		System.out.println();
	}
	//---Comparator Class-------------------------------------------------------
	//Comparator Class다른 예시
	private static void sortData(Fruit[] arr, FruitNameComparator cc) {}
	private static void sortData(Fruit   arr,  Comparator<Fruit> cc) {}
	
	//Wildcard를 사용하여 Fruit3의 super 클래스를 들고오기
	static void sortData(Fruit []arr, Comparator<?super Fruit> cc) {
		//cc:Fruit와 Fruit의 조상 객체
		for(int i=0;i<arr.length;i++)
			for(int j=i;j<arr.length;j++)
				if(cc.compare(arr[i],arr[j])>0)
					swap(arr,i,j);
	}
		
//	Comparator<? super Fruit>:
//	signifies a comparator that can compare objects of a type that is either Fruit or a supertype of Fruit.
//	Explanation: The use of the wildcard ? super Fruit allows for greater flexibility. 
//	It means that the comparator can handle not only instances of the exact type Fruit but also instances of any superclass of Fruit.

//	Comparator<Fruit>:
//	denotes a comparator that specifically compares objects of the type Fruit and no other type.
//	Explanation: This is a more restrictive scenario where the comparator 
//	is tailored exclusively for instances of the exact type Fruit 
//	and does not allow for comparisons with objects of any subtype or superclass of Fruit.
//======================================================================================
	public static void main(String[] args) {
		Fruit[] arr = {new Fruit("사과", 200, "2023-5-08"),
				new Fruit("키위", 500, "2023-6-08"),
				new Fruit("오렌지", 200, "2023-7-08"), 
				new Fruit("바나나", 50, "2023-5-18"), 
				new Fruit("수박", 880, "2023-5-28"),
				new Fruit("체리", 10, "2023-9-08")
		};
		
		Fruit2[] arr2 = {new Fruit2("사과", 200, "2023-2-08"),
				new Fruit2("위", 1500, "2023-6-81"),
				new Fruit2("렌지", 20, "2023-7-88"), 
				new Fruit2("나나", 550, "2023-5-58"), 
				new Fruit2("박", 890, "2023-5-78"),
				new Fruit2("리", 190, "2023-9-98")
		};
		//FruitCategory에 두개 넣어서 정렬 다형성 실험
//		int fclen=arr.length+arr2.length;
//		FruitCategory[] arrC=new FruitCategory[fclen];
//		 	System.arraycopy(arr, 0, fclen, 0, arr.length);
//		 	System.arraycopy(arr2, 0, fclen, arr.length, arr2.length);
		 	
		System.out.println("\n정렬전 객체 배열: ");
		showData(arr);
		//Name Comparison
		FruitsNameComparator cc = new FruitsNameComparator();
		sortData(arr, cc);
		//Name Comparison
		
		
		Comparator<FruitCategory> fc = new Comparator<FruitCategory>() {
			@Override
			public int compare(FruitCategory f1, FruitCategory f2) {
				return f1.name.compareTo(f2.name);
			}
		};
		
		sortData(arr, fc);
		System.out.println("\n이름정렬 객체 배열: ");
		showData(arr);
		
		Comparator<Fruit> f = new Comparator<Fruit>() {
	
			@Override
			public int compare(Fruit f1, Fruit f2) {
				if(f1.price-f2.price==0)
					return f2.expire.compareTo(f1.expire);
				else
					return f1.price-f2.price;
			}
		};
		sortData(arr,f);
		System.out.println("\n숫자정렬 객체 배열: ");
		showData(arr);
		}

}
