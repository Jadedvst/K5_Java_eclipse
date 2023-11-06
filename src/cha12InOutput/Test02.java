package cha12InOutput;

import java.io.InputStream;
import java.io.PrintStream;

public class Test02 {

	public static void main(String[] args) {
		try(InputStream keyboard = System.in; PrintStream console = System.out;){
			int c = 0;
			while((c=keyboard.read())!=-1) {
				console.write(c);//in PrintStream to Monitor
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//표준 입출력:
				//(C)Std in:키보드 입력=>(Java)System.in
				//(C)Std out:모니터 출력=>(Java)System.out.println()
	}

}

