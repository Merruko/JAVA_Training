package rv_interfaces2;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 가져옵니다.");		
	}

	@Override
	public void sendToCall() {
		System.out.println("다음 순서 상담원에 배분합니다.");		
	}

}
