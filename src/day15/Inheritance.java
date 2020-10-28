package day15;
// 라이브러리 클래스s
class AA {
	
	public void one() {
		
		System.out.println("AA클래스의 one()...");
		
	}
	public void two() {
		
		System.out.println("AA클래스의 two()...");
		
	}
	
	
} // AA class-end
// 자식클래스 부모클래스
class BB extends AA {
	
	public void three() {
		
		System.out.println("BB클래스의 three()");
		
	}
	
}// BB class-end

class CC extends AA {
	
} // CC class-end

class DD extends BB {
	public void four() {
		System.out.println("DD클래스의 four()");
	}
} // 

public class Inheritance { // 실행 클래스(main()메소드가 존재하는 클래스)
	
	public static void main(String[] args) {
		// (두)class간의 상속 : 단일상속
		// interface간의 상속
		// 상속 : 상위, 부모, 기본, super class
		// 		 하위, 자식, 파생, sub class
		AA a1 = new AA();      // 객체 생성 -> 생성자 자동호출
		a1.one();
		a1.two();
		System.out.println("------------------------");
		BB b1 = new BB();	   // // (자식)객체 생성 -> 생성자(부모->자식) 자동호출
		b1.one();
		b1.two();
		b1.three();
		CC c1 = new CC();
		c1.one();
		c1.two();
		DD d1 = new DD();
		d1.one();
		d1.two();
		d1.three();
		d1.four();
		
	}

}