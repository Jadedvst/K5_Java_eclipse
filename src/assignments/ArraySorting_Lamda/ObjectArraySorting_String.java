package assignments.ArraySorting_Lamda;


class Student implements Comparable<Student>{
	private String sno;
	private String sname;
	
	Student(String sno, String sname){
		this.sno = sno;
		this.sname = sname;
	}
	public String toString() {
		return sno+": "+sname;
	}
	
	@Override
	public int compareTo(Student s) {
		System.out.println("Test::");
		System.out.println(this.sno.getClass().getName());
		return 	Integer.parseInt(this.sno)-Integer.parseInt(s.sno);
		//this는 클래스는 가르키는것 . s.sno: s라는 인스턴스(Student)의 학번
	}
}
public class ObjectArraySorting_String {

	static void sortStudent(Student[]data) {
		Student temp;
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
	
			Student [] data = {
					new Student("12", "홍길동"),
					new Student("121", "홍길순"),
					new Student("213", "홍길춘"),
					new Student("9", "홍길홍")
			};
		for (Student st: data)
				System.out.print(" " + st);
		
		sortStudent(data);
		//Arrays.sort(data);//이게 문제가 있어서 sortStudent()를 구현
		for (Student st: data)
			System.out.print(" " + st);
	}

}
