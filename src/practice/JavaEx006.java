package practice;

import java.util.Scanner;

public class JavaEx006 {
	
	public static void main(String[] args) {
		
		/* 문제6]
		문자 하나와 정수 숫자 하나를 입력 받아 
		입력한 문자를 숫자만큼 반복출력하세요.
		[결과]
		문자 하나 입력 : # (엔터)
		숫자(양수)입력 : 5 (엔터)
		##### */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("文字を入力してください：");
		char mozi = input.next().charAt(0);
		
		System.out.println("数字を入力してください：");
		int suuzi = input.nextInt();
		
		for (int i = 0; i < suuzi; i++) {
			
			System.out.print(mozi);
			
		}
		
	}

}