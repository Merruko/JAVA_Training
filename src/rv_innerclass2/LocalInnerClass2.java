package rv_innerclass2;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runner = new Runnable() {//익명 클래스

		@Override
		public void run() {
			System.out.println("outNum = " + outNum);
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class LocalInnerClass2 {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.runner.run();
	}

}
