package day21;

public class BookArray {
	
	public static void main(String[] args) {
		
		/*Book lib1 = new Book("태백산맥","조정래");
		lib1.showBookInfo();
		Book lib2 = new Book("데이안","헤르만 헤세");
		lib2.showBookInfo();
		Book lib3 = new Book("어떻게 살 것인가","유시민");
		lib3.showBookInfo();*/
		
		Book[] library = new Book[5];
		
		for(int i = 0; i<5; i++) {
			System.out.println(library[i]);
		} // null 값 출력
		
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("데이안","헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가","유시민");
		library[3] = new Book("토지","박경리");
		library[4] = new Book("어린왕자","생텍쥐페리");
		
		for(int i = 0; i<5; i++) {
			System.out.println(library[i]);
		} // (heap)주소 값 출력
		
		for(int i = 0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
	}

}