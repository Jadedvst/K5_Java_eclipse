package cha12InOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03_FilterStream_BufferedReader {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("이름을 입력하세요");
			String name =br.readLine();
			String name2 =br.readLine();
			System.out.println("Hello "+name+name2);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
