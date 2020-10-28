package rv_interfaces2;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 배분 방식을 선택하세요.");
		System.out.println("R : 한 명씩 차례대로 배분");
		System.out.println("L : 대기가 짧은 상담원에게 배분");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		Scheduler scheduler = 	null;
		
		if(ch=='R' || ch=='r') {
			scheduler = new RoundRobin();
		} else if (ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		} else if (ch=='P' || ch=='p') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		scheduler.getNextCall();
		scheduler.sendToCall();
	
	}

}
