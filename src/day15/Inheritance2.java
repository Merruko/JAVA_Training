package day15;
// Object클래스
class Korea {
	public Korea() {
		System.out.println("Korea()...");
	}
}

class Seoul extends Korea { // 부모 : 한국 , 자식 : 서울
	public Seoul() {
		System.out.println("Seoul()...");
	}
}

class Guro extends Seoul {  // 조부모 : 코리아 , 부모 : 서울 , 자식 : 구로
	public Guro() {
		System.out.println("Guro()...");
	}
}

public class Inheritance2 {
	
	public static void main(String[] args) {
		// 상속관계에서 생성자 호출 순서
		// (자식클래스_객체)먼저 부모생성자 호출하고, 자신의 생성자 호출한다.
		
		// "자식" 객체 생성 --(동시에)--> 생성자(부모->자식) 자동호출
		Seoul seoul = new Seoul();
		Seoul Guro = new Guro();
				
	}

}