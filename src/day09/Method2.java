package day09;

public class Method2 {
	
	
	public static int add(int a, int b) {
		
		int n1 = a + b;
		return n1;
		
	}
	
	public static int min(int a, int b) {
		
		int n2 = a - b;
		return n2;
		
	}
	
	public static int mul(int a, int b) {
		
		int n3 = a * b;
		return n3;
		
	}
	
	public static int div(int a, int b) {
		
	if(b==0) {
	
		System.out.println("나누는 수는 0이 될 수 없습니다.");
		return -999; // 반환값을 주긴 줘야 에러가 안뜸	
		
		} else {
		
		int n4 = a / b;
		return n4;
		
		}
	}
	

	public static void main (String[] args) {
		
		
		int n2 = min(10,2);
		int n3 = mul(10,2);
		int n4 = div(10,0);
		
		System.out.println("10+2 : " + add(10,2));
		System.out.println("10-2 : " + n2);
		System.out.println("10*2 : " + n3);
		System.out.println("10/2 : " + n4);
		
		
		
	}
	
	
	
	
}