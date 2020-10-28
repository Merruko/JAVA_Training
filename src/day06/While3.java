package day06;

public class While3 {

	public static void main(String[] args) {
		// 교재 109 page
		// 1부터 10까지의 합계(누적) 출력
		
		int i = 1;    // (1) 반복횟수(10회) (2) 항(1~10)
		int sum = 0;
		
		while(i < 11) {
			
			sum += i; // sum = sum + i;
			
			i++;
			
		}
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		
		
		
	}

}