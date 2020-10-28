package rv_inheritance4;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 기본생성자
	public Customer() {
		customerGrade = "Silver";			// 등급 : 실버
		bonusRatio = 0.01; 				// 보너스 적립률은 1%
	}
	
	// 매개변수가 있는 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";			// 등급 : 실버
		bonusRatio = 0.01; 				// 보너스 적립률은 1%
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "
				+ bonusPoint + "입니다." ;
	}
}