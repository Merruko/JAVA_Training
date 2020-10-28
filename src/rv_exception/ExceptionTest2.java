package rv_exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		/* 
		 
	  	int[] num = new int[2];
	
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;	// 에러 (배열 범위 벗어나서) ArrayIndexOutOfBoundsException
		
		*/
		
		try {
			
		int[] num = new int[2];
		
		num[0] = 10;
		num[1] = 20;
		//num[2] = 30;
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		
		System.out.println("프로그램 수행 완료");
		
	}

}