package cha10CollectionAPI.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
	//	ArrayList<String> list = new ArrayList<생략가능>();
		List<String> list = new ArrayList<>();
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");

//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));		
//		}
		list.forEach(s->System.out.println("fe:"+s));//람다식
		
		list.add("런던"); list.add("로마"); list.add("방콕");
		list.add("북경"); list.add("도쿄"); list.add("서울");
		System.out.println("1:"
				+ list.toString());
		//System.out.println("1:"
		//		+ list);
		
		// 1: [서울, 북경, 상해, 서울, 도쿄, ... ]
		
		System.out.println("---------------------------------------");
		System.out.println("1.1: "+list.indexOf("서울"));
		System.out.println("1.2: "+list.lastIndexOf("서울"));
		
		list.add(1,"LA"); print(2,list);
		
		System.out.println("3: "+list.indexOf("서울"));
		System.out.println("4: "+list.lastIndexOf("서울"));
		
		list.remove("LA"); print(5,list);
		list.remove(2); print(6,list);
		
		System.out.println("7: "+list.contains("LA"));//removed
		
		Object obj[]= list.toArray();
		System.out.println("8: "+Arrays.toString(obj));
		
		String cities[] = new String[15];//Array 선언
		cities = list.toArray(cities);//.toArry(A[]) 안에 list만큼 할당 나머지는 null
		System.out.println("9: "+Arrays.toString(cities));
		
		list.clear(); print(10,list);
		System.out.println("11: "+list.isEmpty());
		
		list.add("파리");
		list.add("방콕");
		list.add("LA");
		List<String> list2 = Arrays.asList("서울","뉴욕","상해"); print(12, list2);
		list.addAll(list2); print(13,list);
		System.out.println("14: "+list.containsAll(list2));	
	
		list.retainAll(list2); print(15,list); //removes all except those in ()=> 교집합
		list.removeAll(list2); print(16,list); //removes all of () => 차집합
		
	}
		public static void print(int n, List<String>list) {
			System.out.println(n+": "+list);
		}

}
