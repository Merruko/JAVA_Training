package day15;

class Father extends Object { // 모든 최상위 클래스는 Object 클래스를 상속 받음. 평소에는 생략할 뿐.
	String name = "아빠";
	int age = 0;
	public Father() { // 기본 생성자
		
		System.out.println("Father()...");
		
	}
	
	public Father(String name, int age) { // 매개변수 생성자
		this.name = name;
		this.age = age;
	} 
	
}

class Son extends Father {
	
	String name = "홍길동";		// 지역변수
	public Son() {
		super(); // 부모의 생성자 함수 호출, 생략 가능
		System.out.println("Son()...");
	}
	public void disp() {
		System.out.println(name);       // 지역변수
		System.out.println(this.name);  // 자신의 필드
		System.out.println(this.age);   // 자신의 필드
		System.out.println(super.name);
		System.out.println(super.age);
	}
	
}

class Daughter extends Father {
	public String address;
	public Daughter() {
		// super();
	}
	
	public Daughter(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
}


public class Inheritance3 {

	public static void main(String[] args) {
		
		// super : 부모객체
		// super.필드명 : 부모의 필드
		// super() : 부모의 생성자
		// this : 자신객체
		// this.필드명 : 자신의 필드
		// this() : 자신의 생성자
		Son son = new Son(); // 부모기본생성자 -> 자식 기본생성자
		son.disp();
		System.out.println("================");
		Daughter jane = new Daughter();		// 부모 기본생성자 -> 자식 기본생성자
		System.out.println(jane.name);
		// 매개변수를 갖는 "자식 객체" 생성시
		// 매개변수부모생성자 호출 -> 매개변수자식생성자 호출
		// cf) 자식객체 생성시, 기본은 부모의 "기본" 생성자를 자동호출한다.
		Daughter anna = new Daughter("안나", 20, "구로"); // 부모 매개변수생성자 -> 자식의 매개변수
		System.out.println(anna.name);
		System.out.println(anna.age);
		System.out.println(anna.address);
		
		
	}

}