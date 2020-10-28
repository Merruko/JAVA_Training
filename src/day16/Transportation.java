package day16;

public class Transportation {
	
	int passengerCount;
	int money;
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
		
	}

}