package practice;

import java.util.Scanner;

/*
문자열 배열에 5명의 학생의 이름을 입력받아 저정한 후,
이름의 길이가 가장 긴 이름을 출력하시오.
[출력 예]
5명의 학생 이름 입력 >> 홍길동 신사임당 이익 이순신 정약용
가장 길이가 긴 이름은 신사임당입니다.
*/

public class JavaEx030 {

	public static void main(String[] args) {
		
		String[] namae = new String[5];
		int max = 0;
		String nagai ="";
		
		for (int i = 0; i<5; i++) {
		
		System.out.println("名前を入力してください：");
		Scanner input = new Scanner(System.in);
		namae[i] = input.nextLine();
		
		if (namae[i].length() > max) {
			
			max = namae[i].length();
			nagai = namae[i];
			
		}
		
	}

		System.out.println("一番長い名前は "+nagai+" です。");

	}

}