package assignment_ObjectListSorting;

import java.util.ArrayList;
import java.util.List;

public class ERROR_toString {

	public static void main(String[] args) {
		List<Student2> arr2 = new ArrayList<>();
		arr2.add(new Student2("101", "김풍"));
		arr2.add(new Student2("09", "김"));
		arr2.add(new Student2("703", "홍길동"));
		arr2.add(new Student2("004", "홍"));
		
		//arr2.forEach(st->System.out.println(st));
		System.out.println(arr2);
	}

}
