package practice;

public class JavaEx007 {

	public static void main(String[] args) {
		
		
	/*	문제7]
		 다음 수열 계산의 결과를 구하는 프로그램을 작성하세요.
		 1-2+3-4+5-6 .... +99-100 = ???  */
		
		int sum = 0;
		
		
		for (int i = 1; i <=100; i++) {
			
			if (i%2 == 0) {
				
				sum -= i;	
				
			}
			
			else if (i%2 != 0) {
				
				sum += i;	
				
			}
			
		}
		
		System.out.println(sum);
	}

}