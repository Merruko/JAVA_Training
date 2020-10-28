package rv_inheritance3;

public class SuperSonicAirPlane extends AirPlane {
	
	int flyMode = FlyModeTable.NORMAL;	// 1일때 normal, 2일때 supersonic
	
	@Override
	public void fly() {
		if(flyMode == FlyModeTable.SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}
		else {
			super.fly();		// AirPlane 메서드 상속
		}
		
	}
}