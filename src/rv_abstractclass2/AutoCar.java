package rv_abstractclass2;

public class AutoCar extends Car {
	
	public void load() {
		System.out.println("짐을 차에 싣습니다.");
	}

	@Override
	public void run() {
		System.out.println("차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("전기를 충전합니다.");
	}
	
}