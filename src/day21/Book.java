package day21;
// 객체배열 사용하기
// 1. (Book)클래스 정의
public class Book {
	// 필드
	private String bookName;
	private String author;
	// 생성자
	public Book() {	}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	// 접근자 메소드 : getter/setter
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
} 