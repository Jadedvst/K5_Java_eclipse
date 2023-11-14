package assignments.ArraySorting_Lamda;


	class Stu_Int implements Comparable<Stu_Int>{
	String sno;//같은 패키지 주의
	String sname;
	
	Stu_Int(String sno, String sname){
		this.sno = sno;
		this.sname = sname;
	}
	public String toString() {
		return sno+": "+sname;
	}
	
	public int toInt() {
		return Integer.parseInt(sno);
	}
	@Override
	public int compareTo(Stu_Int s) {
		return this.toInt() - s.toInt();
		
	}
}
public class ObjectArraySorting_int {

	static void sortStu_Int(Stu_Int[]data) {
		Stu_Int temp;
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
		Stu_Int [] data = {
				new Stu_Int("12", "홍길동"),
				new Stu_Int("121", "홍길순"),
				new Stu_Int("213", "홍길춘"),
				new Stu_Int("9", "홍길홍")
		};
		sortStu_Int(data);
		//Arrays.sort(data);//이게 문제가 있어서 sortStu_Int()를 구현
		for (Stu_Int st: data)
			System.out.print(" " + st);
	}

}
