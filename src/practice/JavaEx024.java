package practice;

/* 문제24]
은행 Bank 클래스를 정의하시오.
- private로 고객명을 저장하는 name 필드를 갖는다. (String)
- private로 잔고를 저장하는 balance 필드를 갖는다. (double)
- private로 은행 이율을 저장하는 rate 필드를 갖는다. (double)
- 3개의 필드를 매개변수로 가져와 Bank를 초기화하는
   매개변수를 갖는 생성자를 갖는다.
- 3개의 필드의 getter/setter 메서드를 갖는다.
- 계좌정보를 출력하는 다음과 같은 메서드를 갖는다.
   public void print_account() {
  System.out.println(name + "\t" + balance + "원\t" + rate + "%");
   }
-  모든 객체가 공유하여 사용하는 static 변수를 지정한다.  */


class BankStatic {	// 변동금리를 갖는 금융상품
	
	private String name;
	private double balance;
	private static double rate;
	
	public BankStatic (String name, double balance) {
		
		this.name = name;
		this.balance = balance;
		
	}
	
	public void print_account() {
		
		System.out.println(name + "\t" + balance + "원\t" + rate + "%");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		BankStatic.rate = rate;		// static 변수는 this 가 아니고 클래스명.변수
	}
	
	
}
 

public class JavaEx024 {
	
	public static void main(String[] args) {
		
		  System.out.println("-- 2000년 --");
		  BankStatic.setRate(4.5);
		  BankStatic hong = new BankStatic("홍길동", 10000);
		  hong.print_account();
		  
		  System.out.println("-- 2019년 --");
		  BankStatic.setRate(2.5);
		  BankStatic kim = new BankStatic("김철수", 20000);
		  hong.print_account();
		  kim.print_account();
		  
		  System.out.println("-- 2020년 --");
		  BankStatic.setRate(1.5);
		  BankStatic lee = new BankStatic("이영희", 30000);
		  hong.print_account();
		  kim.print_account();
		  lee.print_account();
		  
		 }		

}