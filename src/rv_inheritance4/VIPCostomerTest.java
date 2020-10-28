package rv_inheritance4;

public class VIPCostomerTest {

	public static void main(String[] args) {
		
		VIPCustomer chu = new VIPCustomer();
		chu.setCustomerName("추신수");
		chu.setAgentID(777);
		System.out.println(chu.showInfo());
		
		int price = 10000;
		int cost = chu.calcPrice(price);
		System.out.println("구매 가격 : " + cost);
		System.out.println(chu.showInfo());

	}

}
