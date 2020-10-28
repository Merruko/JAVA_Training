package day05;

public class If3 {

	public static void main(String[] args) {
        // 중첩(다중)if : if~else if ~ else
		
		int number = 0;
		
		if(number < 0) {
			System.out.println("음수입니다.");
		} else if(number > 0) {
			System.out.println("양수입니다.");
		}
		else {	
			System.out.println("0입니다.");
	    }

		// else if - else if - else if ~~~~~~~~~ else 무한대 가능
  }
	
}