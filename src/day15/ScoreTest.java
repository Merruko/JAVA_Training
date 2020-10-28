package day15;

public class ScoreTest {

	public static void main(String[] args) {
		// (클래스)참조변수
		Score one = null;
		one = new Score(); 	// (heap)객체생성과 동시에 기본생성자 자동호출
		one.disp();
		// one.name = "홍길동";  -에러
		one.set("홍길동", 100, 90, 80);
		one.disp();
		
		Score two = new Score("김길동",10,20,30);
		two.disp();

		Score three = new Score("최길동",10,20,30);
		three.disp();
		
	}

}
