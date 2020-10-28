package practice;

public class JavaEx013 {
	
	/* 문제13]
	
	※ 다음의 문제들에 맞추어 메서드를 정의하고 main() 에서 호출하여 
		실행하도록 해보세요. (출력결과는 자유롭게 만들어 보세요 ^^)
	매개변수로 문자를 받아 대문자이면 1, 그렇지 않으면 0을 return하는
	isUpper 메서드를 작성하시오.
	(힌트 : 대문자의 범위 (ch>='A') && (ch<='Z') )  */
	
	public static int isUpper(char ch) {
		
		int num = 0;
		
		if ((ch>='A') && (ch<='Z')) {
			
			num = 1;
			
		}
		
		else {
			
			num = 0;
			
		}
		
		return num;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(isUpper('A'));
		
	}

}