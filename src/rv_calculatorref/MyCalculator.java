package rv_calculatorref;

public class MyCalculator {
	private int num1; 
	private int num2;
	private Calculator calculator;
	
	public MyCalculator() {	//생성시에 객체 생성 
		calculator = new Calculator();
	}
	public int plus() {
		return calculator.add(num1, num2);
	}
	public int minus() {
		return calculator.sub(num1, num2);
	}
	public int times() {
		return calculator.mul(num1, num2);
	}
	public int divide() {
		return calculator.div(num1, num2);
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
