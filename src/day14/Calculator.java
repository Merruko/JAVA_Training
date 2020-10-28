package day14;

public class Calculator {
	// +,-,*,/ (두개 정수) 계산기 클래스
	
	// 필드
	private int num1;
	private int num2;
	
	// 세터 메소드
	public void setNumber(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	// 계산 메소드
	public int add() {  // 두 멤버변수(필드) 덧셈 후 결과 반환하는 기능
		return num1+num2;
	}
	public int sub() {  
		return num1-num2;
	}
	public int mul() {  
		return num1*num2;
	}
	public int div() {  
		return num1/num2;
	}
	
}