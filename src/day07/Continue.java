package day07;

public class Continue {

	public static void main(String[] args) {
		// 1~20까지의 자연수 중
		// 2의 배수, 3의배수를 "제외한" 자연수 출력
		for (int i=1;i<21;i++) {
			
			if(i % 2 == 0 || i % 3 == 0) {
				
				continue;         // continue를 만나면 위로 올라간다
				
			} else {
				
				System.out.println(i);
				
			}
			
		}
		
	}
	
}