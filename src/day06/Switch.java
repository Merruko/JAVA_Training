package day06;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// 계절 코드(1,2,3,4)를 입력 받아
		// 사계절 메시지를 출력하여라
		
		Scanner input = new Scanner(System.in);
		System.out.println("코드 : ");
		int season = input.nextInt();
		
		switch (season) {
			case 1:
					System.out.println("봄"); break; // break;문이 포함되어 있는 블록을 탈출한다.
			case 2:
					System.out.println("여름"); break;
			case 3:
					System.out.println("가을"); break;
			case 4:
					System.out.println("겨울"); break;
			default:
					System.out.println("계절코드를 잘못 입력하셨습니다.");
		}
	
	}
	
}