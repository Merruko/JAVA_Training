package day14;

public class OrderTest {

	public static void main(String[] args) {
		
		Order Chumon = new Order();
		Chumon = new Order();
		
		Chumon.banngo1 = "201803120001";
		Chumon.id = "abc123";
		Chumon.hiduke = "2018년 3월 12일";
		Chumon.namae = "홍길순";
		Chumon.banngo2 = "PD0345-12";
		Chumon.jyusyo = "서울시 영등포구 여의도동 20번지";
		
		Chumon.method2();
		
	}

}