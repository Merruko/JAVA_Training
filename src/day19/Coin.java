package day19;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		
		/*
		  
		  Coin.java
		  입력한 금액을 동전으로 교환(잔돈 처리)하는 프로그램을 작성하시오.
		  동전 교환은 화폐단위가 큰 순으로 이루어진다. 
		   입력된 액수만큼 500원, 100원, 50원, 10원짜리 동적으로 교환해주는 프로그램
		   사용할 변수  : money   c500   c100  c50   c10   잔돈(charges)
		   조건1 : 동전의 총수를 최소화
		   조건2 : 고액의 동전을 먼저 교환
		   
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("金額を入力してください：");
		
		int kane = input.nextInt();
		
		int c500 = kane / 500;
		int c100 = (kane % 500) / 100;
		int c50 = ( (kane % 500) % 100 ) / 50;
		int c10 = ( ( (kane % 500) % 100 ) % 50 ) / 10;
		int oturi = ( ( (kane % 500) % 100 ) % 50 ) % 10;
		
		System.out.println("=== 両替  ===");
		
		System.out.println("500ウォン：" + c500);
		System.out.println("100ウォン：" + c100);
		System.out.println("50ウォン：" + c50);
		System.out.println("10ウォン：" + c10);
		System.out.println("おつり：" + oturi);
		

	}

}