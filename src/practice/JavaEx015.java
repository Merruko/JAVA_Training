package practice;

public class JavaEx015 {
	
	
	/*		문제15
	  
	※ 다음의 문제들에 맞추어 메서드를 정의하고 main() 에서 호출하여 
	   실행하도록 해보세요. (출력결과는 자유롭게 만들어 보세요 ^^)
	1~6 사이의 주사위 숫자를 랜덤으로 생성하여 return 해주는
	dice 메서드를 작성하시오.
	(힌트 : Math.random() 활용하기)      */
	
	
	public static int dice() {
		
		int num = (int) (Math.random()*6 + 1)  ;
		
		return num;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(dice());
		
	}

	

}