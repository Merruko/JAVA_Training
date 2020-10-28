package practice;

import java.util.Scanner;

public class JavaEx009 {

	public static void main(String[] args) {
		
		/* 문제9]
			크기가 5인 1차원 실수 배열 num을 선언하고,
			키보드로 입력받아 값을 대입한 뒤 배열의 원소에서 최댓값을 출력하시오.
			[결과]
			실수 입력 : 2.2 (엔터)
			실수 입력 : 4.3 (엔터)
			실수 입력 : 7.2 (엔터)
			실수 입력 : 3.5 (엔터)
			실수 입력 : 6.7 (엔터)
			배열의 원소 중에서 가장 큰 값 : 7.2 */
			
			Scanner input = new Scanner(System.in);

			double[] num = new double[5];
			double max = 0;

			
			for(int i = 0; i < 5; i++) {
				
				System.out.println("実数を入力してください：");
				num[i] = input.nextDouble();
				
				if(num[i] > max) {
					
					max = num[i];
					
				}
				
			}
			
			System.out.println("配列の元素の中で最大値：" + max);
		
	}

}