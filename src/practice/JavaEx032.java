package practice;

import java.util.Scanner;

/*
다음과 같이 
사용자로 부터 문자열을 입력받아
그 문자열을 역순으로 출력하는 프로그램을 작성하시오.
(문자열을 한 문자씩 역순으로 표시)
[출력 예]
문자열을 입력하세요 >> AB가나 (엔터)
반대로 읽으면 나가BA입니다.
*/

public class JavaEx032 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("文字列入力：");
		
		String str = input.nextLine();
		
		int i = str.length() - 1;
		
		for (; 0 <= i ; i--) {
			
			System.out.print(str.charAt(i));
		
		}
		
	}

}