package day20;

// 인터페이스는 다중 구현(implements)이 가능하다.

interface Father {
	
	public void printFather();
	
}

interface Mother {
	
	public void printMother();
	
}

class Son implements Father, Mother {

	@Override
	public void printMother() {
		System.out.println("엄마");
		
	}

	@Override
	public void printFather() {
		System.out.println("아빠");
	}

}



public class InterfaceTest3 {

	public static void main(String[] args) {
		
		// 인터페이스와 클래스 간 상속 및 구현
		// 인터페이스 : 구현 implements
		// 추상클래스 : 상속 extends
		// java는 단일 상속만 가능하다.
		// 다중구현은 가능하다.
		
	}
	
}