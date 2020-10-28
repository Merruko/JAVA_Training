package rv_math;

public class MathClassTest {

	public static void main(String[] args) {
		int v1 = Math.abs(-10);   //절대값
		System.out.println("v1 = " + v1);
		
		long v2 = Math.round(5.6);  //반올림
		System.out.println("v2 = " + v2);
		
		double v3 = Math.floor(7.3);  //버림
		System.out.println("v3 = " + v3);
		
		int max = Math.max(10, 20);
		System.out.println("max = " + max);
		
		double rand = Math.random();   //0.0<=random<1.0
		System.out.println("rand = " + rand);
		
		//주사위 구현
		int dice = (int)(Math.random()*6) + 1;
		System.out.println("주사위 눈 : " + dice);
	}

}
