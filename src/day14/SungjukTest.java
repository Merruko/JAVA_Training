package day14;

public class SungjukTest {
	
	public static void main(String[] args) {
		
		Sungjuk s1 = new Sungjuk();
		// Sungjuk s1;					// 참조형 변수 s1
		s1 = new Sungjuk();			// 객체(heap memory)생성
		
		System.out.println(s1.kor + s1.eng + s1.math);
		s1.name = "김길동";
		s1.kor = 100;
		s1.eng = 80;
		s1.math = 90;
		s1.calc();
		s1.disp();
		// s1.avg = 100; // 에러 : private필드는 외부접근 불가능, "정보은닉"
		
		Sungjuk s2 = new Sungjuk();
		s2.name = "홍길동";
		s2.kor = 50;
		s2.eng = 60;
		s2.math = 100;
		s2.calc();
		s2.disp();
		// s2
		
		// s1.name = s2.name;
		// s1.kor = s2.kor;
		// s1.eng = s2.eng;
		// s1.math = s2.math;
		// s1.avg = s2.avg;  // 에러
		s1 = s2;             // 객체복사 : 참조(레퍼런스)변수의 주소값 복사
		
		s1.disp();
		s2.disp();
		
	}
	
}