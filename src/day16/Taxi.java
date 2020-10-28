package day16;

public class Taxi extends Transportation {
	int TaxiNumber;
	int passengerCount;
	int money;


	public Taxi (int TaxiNumber) {
		this.TaxiNumber = TaxiNumber;
	}

	public void take (int money) {
		
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println("택시" + TaxiNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");

	}	

}