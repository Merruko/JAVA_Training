package practice;

import java.util.Scanner;

/*[문제31]
다음과 같이 영어와 한글을 짝을 이루는 2개의 배열을 만들고
사용자로 부타 영어단어를 입력 받아 한글을 출력하는 프로그램을 작성하시오.
"exit"를 입력하면 프로그램은 종료됩니다.
String eng[] = { "student", "love", "java", "happy", "future" };
String kor[] = { "학생", "사랑", "자바", "행복한" "미래" };
[출력 예]
영어 단어를 입력하세요 >> love (엔터)
사랑
영어 단어를 입력하세요 >> happy (엔터)
행복한
영어 단어를 입력하세요 >> jaba (엔터)
그런 영어 단어가 사전에 없습니다.
영어 단어를 입력하세요 >> exit (엔터)
*/

public class JavaEx031 {

	public static void main(String[] args) {
		
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "학생", "사랑", "자바", "행복한" , "미래" };
		
		Scanner input = new Scanner(System.in);
		boolean a = true;
		
		
		
		while(a==true) {
			
		System.out.println("英語の単語を入力してください：");
		String tango = input.nextLine();
			
		if (tango.equals(eng[0])) {
			
			System.out.println(kor[0]);
			
		}
		
		else if (tango.equals(eng[1])) {
			
			System.out.println(kor[1]);
			
		}
		
		else if (tango.equals(eng[2])) {
			
			System.out.println(kor[2]);
			
		}
		
		else if (tango.equals(eng[3])) {
			
			System.out.println(kor[3]);
			
		}
		
		else if (tango.equals(eng[4])) {
			
			System.out.println(kor[4]);
			
		}
		
		else if (tango.equals("exit")) {
			
			System.out.println("終了");
			a = false;
			
		}
		
		else {
			
			System.out.println("辞書にない単語です。");
			continue;
			
		}
		
	   }
		
	}

}