package cha10CollectionAPI;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test10_set {

	public static void main(String[] args) {
		
		//랜덤으로 번호 46개를 뽑음
		//로또번호 6 개씩 한 set 에 저장
		
		lotto_generator(5);
		

	}
	
	public static void lotto_generator(int num) {
		Random rd = new Random();
		HashSet<Integer> lotto = null;
		
		
		for(int i=0; i<num; i++) {
			lotto = new HashSet<Integer>();
			
			for(; lotto.size()<=6;) {//while(lotto.size()<=6
				lotto.add(rd.nextInt(46));
			}
		List<Integer> Lottolist = new ArrayList(lotto);
		Collections.sort(Lottolist);
		System.out.println(Lottolist);
	
		}
		
		/// new 필수ㅜㅁㄹㄴ아허;ㅣㅏㅓㄷ쟈ㅓㅗㅁ
	
		
	}
	

}
