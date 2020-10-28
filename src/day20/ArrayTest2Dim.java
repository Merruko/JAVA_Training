package day20;

import java.util.Scanner;

public class ArrayTest2Dim {
	
	public static void main(String[] args) {
		
		int arr[][] = new int [3][2];		
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0 ; i < 3; i++) {
						
			for (int j=0; j<2; j++) {

				System.out.printf("%d階%d号の住民の数：\n",i+1,j+1);

				arr[i][j]  =input.nextInt();
				sum += arr[i][j];
			
			}
			
		}
	
		System.out.println("1階住民の数 : " + (arr[0][0] + arr[0][1]));
		System.out.println("2階住民の数 : " + (arr[1][0] + arr[1][1]));
		System.out.println("3階住民の数 : " + (arr[2][0] + arr[2][1]));
		System.out.println("総住民の数 : " + sum);
		
	}

}