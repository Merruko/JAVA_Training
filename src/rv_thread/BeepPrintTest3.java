package rv_thread;

import java.awt.Toolkit;

public class BeepPrintTest3 {
	
	public static void main (String[] args) {
		// 익명 객체로 구현 - 쓰레드
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}); // 익명객체 만들때는 세미콜론을 먼저 붙여야 구현
		
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