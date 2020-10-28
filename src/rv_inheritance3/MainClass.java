package rv_inheritance3;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = FlyModeTable.SUPERSONIC;
		sa.fly();
		sa.flyMode = FlyModeTable.NORMAL;
		sa.fly();
		sa.land();
		
	}

}