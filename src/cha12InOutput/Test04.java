package cha12InOutput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;


public class Test04 {
	public static void main(String[] args) {
		try(BufferedInputStream in= new BufferedInputStream(new FileInputStream("a.txt"));
			ByteArrayOutputStream out = new ByteArrayOutputStream();){
			byte[] buf = new byte[1024];
			int len=0;
			while((len=in.read(buf)) != -1) {//버퍼에 있는걸 읽어옴:배열
				out.write(buf,0,len);//버퍼에서 out할땐 스트림
			}
			byte[] arr = out.toByteArray();//배열 스트림으로 출력된걸 byte로 치환
			String s = new String(arr);
			System.out.println(s);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}


}

