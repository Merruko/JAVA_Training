package day07;

public class For2 {

	public static void main(String[] args) {
		
		// 중첩 for문
		
		int j;
		int i;
		
		for(i=2;i<10;i++) {       	// 외부 반복 : 고정반복 (i를 2부터 9까지 8번 반복)
			
			
		    for(j=1;j<10;j++) {     // 내부 반복 : 변화반복 (j를 1부터 9까지 9번 반복)
			
		    	System.out.printf("%d X %d = %2d\n", i, j, (i*j));
			
			
		    }
		   
		}

	}

}