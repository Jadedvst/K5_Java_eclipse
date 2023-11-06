package cha12InOutput;

import java.io.File;
import java.io.PrintWriter;

public class Test05 {

	public static void main(String[] args) {
		try {
			File dir = new File("c:\\work");//특수문자 \을 사용하기 위한 \ => c:\work\a.txt
			dir.mkdir();//지정된 경로의 디렉터리 생성
			
			File file = new File(dir,"file1.txt");
			file.createNewFile();
			File img = new File(dir,"img1.jpg");
			file.createNewFile();
			
			//파일또는 디렉터리 여부 판단
			if (dir.isDirectory())
				System.out.println(dir.getName()+ "은 디렉터리입니다.");
			if (file.isFile())
				System.out.println(file.getName()+"은 파일입니다.");
			if (img.isFile())
				System.out.println(file.getName()+"은 파일입니다.");
			//파일에 데이터 출력 후 읽기
			if(file.exists()) {
				try(PrintWriter out = new PrintWriter(file)){
					out.println("hello java!");
				}
				System.out.println("파일 이름: "+file.getName());
				System.out.println("이미지 파일 이름: "+img.getName());
				System.out.println("파일 경로: "+file.getPath());
				System.out.println("쓰기 기능: "+file.canWrite());
				System.out.println("읽기 기능: "+file.canRead());
				System.out.println("파일 길이: "+file.length()+" 바이트");
				
			}else{
				System.out.println("작업할 파일 무");
			}
			File subDir = new File("c:\\work\\subDir");
			subDir.mkdir();
			File file2 = new File(subDir,"file2.txt");
			file2.createNewFile();
			
			//파일 절대 경로
			String file2Path = file2.getAbsolutePath();
			System.out.println("절대 경로: "+file2Path);
			
			//부모 디렉터리
			String parentDir = file2.getParent();
			System.out.println("절대 경로: "+parentDir);
			
			//디렉터리 목록
			File parentFile = file.getParentFile();
			String[] fileNames = parentFile.list();
			System.out.println(parentDir+"목록 ==>");
			for(String name: fileNames) {
				System.out.println(name);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
