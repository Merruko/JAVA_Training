package rv_objectclass;

public class ToStringTest {
	
	public static void main(String[] args) {
		// 객체 생성 1
		String name = "홍길동";
		System.out.println(name);

		// 객체 생성 2
		String name2 = new String("홍길순");
		System.out.println(name2);
		
		Book book = new Book(101, "자바 프로그래밍 입문");
		System.out.println(book);
		System.out.println(book.toString());
		
	}

}
