package day08;

public class ExcerciseCh404 {

	public static void main(String[] args) {

		
	    // 문제7) 1~100사이의 홀수와 짝수의 합계1

			int num3 = 0;
			int num4 = 0;
			
			for (int i=0;i<100;i++) {
				
				if (i%2 == 0) {
					
					num3 = num3 + i;
					
				}
				
				if (i%2 != 0) {
					
					num4 = num4 + i;
				}
				
					}
					
			System.out.printf("奇数の合計 : %d\n偶数の合計 : %d\n合計 : %d\n",num3,num4,num3+num4);
			
			
			
			
		// 문제8) 1~100사이의 홀수와 짝수의 합계2 : 스위칭(교대) 알고리즘
			
			// 보류
			
			
			
	}
	


}