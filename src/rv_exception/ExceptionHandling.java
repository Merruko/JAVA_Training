package rv_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다."); // a.txt 생성해서 이제 이건 출력안함
		}
		System.out.println("프로그램을 수행하였습니다.");	
	}

}