package practice;

public class JavaEx014 {
	
	/*	문제14]
	  
	※  다음의 문제들에 맞추어 메서드를 정의하고 main() 에서 호출하여 
	    실행하도록 해보세요. (출력결과는 자유롭게 만들어 보세요 ^^)
			   
	    매개변수 n을 이용하여 짝수인지 홀수인지를 검사하는 
	  evenNumber 메서드를 작성하시오.
	  (n이 짝수이면 1, 홀수이면 0을 return한다.) 		*/
	
	public static int evenNumber(int n) {
		
		int num = 0;
		
		if (n%2 == 0) {
			
			num = 1;
			
		}
		
		else {
			
			num = 0;
			
		}
		
		return num;
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(evenNumber(4));
		
	}

}