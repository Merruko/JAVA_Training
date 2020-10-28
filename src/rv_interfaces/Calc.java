package rv_interfaces;

public interface Calc {		// 인터페이스는 멤버변수를 사용할 수 없다.
	
	int num = 10;		// 컴파일 과정에서 자동으로 변수가 상수화 됨
	double PI = 3.14;
	int ERROR = -9999;
	
	public int add(int n1, int n2);			// 더하기 추상메서드
	public int subtract(int n1, int n2);	// 빼기 추상메서드
	public int times(int n1, int n2);		// 곱하기 추상메서드
	public int divide(int n1, int n2);		// 나누기 추상메서드
	
}
