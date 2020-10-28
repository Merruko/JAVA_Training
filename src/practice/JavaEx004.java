package practice;

import java.util.Scanner;

public class JavaEx004 {

	public static void main(String[] args) {
		
		/* 문제4]
		  
			음료 종류와 잔수를 입력받으면 가격을 알려주는 프로그램을 작성하시오.
			에스프레소는 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이다.
			(if 또는 switch문을 활용하여 작성하세요.)
			[결과]
			=== Happy Coffee MENU ===
			1. 에스프레소 2000원
			2. 아메리카노 2500원
			3. 카푸치노 3000원
			4. 카페라떼 3500원
			5. 종료
			====================
			주문할 음료 : 2 (엔터)
			주문 잔수 : 3 (엔터)
			주문하신 아메리카노 3잔은 7500원 입니다. */
		
			int price;
			int total = 0;
			
			Scanner input = new Scanner(System.in);
			System.out.println("=== Happy Coffee MENU ===\n1. 에스프레소 2000원\n2. 아메리카노 2500원\n3. 카푸치노 3000원\n4. 카페라떼 3500원\n5. 종료\n====================");
			System.out.println("ご注文されるお飲み物：");
			int coffee = input.nextInt();
			System.out.println("何個？：");
			int num = input.nextInt();
		
			if (coffee==1) {
				price = 2000;
				total = price * num;
			}
			
			else if (coffee==2) {
				
				price = 2500;
				total = price * num;
			}
			
			else if (coffee==3) {
				
				price = 3000;
				total = price * num;
			}
			
			else if (coffee==4) {
				
				price = 3500;
				total = price * num;
			}
			
			else if (coffee==5) {
				
				System.out.println("終了");
				
			}
			
			else {
				
				System.out.println("？");
				
			}
			
			System.out.println("ご注文のお飲み物は合わせて" + total + "ウォンになります。");
			
		
	}

}