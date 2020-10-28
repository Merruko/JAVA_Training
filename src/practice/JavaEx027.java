package practice;


/*
인터페이스 AdderInterface의 코드(추상 메소드 2개)는 다음과 같다.
-------------------------
interface AdderInterface {
   int add(int x, int y);       // x와 y의 합 반환
   int add(int n);              // 1에서 n까지의 정수 합 반환(단, n > 0)
}
------------------------
AdderInterface를 상속받은 클래스 MyAdder를 작성하여
다음 실행 클래스의 main() 을 실행 할 때
아래의 실행 결과와 같이 출력되도록 하시오.
--------------------------
public class JavaEx027 {
public static void main(String[] args) {
   MyAdder adder = new MyAdder();
   System.out.println(adder.add(5, 10));
   System.out.println(adder.add(10));
}
}
[결과]
15
55
*/

interface AdderInterface {
	
	int add(int x, int y);
	int add(int n);
	
}

class MyAdder implements AdderInterface {
	
	private int x;
	private int y;
	
	public MyAdder() {}
	public MyAdder(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	@Override
	public int add(int n) {
		
		int sum = 0;
		
		if(n>0) {
		
		for (int i=1; i<=n; i++) {
			
			sum+=i;
		}
		}
		return sum;
	}
	
}
public class JavaEx027 {

	public static void main(String[] args) {
		
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	
	}

}