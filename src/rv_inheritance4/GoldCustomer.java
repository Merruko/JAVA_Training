package rv_inheritance4;

public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	public GoldCustomer (int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;		// 보너스 적립률 2%
		saleRatio = 0.1;			// 상품할인율 10%
	}

}
