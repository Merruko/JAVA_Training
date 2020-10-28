package day19;


/*final*/ class Animal { // final 붙이면 이 클래스는 더 이상 부모가 될 수 없음, 종단클래스가 됨
	
	public void one() { }
	public final void two() { }
	
}

class Elephant extends Animal {
	
	public void one() {
		System.out.println("one() override!");
	}
		
	//public void two() {} 부모의 final 메서드는 오버라이드 불가능. (상속O,재정의X)

}

public class FinalTest {

	// 교재 : 305page
	
	static final int ABC = 123;
	
	public static void main(String[] args) {
		
		Elephant e = new Elephant();
		e.one();		// 7번라인 override된 one()메소드
		e.two();		// 4번라인 two() 메소드		
		int a = 3;		// 지역변수 (a는 이 메인메서드 안에서만 쓰인다)
		a = 30;
		a = 300;
		final int b = 7;
	//	b = 70;         // 에러. 파이널이라 새로운 값 대입 불가 
	//	b = 700;		// 에러. 파이널이라 새로운 값 대입 불가
	//	++b;			// 에러. 파이널이라 걍 수정불가
		final double PI = 3.14;
		
	}
	
}


// final 변   수 : 변수의 상수화
// final 메소드 : 더이상(이후에는) overRide(재정의)할 수 없음
// final 클래스 : 종단클래스, 더이상 자식 클래스 생성 할 수 없음
// String 클래스 : public final class String