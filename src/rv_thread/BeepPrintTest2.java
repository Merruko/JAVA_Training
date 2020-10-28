package rv_thread;

public class BeepPrintTest2 {
	
	public static void main (String[] args) {
		// 소리와 동시에 문자출력 - Thread 클래스 사용하여 구현
		
		Runnable beepTask = new BeepTask();	// 방법1
//		BeepTask beepTask = new BeepTask();	// 방법 2
		
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);	// 0.5초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	}
		
}
	
}