package day08;

public class ExcerciseCh406 {

	public static void main(String[] args) {
		
		 // 문제10) 중첩for문을 이용하여 다음과 같이 출력하기

		 //       System.out.println();        줄바꿈

		 //       System.out.printf("\n");     줄바꿈
			
			
		for (int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(i);
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();


		   /*  [결과]
		       11111 줄바꿈
		       22222 줄바꿈
		       33333 줄바꿈
		       44444 줄바꿈
		       55555 줄바꿈       
		    */

		  
		

		  // 	문제11) 중첩for문을 이용하여 다음과 같이 출력하기

		  //       System.out.println();        줄바꿈

		  //       System.out.printf("\n");   줄바꿈


		int a = 1;
		int s = 1;
		
		for (int i=1;i<=5;i++) {
		
			for (s=a;s<=5;s++) {
				
				System.out.print(s);
				
			}
			
			System.out.println();
			a++;
		}
		

		   /*  
		       [결과]
		       12345 줄바꿈
		       2345 줄바꿈
		       345 줄바꿈
		       45 줄바꿈
		       5 줄바꿈       
		       
		    */

		
	}	

}