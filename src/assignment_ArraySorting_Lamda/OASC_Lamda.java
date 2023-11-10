package assignment_ArraySorting_Lamda;

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
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
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
public class OASC_Lamda {
	static void sortStudentOASC(StudentOASC[]data, Comparator<StudentOASC> comp) {//data:배열 comp:인터패이스
		StudentOASC temp;
		for (int i = 0; i < data.length;i++) {
			for (int j = i + 1; j < data.length; j++){
			

			}
		}
	}
	
	public static void main(String[] args) {
		Comparator<StudentOASC> comp = new Comparator<StudentOASC>(){
			@Override
			public int compare(StudentOASC s1, StudentOASC s2) {
				return 0;
		};
		StudentOASC [] data = {
				new StudentOASC("12", "홍길동"),
				new StudentOASC("121", "홍길순"),
				new StudentOASC("213", "홍길춘"),
				new StudentOASC("9", "홍길홍")
		};
		sortStudentOASC(data, comp);
		//Arrays.sort(data, comp);//이게 문제가 있어서 sortStudentOASC()를 구현
		//Collections.sort(data, comp);
		/*
		Arrays.sort(data, new Comparator<StudentOASC>() {
			@Override
			public int compare(StudentOASC s1, StudentOASC s2) {

		});
		*/
		for (StudentOASC st: data)
			System.out.print(" " + st);
	}

}
	
