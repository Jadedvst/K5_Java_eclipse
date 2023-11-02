package cha10CollectionAPI;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Practice_Collection {

	public static void main(String[] args) {
	//100개의 정수 랜덤 생성(0~100 사이)
		//ArrayList에 입출력
		//전체 값,평균,합,최대,최소
		
	Random rnum = new Random();
	List<Integer> arrlist = new ArrayList();//data type 이 Integer, Wrapper Class
	LinkedList<Integer> linklist = new LinkedList();
	List<Integer> veclist = new Vector();
	int random_number =100;
	
	int total=0;
	int avg=0;
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	
	System.out.println("<ArrayList>");
	System.out.println("전체[ ");
	for(int i = 0; i<random_number; i++) {
		arrlist.add(rnum.nextInt(random_number+1)); //nextInt(exclusive num), nextInt(start, end+1)
		int get = arrlist.get(i);
		if(i==50) System.out.println();

		System.out.print(get+" ");
		total+=get;
		
//		max = (max<arrlist.get(i)?list.get(i):max;		
		if(get>max) 
			max = get;
		if(get<min)
			min = get;
	}
	avg= total/arrlist.size();

	System.out.println("\n]\n합: "+total
			+ ", 평균: " + avg
			+ ", 최대: " + max
			+ ", 최소: " + min);
	
	
	System.out.println("<LinkedList>");//똑같은 interface 상속이기에 외부에서 보기엔 같음
	System.out.print("전체: ");
	total=0;
	avg=0;
	max=0;
	min=1001;
	for(int i = 0; i<random_number; i++) {
		linklist.add(rnum.nextInt(random_number+1));
		int get = linklist.get(i);
		System.out.print(get+" ");
		total+=get;
		if(get>max)
			max = get;
		if(get<min)
			min = get;
	}
	avg= total/random_number;
	
	System.out.println(linklist);
	System.out.println("\n합: "+total
			+ ", 평균: " + avg
			+ ", 최대: " + max
			+ ", 최소: " + min);
	
	System.out.println("<Vector>");
	System.out.print("전체: ");
	total=0;
	avg=0;
	max=0;
	min=1001;
	for(int i = 0; i<random_number; i++) {
		veclist.add(rnum.nextInt(random_number+1));
		int get = veclist.get(i);
		System.out.print(get+" ");
		total+=get;
		if(get>max)
			max=get;
		if(get<min)
			min=get;
	}
	avg=total/random_number;
	System.out.println("\n합: "+total
			+ ", 평균: " + avg
			+ ", 최대: " + max
			+ ", 최소: " + min);
	}

}
