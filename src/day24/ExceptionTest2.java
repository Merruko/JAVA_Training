package day24;

class Test {
	// 1)
/*	void view() {
		try {
			int a = 3/0;
		} catch (Exception e) { System.out.println(e); }
	}
	void disp() {
		
		try {
		Integer in = null;
		int a = in.intValue();
	} catch (Exception e) { System.out.println(e); }
	
	}*/
	
	// 2) throw문 : 메소드와 함께 사용
	void view() throws Exception {
		int a = 3/0;
	}
	
	void disp() throws Exception {
		Integer in = null;
		int a = in.intValue();
		}
} 


public class ExceptionTest2 {

	public static void main(String[] args) {
	// 예외처리
	try {
		System.out.println(1/0);
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		System.out.println("END");
	}
	
	// throw문 : 메소드와 함께 사용
	
	Test test = new Test();
	
	// 1)
	// test.view();
	// test.disp();
	// 2)
	try {
		System.out.println("OPEN");
		test.view();
		test.disp();
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		System.out.println("CLOSE");
	}
	System.out.println("END");
	
	
	}
}