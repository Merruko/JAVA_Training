package day16;

public class TakeTrans {

	public static void main(String[] args) {
		// 두명의 학생을 생성
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 50000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100); 	// 제임스가 100번 버스를 탐
		studentJames.showInfo();		// 제임스 정보 출력
		bus100.showBusInfo();			// 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);	// 토마스가 2호선을 탐
		studentTomas.showInfo();				// 토마스 정보 출력
		subwayGreen.showSubwayInfo();           // 지하철 정보 출력
		
		Taxi taxi4885 = new Taxi(4885);			
		studentEdward.takeTaxi(taxi4885);		// 에드워드가 4885 택시를 탐
		studentEdward.showInfo();				// 에드워드 정보 출력
		taxi4885.showTaxiInfo();				// 택시 정보 출력
		
	}

}