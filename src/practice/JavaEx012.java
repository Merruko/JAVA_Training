package practice;

public class JavaEx012 {
	
	
	public static int sign(int n) {
		
		int num = 0;
		
		if (n>=0) {
			
			num = 1;		
		}
		
		else if (n<0) {
			
			num = 0;
		}
		
		return num;
		
	}

	public static void main(String[] args) {
		
		/* 문제12]
		 
		※ 다음의 문제들에 맞추어 메서드를 정의하고 main() 에서 호출하여 
   		실행하도록 해보세요. (출력결과는 자유롭게 만들어 보세요 ^^)
		정수 n을 매개변수로 가져와 
		부호를 판별하는 sign메서를 작성하시오.
		(n이 양수이면 1, 음수이면 0을 return 하도록 하시오.) */
		
		
		System.out.println(sign(-3));
		
	}

}