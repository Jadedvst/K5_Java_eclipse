package cha12InOutput;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test06_1 {

	public static void main(String[] args) {
		try {
			//디렉터리 생성
			Path dir = Paths.get("c:","work2","subDir");
			Files.createDirectories(dir);
			
			//파일 생성
			Path file1=Paths.get("c:\\work2\\file1.txt");
			Files.createFile(file1);
			
			//File을 Path로 변환
			File f1 = new File()
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
