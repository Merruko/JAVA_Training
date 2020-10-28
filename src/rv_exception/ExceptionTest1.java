package rv_exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		String data = null;
		//System.out.println(data.toString());	// 에러 (널 값이라) NullPointerException

		String data1 = "100";
		String data2 = "100s";
		
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);	// 노에러
		
		int value2 = Integer.parseInt(data2);
		System.out.println(value2);	// 에러 (s 들어있어서) NumberFormatException
		
	}

}
