package day23;

public class ExceptionTest {

	public static void main(String[] args) {
		// 교재 : 487page~
		// Exception 예외"처리"
		// cf) 예외는 오류(Error, 에러)가 아니다.
		// 프로그램 "실행"시 발생하는 오류
		// 1) 예외처리를 하지 않는 경우
		
		/*
		System.out.println(3/0);   // ArithmeticException
		System.out.println("END");
		
		int x = 3;
		int y = 0;
		if (y==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(x/y);
		}
		*/
		
		// 2) 예외처리를 하는 경우
		// try ~ catch문
		try {	// 예외가 예상되는 코드를 작성
			System.out.println(1);
			System.out.println(5/1);
			System.out.println(3/0);
			System.out.println(5);
		}catch(ArithmeticException e) {
			// 예외가 발생되면 실행되는 코드
			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("END");
		
		// 3)
		try {
			System.out.println("-------------");
			int[] su = new int[3];
			su[3] = 100;
			System.out.println("-------------");
					
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			// 예외 상관 없이 실행해야하는 코드
			System.out.println("END");
		}
		
		// 4)
		try {
			int su = Integer.parseInt("123");
			System.out.println(su);
			int num = Integer.parseInt("Bye~");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		// 5)
		try {
			System.out.println(5/1);
			System.out.println(3/0);
			int[] su = new int[3];
			su[100] = 100;  // 예외발생 -> 예외객체 생성
			Integer su1 = null;
			System.out.println(3/su1);
		} catch(ArithmeticException e) {
			// 예외가 발생되면 실행되는 코드
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("END");
		}
		
	}

}