package day05;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {

		
		// 삼항연산자와 %연산자를 이용해 짝홀 판단한걸 -> if-else 문으로..
		
		/*int num = 30;
		String result= (num%2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "은" + result + "입니다.");*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = input.nextInt();
	
		if(num%2 == 0) {
			System.out.println("짝수입니다."); // 참_실행문;
			
		} else {
			System.out.println("홀수입니다."); // 거짓_실행문;
		}
		
	}

}