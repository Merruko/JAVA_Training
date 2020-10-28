package day10;

public class Method5 {

	
	public static int area1 (int width, int height) {
		
		return width*height;
	
	}
	
	
	public static double area2 (double radius) {
		
		double pi = 3.14;
		
		return radius * radius * pi;
			
	}
	
	
	
	public static void main(String[] args) {

/* ---------------------------------------------
	# 사각형과 원의 넓이를 구하는 2개를 메소드를 각각 정의하세요!
  // 1. 사각형의 가로(length)와 세로(width)길이를 전달 받아 넓이를 구하는 메서드를 만들고
  // :  main()에서 넓이 값을 받아 출력하는 메서드를(area1)만들고 main()에서 호출
  // 2. 원의 반지름(radius)길이를 전달 받아 넓이를 구하는 메서드를 만들고
  // :  main()에서 넓이 값을 받아 출력하는 메서드를(area2)만들고 main()에서 호출
---------------------------------------------*/

		System.out.println("四角形 : " + area1(3,5));
		System.out.println("円 : " +area2(3.5));
		
		
		
	}

}