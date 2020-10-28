package day08;

import java.util.Scanner;

public class ExcerciseCh407 {

	public static void main(String[] args) {
		
		  // 문제12) // 최대값과 최소값 구하기

		  // 5개의 정수를 입력받아

		  // 최대값(max)와 최소값(min)을 출력하여라.

			Scanner in = new Scanner(System.in);
			
			int max = 0;
			int min = 0;
			
			for (int i = 1;i<6;i++) {
				
				System.out.println("整数を入力してください : ");
				int num = in.nextInt();
				
				if (num > max) {
					max = num;
				}					
					
					if(num < min || min == 0) {
                         min = num;
					}
					

				}
				
				
			System.out.println("最大値 : " + max);
			System.out.println("最低値 : " + min);		
			
		
		  /* [결과]
		   * 입력1 : 5
		   * 입력2 : 2
		   * 입력3 : 3
		   * 입력4 : -3
		   * 입력5 : 10
		   * 최대값 :  10
		   * 최소값 : -3
		   */

	}

}