package day09;

public class Method {
	
	// 클래스(class) : field + method
	// 필드(멤버변수)들
	// 메소드(멤버함수)들
	/* 
	 * 1. (사용자정의)메소드 정의(구현) , 함수(fuction, 1기능)
	 *      접근자        
	 *  public static 반환형 메소드명(가인수1, 가인수2, 가인수3 -----) {
	 *  	명령문;
	 *  	return 반환값; 
	 *  }
	 * 
	 * 2. (사용자정의)메소드 호출
	 *   메소드명();
	 *   메소드명(실인수1, 실인수2, 실인수3 -----);	
	 *   
	 *   add();
	 *   add(10);
	 *   int r = add();
	 *   int r = add(1,2);
	 *   System.out.println();
	 *   System.out.println(add(1,2));
	 *   
	 */
	
	public static void test( ) {                          // 메소드 정의(구현)
		System.out.println("test()메소드 왔다 감!ㅎㅎ");	
	}
	
	public static void test1(int a) {
		System.out.println(a);
	}
	
	public static void test2(double a) {
		System.out.println(a);
	}
	
	public static void test3(char a) {
		System.out.println(a);
	}
	
	public static void test4(String a) {
		System.out.println(a);
	}
	
	public static void test5(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double test6(double x, double y) {
		//          ↑ 리턴값과 반환형 데이터타입 맞추기
		// test 6 메서드 기능 : 두 실수를 전달받아 실수의 합을 반환
		
			// return x+y;
			double z = x + y;
			return z;
		
	}
	
	
	
	
	public static void main(String[] args) {    	      // 메소드 헤더
		System.out.println("main()메소드:프로그램 실행의 시작!");  // 메소드 바디
		test(); 	  // 메소드 호출문; CALL
		test1(10);    // ()안에 아무것도 안넣거나 실수 넣으면 에러지만 정수 넣으면 전달 됨
		test2(3.14);
		test3('a');
		test4("Hi");
		test5(10,20);
		System.out.println("test()메소드들 호출 후 돌아옴! ㅎㅎ");
		
		
	}	// main-end

}  // class-end


/*
 *
 * === method(메소드) : 멤버함수 ===
 * 1함수(fuction) : 1기능, 프로시듀어(procedure)
 * 
 * 사용자정의 함수(메소드) : 메소드정의 --> 메소드호출(call)
 * 1. 메소드 정의
 * 	접근제어자 반환형 메소드명(인수1, 인수2, ----) {
 *     실행문1;    // 메소드 바디
 *     return 반환값; // return문;
 *   }
 * - 인수(인자, argument, 매개변수, 파라미터, parameter)
 * - 반환값(리턴값, return value) 유무
 *  : 반환값은 void형 일때만 없다!
 * 
 * 2. 메소드 호출(call, 사용)
 *  메소드명();
 * 
 */