package day06;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		// 주사위 눈금을 입력(1~6), (정수 1~6 입력 받아)
		// 홀수,짝수 눈금 구별 (switch~case문)
		// "홀수 눈금" 또는 "짝수 눈금" 출력
		
		System.out.println("주사위 눈금 입력(1~6) : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
			System.out.println("홀수 눈금"); break;
		case 2:
		case 4:
		case 6:
			System.out.println("짝수 눈금"); break;
		default:
			System.out.println("주사위는 1~6까지의 눈금만 있습니다.");
			
		}
		
	}

}