package practice;

public class JavaEx011 {
	
	
	/*
  	문제11]
	※ 다음의 문제들에 맞추어 메서드를 정의하고 main() 에서 호출하여 
		실행하도록 해보세요. (출력결과는 자유롭게 만들어 보세요 ^^)
	
	정수 n을 매개변수로 가져와 구구단 중 n단을 메서드 안에서 출력하는
	guGu 메서드를 작성하시오.
	 
	*/
	
	
	public static void guGu(int n) {
		
		for (int m = 1;0<n;n--) {
			
			System.out.printf("%d * %d = %d\n",9,m,9*m);
			m++;
			
		}
	}
		
	public static void main (String[] args) {
		
		guGu(9);
		
	}
	
		
}