package day13;					// 하나의 .java소스파일은 반드시 
								// package 선언을 1번 해야한다.

class Sunjuk {
	
	// field
	public int kor,eng,math;
	private int avg;
	
	// method
	// init()메소드 : 멤버변수 kor, eng, math를 초기화하는 기능
	
	public void init(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	
	//calc()메소드 : 멤버변수 avg에 평균 계산하는 기능
	public void calc() {
		avg = (kor+eng+math)/3;
	}
	
	// disp()메소드 : 멤버변수들을 출력하는 기능
	public void disp() {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(avg);
	
	}
	
} // class-end


public class ClassTest {

	public static void main(String[] args) {
		// 							 객체(heap memory)
		// 클래스명 참조변수 = new 클래스명();
		Sunjuk sj = new Sunjuk(); 	  // sj 객체생성
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.math);
		sj.init(100, 90, 80);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.math);
		sj.calc();
		// System.out.println(sj.avg); // private 하면 에러걸림(다른 클래스에서 접근불가 됨)
		sj.disp();
		sj.kor = 90;
		// sj.avg = 100; // private 하면 에러걸림(다른 클래스에서 접근불가 됨)
		
	}

}