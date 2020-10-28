package day16;

public class GeneralizationTest {

	public static void main(String[] args) {
		// 100번 버스를 2명 승차
		Bus bus = new Bus(100);
		bus.take(1300);
		bus.take(1300);
		bus.showBusInfo();
		
		// 2호선 지하철을 1명 승차
		Subway sub = new Subway("2호선");
		sub.take(1250);
		sub.showSubwayInfo();
	}

}