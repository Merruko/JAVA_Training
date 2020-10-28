package rv_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("종료합니다.");
			}
		}
		System.out.println("프로그램을 수행하였습니다.");	
	}
}