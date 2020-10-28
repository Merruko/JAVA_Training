package day10;

public class Method6 {
	
	public static int add (int n, int m) {
		
		return n+m;
		
	}
	
	public static double add (double n, double m) {
		
		return n+m;
		
	}
	
	public static char add (char n, char m) {
		
		return (char)(n+m);    // 반환타입 맞아도 캐스팅 해줘야한당
		
	}
	
	public static String add (String n, String m) {
		
		return n+m;           // 얘는 그냥 되넹
		
	}
	
	
	// 다른 기능을 가지고 있지만 같은 이름의 메소드라서 알아서 적절한걸로 적용 됨  => 오버로딩
	
	
	public static void main (String[] args) {
		//  메소드_오버로딩(overLoading) <--- 메소드 중복 (다형성)
		//  :(한 클래스 내에서...)
		//  메소드명은 같고,
		//  매개변수의 갯수 또는 자료형이 다른 경우
		//  ㅎㅅㅎ
		int r1 = add(10,20);							// 두 정수의 덧셈
		double r2 = add(1.1,2.2);						// 두 실수의 덧셈
		char r3 = add('1','A');		    		     	// 두 (단일)문자의 덧셈
		String r4 = add("Hello", "Java");				// 두 문자열의 덧셈
		System.out.println(r1);  // 30
		System.out.println(r2);  // 3.3
		System.out.println(r3);  // r (유니코드 변환 됨)
		System.out.println(r4);  // HelloJava
	
		
	// 다른 기능을 가지고 있지만 같은 이름의 메소드라서 알아서 적절한걸로 적용 됨  => 오버로딩
		
		
	}

}