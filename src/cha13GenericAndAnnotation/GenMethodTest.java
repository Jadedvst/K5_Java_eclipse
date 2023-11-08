package cha13GenericAndAnnotation;

public class GenMethodTest {
	
	static <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
		
		for(int i =0;i<array.length;i++) {
			System.out.println("num = "+num+" array="+array[i]);
			if(array[i]==num)
				return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Integer[] inum = {1,2,3,4,5};
		Double[] dnum = {1.0,2.0,3.0,4.0,5.0};
		String[] snum = {"one","two","three", "four","five"};
		
		boolean b1 = isInclude(3,inum);//boolean 함수 호출
		System.out.println("결과: "+b1);
		
		boolean b2 = isInclude(5.0,dnum);//double version의 코드 생성 후 호출
		System.out.println("결과: "+b2);
		
		//ERROR since String != Number
		//boolean b3 = isInclude("one",snum);
		//System.out.println("결과: "+b3);
		
		GenMethodTest.<Integer,Integer>isInclude(3,inum);
		GenMethodTest.<Double,Double>isInclude(52.0,dnum);
		//GenMehodTest.<String,String>isInclude("one",sum);
	}

}
