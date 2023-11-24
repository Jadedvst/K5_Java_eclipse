package dataStructure.ch3SearchAlgorithm;

public class Test3_3GenericClassTester {

	static class GenericClass<T>{
		private T whattype;
		GenericClass(T test1){
			this.whattype = test1;
		}
		
		T getType() {
			return whattype;
		}
	}
	
	public static void main(String[] args) {
		// 자료형태 제약을 받지 않지 위해 사용됨
		// 즉, 예를 들어 Test3_8의 PhyscData4 안의 값이 String, Integer, Double로 
		// Comparator에서 비교하는 자료형태의 제약이 없음
		GenericClass<String> s = new GenericClass<String>("String Type");
		GenericClass<Integer> i = new GenericClass<Integer>(123);
		
		System.out.println(s.getType());//"String Type"
		System.out.println(i.getType());//123

	}

}
