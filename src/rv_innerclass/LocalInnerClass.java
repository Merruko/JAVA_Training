package rv_innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;   //인터페이스의 선언된 변수 상수
		
		class MyRunnable implements Runnable{  //MyRunnable 클래스
			@Override
			public void run() {
				//num = 200;
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("outNum = " + outNum + "(외부클래스의 인스턴스 변수)");
				System.out.println("sNum = " + Outer.sNum + "(외부클래스의 정적 변수)");
			}
		}
		MyRunnable myRun = new MyRunnable();
		return myRun;
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
