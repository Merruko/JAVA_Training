package rv_equals;

import rv_objectclass.Book;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("장그래");
		String name2 = new String("장그래");
		
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		System.out.println("==============");
		Book book1 = new Book(101, "자바");
		Book book2 = new Book(101, "자바");
		System.out.println(book1==book2);
		System.out.println(book1.equals(book2));
	}

}
