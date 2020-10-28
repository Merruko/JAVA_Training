package day07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		/* [결과]
		 * 숫자 입력 (종료 : 0입력) ?  7 (엔터)
		 * 입력한 값은 7입니다.
		 * 숫자 입력 (종료 : 0입력) ? -5 (엔터)
		 * 입력한 값은 -5입니다.
		 * 숫자 입력 (종료 : 0입력) ?  0 (엔터)
		 */
		
		
		/* 그냥 while 썼을때
		int num = 1;
		Scanner scan = new Scanner(System.in);
		while(num != 0) {
			System.out.println("숫자 입력 (종료 : 0입력) ?");      // 1. 입력 메시지 출력
			num = scan.nextInt();                           // 2. 정수입력
			System.out.println("입력한 값은" + num + "입니다.");  // 3. 출력 메시지	
		*/
		
		
		
		// do while 썼을때
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("숫자 입력 (종료 : 0입력) ?");      // 1. 입력 메시지 출력
			num = scan.nextInt();                           // 2. 정수입력
			System.out.println("입력한 값은" + num + "입니다.");  // 3. 출력 메시지
		
		} while(num !=0);   // 0이 입력되면 종료되지만 무조건 Do의 구문 한번은 실행해라.
		
		
	}

}