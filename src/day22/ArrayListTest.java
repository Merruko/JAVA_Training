package day22;

import java.util.ArrayList;

// 교재 : 224page
import day21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
//		Book lib = new Book();
//		Book[] lib2 = new Book[100];
//		lib2[0] = new Book("태백산맥", "조정래");
//		System.out.println(lib2.length);										// (전체)요소 갯수
		
		ArrayList<Book> library = new ArrayList<Book>();		
		library.add(new Book("태백산맥", "조정래"));   					// (객체)요소 추가
		library.add(new Book("데이안","헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		
		System.out.println(library.size());					// (현재)요소 갯수
		System.out.println(library.get(0));						
		System.out.println(library.get(1));
		System.out.println(library.get(2));
		System.out.println(library.get(3));
		System.out.println(library.get(4));
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library) {
			book.showBookInfo();
		}	
		
	} // main-end
	
} // class-end


/* ===ArrayList 클래스의 주요 메서===
 * add(e)  : 배열에 객체 요소하나 추가
 * size(): 배열 전체 요소 갯수
 * get(i) : i번째 위치의 요소 값 반환
 * remove(i) : i번째 위치의 요소 값 제거
 * isEmpty() : 배열이 비어있는지 확인
 */