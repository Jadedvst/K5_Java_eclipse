package cha12InOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01_basicIO {//file name

	public static void main(String[] args) {//JVM;java virtual machine
			//main 도 Test01 의 객체
		try(FileInputStream fi = new FileInputStream("a.txt");//Stream= sequence by byte
				FileOutputStream fo = new FileOutputStream("b.txt");){
			int c = 0;
			while((c=fi.read()) !=-1) {//file을 stream으로 추상화 0,1,...-1:끝
				fo.write(c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	//FileDescription(믈래스) foobj(정수)
	//file description table: file을 정수로 매핑한 것
		//file name |fo
		//--------------
		// a.txt    | 3
		// b.txt    | 4
		
	//unix system calls
		//fo = open("a.txt")
		
		
	//표준 입출력:
		//(C)Std in:키보드 입력=>(Java)System.in
		//(C)Std out:모니터 출력=>(Java)System.out.println()
	}

}
