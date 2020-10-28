package day26;

import java.lang.Thread;

class MyThread2 extends Thread {
	
	private int num;
	private String name;
	public MyThread2() {}
	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <num; i++) {
			System.out.println(name + ":" + i);
		}
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {
		// 2) 쓰레드를 사용한 경우
		MyThread2 t1 = new MyThread2(1000,"★");
		MyThread2 t2 = new MyThread2(1000,"★★");
		MyThread2 t3 = new MyThread2(1000,"★★★");
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}