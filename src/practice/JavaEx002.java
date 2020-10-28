package practice;

import java.util.Scanner;

public class JavaEx002 {

	public static void main(String[] args) {
	
	/* 	문제2]
			초를 의미하는 정수를 입력 받고 입력 받은 정수의
			초를 몇 시간, 몇 분, 몇 초인지를 구하는 프로그램을 작성하시오.
			[결과]
			정수(초)를 입력하세요 : 500 (엔터)
			500초는 0시간, 8분, 20초입니다. 	*/
		
			
			int hour;
			int minute;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("整数（秒）を入力してください：");
			
			int seconds = input.nextInt();
			
			hour = seconds / 3600;
			minute = (seconds % 3600) / 60;
					
			System.out.printf("%d秒は%d時間、%d分、%d秒です。",seconds,hour,minute,seconds-(hour*3600)-(minute*60));
			
			
	}
			
	

}