package day09;

public class Method4 {

	
	public static void callTest1() {
		
		System.out.println("1. Hello Java");
		
	}
	
	
	public static void callTest2(int i) {
		
		for (;0<i;i--) {
			
		System.out.println("2. Hello Java");
		
		}
		
	}
	
	
	public static int callTest3() {
		
		int sum = 0;
		
		for (int j = 100;0<j;j--) {
			
			if (j%2!=0) {
				
				sum += j; 
				
			}
				
		}
		
		
		return sum;
		
		
	}
	
	public static double callTest4(double a, double b) {
		
		
		return a*b;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		// 1. 실인수, 반환값이 모두 없는 경우
		// : "Hello Java"를 출력하는 메서드(callTest1)를 만들고 main()에서 호출
		
		// 2. 실인수 있고, 반환값 없는 경우
		// : 매개변수로 횟수를 그 횟수만큼 "Hello Java"를 출력하는 메서드(callTest2)
		
		// 3. 실인수 없고, 반환값 있는 경우
		// : 1~100까지의 홀수의 합을 구하고 그 값을 반환해주는 메서드(callTest3)를 만들고 main()에서 그 값을 받아서 출력
		
		// 4. 실인수, 반환값이 모두 있는 경우
		// : 두 실수를 매개변수로 전달 받아 두 수의 곱을 구하는 메서드(callTest4)를 만들고 main()에서 그 값을 받아서 출력

		
		callTest1();
		callTest2(3);
		System.out.println(callTest3());
		System.out.println(callTest4(3.14,3.15));
		
		
	}

}


/* 인수 = 인자 = 매개변수 = 파라미터 = argument = parameter
 * === 매개변수 전달 방법 === 
 * 
 * 1. 호출하는 함수 		   	 호출당하는 함수
 *     Caller  --CALL-->  callee
 *             <-RETURN-
 * 	       실인수                              가인수
 *     	 X                  X (리턴문이 없으니 void타입)
 * 		 O                  X (리턴문이 없으니 void타입)
 * 		 X                  O
 *       O                  O
 * 1. Call by Value (값에 의한 전달)
 * 	  : 실인수에 (상수)값이 전달되는 호출, 값복사, return문(1개)
 * 2. Call by Reference (참조에 의한 전달)
 * 	  : 
 * 
 * */