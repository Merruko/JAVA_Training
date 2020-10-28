package day19;

class Pay {
	
	public static String COMPANY = "세스코";		// 필드, 클래스 변수
	public static double TAX = 0.03;
	public static int SUDANG = 100;
	public int num = 10;				// 필드, (new)인스턴스 변수
	//생성자
	//메소드
	public void line() {
		System.out.println("---------------");
	}
	public static void disp() {
		System.out.println("===============");
	}
	
}

public class StaticTest {

	public static void main(String[] args) {
		System.out.println(Pay.COMPANY); // 스태틱 변수라 객체 생성 안해도 바로 사용 가능
		System.out.println(Pay.TAX);
		System.out.println(Pay.SUDANG);
	 // Pay.line(); // 에러
		Pay.disp(); // 스태틱 메서드라 에러 안남
	
		Pay money = new Pay(); // 객체(클래스 인스턴스) 생성(힙 메모리)
		money.line();
		money.line();
		System.out.println(money.COMPANY);
		System.out.println(money.TAX);
		System.out.println(money.SUDANG);
		money.disp();
		// static 변수의 연산
		Pay one = new Pay();
		one.SUDANG += 10;
		one.num += 10;
		System.out.println(one.SUDANG);
		System.out.println(one.num);
		System.out.println(money.num);
		
	}
	
}