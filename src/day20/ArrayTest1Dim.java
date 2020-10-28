package day20;

import java.util.Scanner;

public class ArrayTest1Dim {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0 ; i < 6; i++) {
		
		System.out.printf("%d階の住民の数：\n",i+1);
		arr[i] = input.nextInt();
		sum += arr[i];
		
		}
		
		System.out.println("ソマンアパトの住民の数：" + sum);
		
	}

}