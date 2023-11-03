package cha10CollectionAPI.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test07_print {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String,String>();
		
		dic.put("고진감래", "고생 끝에 즐거움이 옴");
		dic.put("분골쇄신","몸이 부서질 정도로 노력을 다함");
		dic.put("권토중래", "실패를 발판삼아 재기함");
		
		dic.put(null, null);//HashMap 은 null 값 저장 가능
		
		
		//방법1 :key를 가져와서 내용을 빼오기
		Iterator<String> keys = dic.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s:\t%s", key, dic.get(key)));
		}
		
		//방법2 :key와 value를 찍어내기
		for(Map.Entry<String, String> elem: dic.entrySet()) {
			System.out.println(String.format("%s:\t%s", elem.getKey(),elem.getValue()));
		}
		
		//방법3
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s :\t %s", key,dic.get(key)));
		}
	}
}
