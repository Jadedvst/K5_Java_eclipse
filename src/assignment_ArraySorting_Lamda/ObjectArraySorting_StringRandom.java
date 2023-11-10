package assignment_ArraySorting_Lamda;

import java.util.Random;

class Student_Random implements Comparable<Student_Random>{
	String sno;
	String sname;
	
	Student_Random(String sno, String sname){
		this.sno = sno;
		this.sname = sname;
	}
	public String toString() {
		return sno+": "+sname;
	}
	
	@Override
	public int compareTo(Student_Random s) {
		System.out.println("Test::");
		System.out.println(this.sno.getClass().getName());
		return 	Integer.parseInt(this.sno)-Integer.parseInt(s.sno);
		//this는 클래스는 가르키는것 . s.sno: s라는 인스턴스(Student_Random)의 학번
	}
}
public class ObjectArraySorting_StringRandom {

	static void sortStudent_Random(Student_Random[]data) {
		Student_Random temp;
		for (int i = 0; i < data.length;i++) {
			for (int j = i + 1; j < data.length; j++){
				if(data[i].compareTo(data[j])>0) {
					System.out.println(i+","+j+":"+data[i]+","+data[j]);
					temp = data[j];
					data[j]=data[i];
					data[i]=temp;
					System.out.println(i+","+j+":"+data[i]+","+data[j]);
				}
			}	
		}
	}
	
	public static void main(String[] args) {
	
			Student_Random [] data = {};
			Random rd = new Random();
			
				for(int i = 0;i<=10;i++) 
					new Student_Random(String.valueOf(rd.nextInt(10000)), "Student{i}");
		for (Student_Random st: data)
				System.out.print(" " + st);
		
		sortStudent_Random(data);
		//Arrays.sort(data);//이게 문제가 있어서 sortStudent_Random()를 구현
		for (Student_Random st: data)
			System.out.print(" " + st);
	}

}
