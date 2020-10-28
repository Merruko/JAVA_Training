package day08;

public class ExcerciseCh403 {

	public static void main(String[] args) {
		
		
				// 문제5) 1~10 사이의 짝수의 갯수 출력
		
					int num = 0;
					for (int i=0;i<10;i++) {
					
					if (i%2==0) {
						num++;	
					}
						}
				
					System.out.println("偶数の数 : " + num);

					
					
			    // 문제6) 서기1년~2020년 사이의 윤년(LeapYear)의 갯수 출력
				     
				/*	1. 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. (1988년, 1992년, 1996년, 2004년...)
					2. 서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. (1900년, 2100년, 2200년, 2300년, 2500년...)
					3. 서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. (2000년, 2400년...)   */
					
				     int num2 = 0;
				     for (int i=0;i<2020;i++) {
				     
				    	 if (i%4==0 && i%100!=0 || i%400==0) {
				    		 
				    		 num2++;
				    		 
				    	 }
				    	 
				     }
				     
				     System.out.println("うるう年の数：" + num2);
	
	}
	
}