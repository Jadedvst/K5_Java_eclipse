package cha10CollectionAPI.map;

import java.util.HashMap;
import java.util.Set;

public class Test06 {

	public static void main(String[] args) {
		String word[] = {"BUMBLEBEE","HEAVEN","ALTHOUGH","WONDER"};
		String meaning[]= {"꿀벌과에 속하는 호박벌","천군","그럼에도 불구하고","호기심이 들다"};
		
		HashMap<String,String> dic= new HashMap<String,String>();
		// dic 은 그저 참조일뿐 데이터는 key(word) and value(meaning) 에 저장

		for(int i = 0; i<word.length;i++) {
			dic.put(word[i],meaning[i]);
		}
		
		System.out.println("1: "+ dic);
		System.out.println("2: "+ dic.size());
		
		System.out.println("3 "+dic.keySet()); //key 는 중복 불가
		///////////////////////////////////////////
		Set<String> keys = dic.keySet();
		for(String key : keys) {
			System.out.println("\t"
					+ key
					+ ":"
					+ dic.get(key));
		}//순서가 다 다름
		//////////////////////////////////////////
		System.out.println("4 "+dic.values());
		
		System.out.println("4 " +"HEAVEN : "+dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주 행복한 감정");
		System.out.println("5 "
				+ "HEAVEN : "+dic.get("HEAVEN"));
		dic.replace("HEAVEN", "이상적인 세상");
		System.out.println("6 "
				+ "HEAVEN : "+dic.get("HEAVEN"));

		System.out.println("7 "
				+ dic.containsKey("BUMBLEBEE"));
		System.out.println("8 "
				+ dic.containsValue("자장가"));
		
		dic.remove("HEAVEN");
		System.out.println("8 "+dic.containsKey("HEAVEN"));
		
		dic.clear();
		System.out.println("9 "
				+ dic.isEmpty());
		System.out.println("10"
				+ dic.size());
	}

}
