package day17;

public class OverLoading {
	
	// 기능 : 정수를 전달받아 1과 덧셈한 후 결과 반환
	public static int add(int num) {	// int num = 10;
		
		return num+1; 					// return 11;
		
	}
	
	// 오버로드(딩) : 메소드 중복
	// 기능 : 정수 2개를 전달받아 두개를 덧셈한 후 결과 반환
	public static int add (int num1, int num2) {
		
		return num1+num2;
		
	}
	
	// 오버로드(딩) : 메소드 중복
	// 기능 : 실수 2개를 전달받아 두개를 덧셈한 후 결과 반환
	public static double add (double num1, double num2) {
		
		return num1+num2;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(10)); 		// (결과)11
		System.out.println(add(10,20));		// (결과)30	
		System.out.println(add(1.1,3.3));	// (결과)4.4
	
	}

} //class-end