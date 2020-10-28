package rv_inheritance2;

public class MainClass {		// 체인점과 프랜차이즈	

	public static void main(String[] args) {
		
		HeadShop headshop = new HeadShop();
		headshop.sellDoenjangJJige();
		headshop.sellKimchiJJige();
		headshop.sellBibimbap();
		System.out.println("====================");
		HeadShop shop1 = new Shop1();
		shop1.sellDoenjangJJige();
		shop1.sellKimchiJJige();
		shop1.sellBibimbap();
		System.out.println("====================");
		HeadShop shop2 = new Shop2();
		shop2.sellDoenjangJJige();
		shop2.sellKimchiJJige();
		shop2.sellBibimbap();
		
	}
}