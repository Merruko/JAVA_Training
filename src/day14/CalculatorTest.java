package day14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		cal1.setNumber(100, 20);
		
		System.out.println(cal1.add());
		System.out.println(cal1.sub());
		System.out.println(cal1.mul());
		System.out.println(cal1.div());
		
	}

}