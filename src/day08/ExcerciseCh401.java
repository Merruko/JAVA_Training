package day08;

import java.util.Scanner;

public class ExcerciseCh401 {

	public static void main(String[] args) {
		
		
		// 문제1) 1~10까지의 정수의 합계를 출력 : for문 활용
		
		
		int num = 0;
		
		for (int i=1;i<11;i++) {
		
			num = num + i;
			
		}
		
		System.out.println("1から10までの整数の 合計 : " + num);
		
		System.out.println();
		
		
		
		// 문제2) 1~end까지의 정수의 합계를 출력 : for문 활용
		
		int num2 = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("整数を入力してください : ");
		int num3 = in.nextInt();
		
		for (int i=1;i<=num3;i++) {
			             
			num2 = num2 + i;
			
		}
		
		System.out.printf("1から%dまでの整数の合計 : %d\n\n", num3,num2);
		
		
		
		// 문제3) start~end까지의 정수의 합계를 출력: for문 활용
		
		
		int num4 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("何から? : ");
		int num5 = input.nextInt();
		System.out.println("何まで? : ");
		int num6 = input.nextInt();
		
		
		for (;num5<=num6;num5++) {
			             
			num4 = num4 + num5;
			
		}
		
		System.out.printf("%dから%dまでの整数の合計 : %d", num5,num6,num4);
		
		
		
	}

}