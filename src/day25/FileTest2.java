package day25;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileTest2 {

	public static void main(String[] args) {
		// (공유자원)파일 쓰기
		FileWriter fw = null;
		PrintWriter out = null;
		try {
			String fileName = "sungjuk.txt";
			// 파일 쓰기 모드에서 파일이 없으면 생성됨.
			// true : 추가(append)
			// false : 덮어쓰기
			fw = new FileWriter(fileName, false);
			out = new PrintWriter(fw, true);
			out.println("손흥민,100,100,100");
			out.println("홍길동,90,90,90");
			System.out.println(fileName + "에 쓰기작업이 성공적으로 끝났습니다.");
		} catch(Exception e) {
			System.out.println("파일 쓰기 실패 : " + e);
		} finally {
			try {
				out.close();
				fw.close();
		  } catch(Exception e) { }
		}
	}
}