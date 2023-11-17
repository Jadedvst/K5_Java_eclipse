package assignments.ObjectListSorting;

import java.util.ArrayList;
/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Student2{
	String sno;
	String sname;
	
	public Student2(String sno, String sname) {
		this.sno=sno;
		this.sname=sname;
	}
	
	public String toString() {
		return "[" + sno + ", " + sname+"]";
	}
}


public class CollectionSorting_Comparator {
	static void sortStudent(List<Student2> data, Comparator<Student2> comp) {

		Student2 temp;
		for (int i = 0; i < data.size();i++) 
			for (int j = i + 1; j < data.size(); j++){
//				Student2 si=data.get(i);
//				Student2 sj=data.get(j);
//				if (comp.compare(si,sj)>0) {
//				data.set(i,sj);
//				data.set(j,si);
				if (comp.compare(data.get(i),data.get(j))>0) {
					temp=data.get(i);
					data.set(i,data.get(j));
					data.set(j,temp);
				}
		}
	
	}
	
	public static void main(String[] args) {
		try {
			
		Comparator<Student2> compSno = new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return Integer.parseInt(s1.sno)-Integer.parseInt(s2.sno);
			}
		};
		Comparator<Student2> compName = new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s1.sname.compareTo(s2.sname);
			}
		};
		List<Student2> al = new ArrayList<>();
		al.add(new Student2("1001", "김풍"));
		al.add(new Student2("09", "김"));
		al.add(new Student2("2703", "홍길동"));
		al.add(new Student2("004", "홍"));

		sortStudent(al, compSno);
		System.out.println("sort: ");
		for (Student2 st: al)
			System.out.print(" " + st);
		System.out.println("");
		//Arrays.sort(data, compName);//이게 문제가 있어서 sortStudent()를 구현
		//Collections.sort(al, compName);
		
		List<Student2> al2 = new ArrayList<>();
		al2.add(new Student2("1001", "김풍"));
		al2.add(new Student2("09", "김"));
		al2.add(new Student2("2703", "홍길동"));
		al2.add(new Student2("004", "홍"));
		
		Collections.sort(al2, new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				return Integer.parseInt(o1.sno)-Integer.parseInt(o2.sno);
			}
		});
		System.out.println("Collection: ");
		for (Student2 st: al2)
			System.out.print(" " + st);
		System.out.println("");
		


		
		List<Student2> al3 = new ArrayList<>();
		al3.add(new Student2("1001", "김풍"));
		al3.add(new Student2("09", "김"));
		al3.add(new Student2("2703", "홍길동"));
		al3.add(new Student2("004", "홍"));
		//유일 함수여서 가능
		//Collections.sort(al3, (s1, s2) -> Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno));
		Collections.sort(al3, (s1, s2) -> {return Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno);});
		
		System.out.println("Collection Lamda: ");
		for (Student2 st: al3)
			System.out.print(" " + st);
		System.out.println("");
		

//		//List는 Collection안에 있는것이라 사용가능하고
//		//Arrays에는 속하지 않아서 사용이 불가하다
//		Arrays.sort(al4, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return 0;
//			}
//		});
//		al4.forEach(st->System.out.println(st));
		
	}catch(Exception e) {
		e.getMessage();
	}
	}

}
