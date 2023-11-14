package assignments.ArraySorting_Lamda;

/*이미 존재하는 인터페이스
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Comparator;


class StudentOASC {
	String sno;
	String sname;
	public StudentOASC(String sno, String sname) {
		this.sno = sno; this.sname = sname;
	}
	public String toString() {
		return "[" + sno + ", " + sname+"]";
	}

}
public class FuctionalInterfaceMethodasParameter {//방법 4: 함수 매개변수
	static void sortStudentOASC(StudentOASC[]data, Comparator<StudentOASC> comp) {//data:배열 comp:인터패이스
		StudentOASC temp;
		for (int i = 0; i < data.length;i++) {
			for (int j = i + 1; j < data.length; j++){
				if (comp.compare(data[i],data[j])>0) {
					temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}

			}
		}
	}
	
	public static void main(String[] args) {
	

		Comparator<StudentOASC> compNo = new Comparator<StudentOASC>(){
			@Override//Comparator: interface, 익명클래스 방법 2
			public int compare(StudentOASC s1, StudentOASC s2) {
				//sno를 사용한 비교
				return Integer.parseInt(s1.sno)-Integer.parseInt(s2.sno) ;
			}
		};
	
		Comparator<StudentOASC> compName = new Comparator<StudentOASC>(){
			@Override//Comparator: interface, 익명클래스 방법 
			public int compare(StudentOASC s1, StudentOASC s2) {
				//sname를 사용한 비교
				return s1.sname.compareTo(s2.sname) ;
			}
		};
		StudentOASC [] data = {
				new StudentOASC("12", "홍길동"),
				new StudentOASC("121", "박길순"),
				new StudentOASC("213", "김길춘"),
				new StudentOASC("9", "이길홍")
				
		};
		
		sortStudentOASC(data, compName);
		System.out.println("sort: ");
		for (StudentOASC st: data)
			System.out.print(" " + st);
		System.out.println("");
		
		//Arrays.sort(data, comp);//이게 문제가 있어서 sortStudentOASC()를 구현
		//Collections.sort(data, compName);
		
		
		//Comparator: interface, 
		//익명클래스 방법 4: 함수 매개변수
		
		StudentOASC [] data2 = {
				new StudentOASC("12", "홍길동"),
				new StudentOASC("121", "홍길순"),
				new StudentOASC("213", "홍길춘"),
				new StudentOASC("9", "홍길홍")
		};
		Arrays.sort(data2, new Comparator<StudentOASC>() {
			@Override
			public int compare(StudentOASC s1, StudentOASC s2) {
//				return Integer.parseInt(s1.sn0)-Integer.parseInt(s2.sno) ;
				return s1.sname.compareTo(s2.sname);
			}
		});
		System.out.println("Arrays.sort: ");
		for (StudentOASC st: data2)
			System.out.print(" " + st);
		System.out.println("");
		
		
//		StudentOASC s1;
//		StudentOASC s2;
		StudentOASC [] data3 = {
				new StudentOASC("12", "홍길동"),
				new StudentOASC("121", "홍길순"),
				new StudentOASC("213", "홍길춘"),
				new StudentOASC("9", "홍길홍")
		};
	//	(data3, new Comparator<StudentOASC>() {
//
//			@Override
//			public int compare(StudentOASC s1, StudentOASC s2) {
//				return Integer.parseInt(s1.sno)-Integer.parseInt(s2.sno) ;
//			}
//			
//		}).compare(data3[3], data3[0]);
//		System.out.println("방법3: ");
//		for (StudentOASC st: data3)
//			System.out.print(" " + st);
//		System.out.println("");
	}

}
	
