package day06;

public class While4 {

	public static void main(String[] args) {
		// 중첩 while : 구구단 (세로)출력하기 (2~9단) : 8회
			
			int j;
			int i = 2;
			
			while(i<10) {       // 외부 반복 : 고정반복
				
				j = 1;
				
			    while(j<10) {     // 내부 반복 : 변화반복
				
			    	System.out.printf("%d X %d = %2d\n", i, j, (i*j));
				
			    	j++;
				
			    }
			    
	    	i++;	
		
			}

	}

}