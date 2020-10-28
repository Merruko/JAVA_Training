package day22;
class Book extends Object {
	
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return (bookTitle + "," + bookNumber);
	}
	
}
public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);					// day22.Book@15db9742
		//// day22.Book@15db9742  -(오버라이드 이후)-> 개미,200
		System.out.println(book1.toString());   
	}

}