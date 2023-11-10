package assignment_ArraySorting_Lamda;


class StuName implements Comparable<StuName>{
	private String sno;
	private String sname;
	
	StuName(String sno, String sname){
		this.sno = sno;
		this.sname = sname;
	}
	public String toString() {
		return sno+": "+sname;
	}
	
	@Override
	public int compareTo(StuName s) {
		return 	this.sname.compareTo(s.sname);
}
public class ObjectArraySorting_Stringname {

	static void sortStuName(StuName[]data) {
		StuName temp;
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
		
		StuName [] data = {
				new StuName("12", "홍길동"),
				new StuName("121", "홍길순"),
				new StuName("213", "홍길춘"),
				new StuName("9", "홍길홍")
		};
	for (StuName st: data)
			System.out.print(" " + st);
	
	sortStuName(data);
	//Arrays.sort(data);//이게 문제가 있어서 sortStuName()를 구현
	for (StuName st: data)
		System.out.print(" " + st);
}
}
}