package rv_inheritance4;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		Customer lee = new Customer(10010, "이순신");
		VIPCustomer shin = new VIPCustomer(10020, "신사임당", 123);
		Customer kim = new VIPCustomer(10030, "김유신", 500);
		
		int price = 10000;
		int leeCost = lee.calcPrice(price);
		int shinCost = shin.calcPrice(price);
		int kimCost = kim.calcPrice(price);
		
		System.out.println("===지불 금액===");
		System.out.println("지불 금액 : " + leeCost);
		System.out.println("지불 금액 : " + shinCost);
		System.out.println("지불 금액 : " + kimCost);
		
		System.out.println("===고객 정보 출력===");
		System.out.println(lee.showInfo());
		System.out.println(shin.showInfo());
		System.out.println(kim.showInfo());

	}

}