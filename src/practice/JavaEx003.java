package practice;

import java.util.Scanner;

public class JavaEx003 {
	
	public static void main (String[] args) {
		
		/* 문제3]
		다음 if-else문을 switch 문으로 변경하여 작성하시오.
		(임의의 정수형 변수 i를 선언후 키보드로 입력받고 판별하시오)
		if(i == 1) System.out.println("one");
		else if(i == 2) System.out.println("two");
		else if(i == 3) System.out.println("three");
		else System.out.println("?"); */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("入力してください：");
		
		int i = input.nextInt();
		
		switch (i) {
		case 1:
				System.out.println("one"); break;
		case 2:
				System.out.println("two"); break;
		case 3:
				System.out.println("three"); break;
		default:
				System.out.println("?");
		
		
	}
	
}
	
}