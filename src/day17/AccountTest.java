package day17;

import java.util.Scanner;

class Account {
	
	private int zangaku = 0;
	
	public void nyukin (int kane) {
	
		zangaku += kane;
		
	}
	
	public void syukin (int kane) {
		
		zangaku -= kane;
		
	}
	
	public void syoukai () {
		
		System.out.println("残額：" + zangaku);
		
	}
	
}


public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("1.入金 | 2.出金 | 3.照会 | 4.終了");
		
		int num1 = input.nextInt();
		
		if (num1==1) {
			
			System.out.println("入金額：");
			
			int num2 = input.nextInt();
			
			account.nyukin(num2);
			
		}
		
		if (num1==2) {
			
			System.out.println("出金額：");
			
			int num2 = input.nextInt();
			
			account.syukin(num2);
			
		}
		
		if (num1==3) {
			
			account.syoukai();
			
		}
		
		else if (num1==4) {
			
			System.out.println("終了");
			
		}
		

		
		}
		
	}
	
}