package day26;
class MyThread1 {
	private int num;
	private String name;
	public MyThread1() {}
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
	public void start() {
		run();
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// thread 쓰레드 : 경량  프로세스 실행중인 프로그램
		//				 cf) 프로세서 : 처리기, CPU
		// start() ---> JVM ---> Thread Manager ---> 스케쥴러 ---> run()
		// 1) 쓰레드를 사용하지 않는 경우
		MyThread1 t1 = new MyThread1(1000,"★");
		MyThread1 t2 = new MyThread1(1000,"★★");
		MyThread1 t3 = new MyThread1(1000,"★★★");
		t1.start();
		t2.start();
		t3.start();
	
	}

}