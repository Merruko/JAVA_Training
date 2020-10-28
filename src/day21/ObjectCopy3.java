package day21; //교재 216page 
//깊은 복사 : 얕은 복사(인스턴스 주소 복사)의 문제점 해결 
public class ObjectCopy3 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];		// 원본 배열 객체
		Book[] bookArray2 = new Book[3]; 		// 사본 배열 객체
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데이안","헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// bookArray2 = bookArray1;
		for(int i=0; i<3; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
/*     public 필드일 경우! 
 		bookArray2[i].bookName = bookArray1[i].bookName;   // 에러
		bookArray2[i]author = bookArray1[i]author;					// 에러
*/
		
		for(int i = 0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		// (원본)bookArray1의 [0]번째 객체 내용 수정
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		//  (원본)bookArray1 출력
		System.out.println("=== bookArray1 ===");
		for(int i = 0; i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}		
		// (사본)bookArray2출력
		System.out.println("=== bookArray2 ===");
		for(int i = 0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
	}

}