package day21;
// 교재 213~214page 
// 얕은 복사 : 배열 요소 값의 복사가 아님!
//                 참조변수 "주소값"의 복사 
//                 new 배열객체 1개
public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];		// 원본 배열 객체
		Book[] bookArray2 = new Book[3]; 		// 사본 배열 객체
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데이안","헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
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