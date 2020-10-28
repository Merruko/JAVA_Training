package rv_inheritance4;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer kim = new Customer();
		kim.setCustomerName("김산");
		System.out.println(kim.showInfo());
		
		int price = 10000;
		int cost = kim.calcPrice(price);
		
		System.out.println("지불금액 : " + cost);
		System.out.println(kim.showInfo());	
	
	}
}