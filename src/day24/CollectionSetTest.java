package day24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSetTest {

	public static void main(String[] args) {
		
		// 제네릭 <저장될 데이터 자료형>
		// Set : 순서가 없고, 데이터 중복 허용 안함
		Set<String> set = new HashSet<String>();
		// 데이터 추가(저장)
		set.add("호랑이");		
		set.add("사자");
		set.add("사슴");
		set.add("호랑이");	// 중복 허용 X
		set.add("코끼리");
		set.add("기린");
		System.out.println("데이터의 갯수 : " + set.size());
		// 데이터 전체 확인
		java.util.Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 데이터 삭제
		set.remove("기린");
		java.util.Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			if(i.next().equals("코끼리")) {	// 다음 요소값(String)
				i.remove();
			}
		}
	
		System.out.println("데이터의 갯수 : " + set.size());  // 기린,코끼리 삭제 됨
			
	}

}