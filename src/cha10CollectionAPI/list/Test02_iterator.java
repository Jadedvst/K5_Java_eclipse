package cha10CollectionAPI.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02_iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		
		
		for(int i =0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\n=======================");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	
	}
}
