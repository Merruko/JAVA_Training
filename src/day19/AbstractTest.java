package day19;
// abstract : 추상
abstract class Parent {     // 추상 클래스
	
	String name = "부모";
	abstract void disp();	// 추상 메소드
	void line() {}			// 일반 메소드
}

class Son extends Parent {

	@Override
	void disp() {
		System.out.println("아들입니다.");
	}
}
class Daughter extends Parent {
	
	@Override
	void disp() {
		System.out.println("딸입니다.");
	}
	
}

public class AbstractTest {

	// 교재 : 281page
	// 추상 클래스
	
	public static void main(String[] args) {
		
		// Parent papa = new Parent();  // 에러. 추상클래스라 객체 생성 불가능
		Son son = new Son();
		son.disp();
		Daughter daugu = new Daughter();
		daugu.disp();
		// 다형성
		Parent pa = new Son();
		pa.disp();
		pa = new Daughter();
		pa.disp();
	
	}
	
}