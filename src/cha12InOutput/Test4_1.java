package cha12InOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Test4_1 {
	public static void main(String[] args) {
		byte[] arr =null;
		try(BufferedInputStream in= new BufferedInputStream(new FileInputStream("a.txt"));
			ByteArrayOutputStream out = new ByteArrayOutputStream();){
			byte[] buf = new byte[1024];
			int len=0;
			while((len=in.read(buf)) != -1) {//버퍼에 있는걸 읽어옴:배열
				out.write(buf,0,len);//버퍼에서 out할땐 스트림,화면출력Xstream에out
			}
			arr = out.toByteArray();//배열 스트림으로 출력된걸 byte로 치환
			String s = new String(arr);
			System.out.println(s);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		try(BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("a2.txt"))){
			bo.write(arr);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}

