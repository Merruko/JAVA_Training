package day08;

public class ExcerciseCh405 {

	public static void main(String[] args) {
		
		
		  // 문제9) for문 1개를 이용하여 다음과 같이 출력하기

		  //       System.out.println();      줄바꿈  

		  //       System.out.printf("\n");   줄바꿈   
		
		
		int count = 0;
		
		for (int alpha=65;alpha<=90;alpha++) {
			
			System.out.print((char)alpha);
			
			count++;
			
				if(count%5==0) {
					
					System.out.println();
				
				}
			
			
		}
		  
		
		  /*  [결과]
		       ABCDE 줄바꿈
		       FGHIJ 줄바꿈
		       KLMNO 줄바꿈
		       PQRST 줄바꿈
		       UVWXY 줄바꿈
		       Z
		    */
		
		

	}

}