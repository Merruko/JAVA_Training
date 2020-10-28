package day05;

import java.util.Scanner;

public class JjakHol {

	public static void main(String[] args) {
		
		/*
		 * 2의 배수 (짝수,even number)
		 * : 0,2,4,6,8,10
		 * : 2로 나누어 떨어지는 수
		 * : 2로 나눈 나머지가 0이 되는 수
		 * 
		 * 삼항연산자와 %연산자를 이용하여
		 * num의 "홀수"/"짝수"을 판별하여 출력하기
		 * 
		 * (조건식) num은 짝수이니?
		 *        1. num%2 == 0
		 *        2. num%2 != 1       
		 */
		
		
		 /*Scanner in = new Scanner(System.in);
		 
	     System.out.print("숫자를 입력해주세요：");
	     
		 int num = in.nextInt();
		 
		 if (num%2 == 0) {
		 
		 System.out.println("[결과]\n"+ num + "은 짝수입니다.");
		 }
		 
		 else {
			 System.out.println("[결과]\n"+ num + "은 홀수입니다.");
		 }
		 
		 }*/ // 내꺼
	
		
	     Scanner in = new Scanner(System.in);
		 
	     System.out.print("숫자를 입력해주세요：");
	     
	     int num = in.nextInt();
	     
		 String result = (num%2 == 0) ? "짝수" : "홀수";
		 
		 System.out.println(result + "입니다."); // 선생님꺼
	

	}
	
}