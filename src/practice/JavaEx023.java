package practice;

class Pizza {

	String topping;
	
	public static int count;
	
	public Pizza(String toppings) {
		
		this.topping = toppings;
		count++;
		
	}
	
}

public class JavaEx023 {

	public static void main (String[] args) {
		
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		
		int n = Pizza.count;		// static변수는 클래스 이름으로 직접 참조함.
									// 클래스명.static필드명
		
		System.out.println("今まで販売されたピザ：" + n + "個");
		
	}
	
	
}