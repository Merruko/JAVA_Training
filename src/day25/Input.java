package day25;

import java.io.IOException;

public class Input {
	// 교재 : 515page
	// 표준 입력
	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [ENTER]를 누르세요.");
		int i;
		
		// 1) 1문자 입력
		try {
/*			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);	// (자료형)변수 <--- casting
*/	
		// 2)여러 문자 입력
		while((i=System.in.read()) != -1) {
			System.out.println((char)i);
		} 
		}catch (IOException e) {
			e.printStackTrace();
	}
		
	}

}
