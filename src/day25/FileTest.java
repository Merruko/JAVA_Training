package day25;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			String fileName = "c:/workspace/basicJava/src/day25/data1.txt"; // 절대경로
			// String fileName = "data1.txt"; // (작업폴더,WD)상대경로
			File file = new File(fileName);
			if(file.exists()) {
				System.out.println(file.length()); 	// 파일 크기(byte)
				System.out.println(file.getName()); // 파일명.확장자
				System.out.println(file.getPath()); // 파일의 위치(절대경로)\파일명.확장명
				System.out.println(file.delete());	// 파일삭제
				
			} else {
				System.out.println(fileName + "파일이 존재하지 않습니다.");
				
			}
		} catch (Exception e) {
			System.out.println("파일 접근 실패 : " + e);
		}
		
	}

}
