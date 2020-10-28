package day05;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {
		// 계절 코드(1,2,3,4)를 입력 받아
		// 사계절 메시지를 출력하여라
		
		Scanner input = new Scanner(System.in);
		System.out.println("코드 : ");
		int season = input.nextInt();
		
		if (season == 1) {
			System.out.println("봄");
		} else if (season == 2) {
			System.out.println("여름");
		} else if (season == 3) {
			System.out.println("가을");
		} else if (season == 4) {
			System.out.println("겨울");
		} else {
			System.out.println("계절코드를 잘못 입력하셨습니다.");
		}

	}

}