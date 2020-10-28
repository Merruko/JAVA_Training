package day11;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// 프로그램 기본 알고리즘 : SWAP(교환) 알고리즘
		
		int num1 = 30;
		int num2 = 50;
		
		System.out.println("교환전 : " + num1 + " " + num2);
		
		// 교환 처리
		
		/*
		num1 = num2;         // num2의 50이 num1의 30을 덮어씌움  
		num2 = num1;         // num1의 50이 num2의 50을 덮어씌움 
		이게 똑같이 50,50 나오는 이유 : 컴퓨터는 동시에 수행 안하기 때문에
		*/
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("교환후 : " + num1 + " " + num2);
		
		
		
		
		
		
		int[] n = { 30, 50 };
		/* n[0] = 30;
		   n[1] = 50; */
		
		System.out.println("교환전 : " + n[0] + " " + n[1]);
		
		int tmp  = n[0];
		    n[0] = n[1];
		    n[1] = tmp;
		
		System.out.println("교환후 : " + n[0] + " " + n[1]);
		
	}

}