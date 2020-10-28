package rv_inheritance4;

import java.util.ArrayList;

public class MainArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer lee = new Customer(10010, "이순신");
		Customer kim = new Customer(10020, "김유신");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer shin = new GoldCustomer(10040, "신사임당");
		Customer youl = new VIPCustomer(10050, "이율곡", 2020);
		
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(hong);
		customerList.add(shin);
		customerList.add(youl);
		
		System.out.println("===할인율과 보너스 포인트 계산===");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
		}
		
		System.out.println("===고객 정보 출력===");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
	}
}