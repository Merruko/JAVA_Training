package rv_innerclass;

class A {
	A() {	// 생성자
		System.out.println("A객체가 생성됨");
	}

class B {
	B() {
		System.out.println("B객체가 생성됨");
	}
}

static class C {
	C() {
		System.out.println("C객체가 생성됨");
	}
}

void method() {
	class D {
		D() {
			System.out.println("D객체가 생성됨");
		}
	}
	D d = new D();
  }
}

public class ATest {

	public static void main(String[] args) {
		
		A a = new A();
		
		// 인스턴스 내부 클래스
		A.B b = a.new B();
		
		// 정적 내부 클래스
		A.C c = new A.C();
		
		// 지역(local) 내부 클래스
		a.method();
		
	}

}