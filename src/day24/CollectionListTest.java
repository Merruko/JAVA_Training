package day24;

import java.util.ArrayList;
import java.util.List;

public class CollectionListTest {

	public static void main(String[] args) {
		// List : 순서가 있고, 데이터 중복 허용
		// 배열과 비슷한 기능
		List<Integer> list = new ArrayList<Integer>();
		// 데이터 추가
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(10);
		System.out.println("데이터 갯수 : " + list.size());
		// 5번째 값 얻기
		System.out.println("5번째 값 : " + list.get(4));
		// 5번째 값 삭제
		list.remove(4);
		System.out.println("데이터 갯수 : " + list.size());
		System.out.println("5번째 값 : " + list.get(4));
		// 3번째 위치에 값(123) 추가
		list.add(2,123);
		System.out.println("데이터 갯수 : " + list.size());
		System.out.println("5번째 값 : " + list.get(4));
		// 5번째 값 수정
		list.set(4, 500);
		System.out.println("데이터 갯수 : " + list.size());
		System.out.println("5번째 값 : " + list.get(4));
		// 1. 전체 데이터 확인
		System.out.println("1. 전체 데이터 확인 ===");
		for(int x = 0; x<list.size(); x++) {
			System.out.print(list.get(x) + " ");
		}
		// 2. 전체 데이터 확인
		// Collection 클래스만 사용가능
		System.out.println("\n2. 전체 데이터 확인 ===");
		java.util.Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		// 3. 전체 데이터 확인
		System.out.println("\n3. 전체 데이터 확인 ===");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 전체 데이터 삭제
		list.clear();
		System.out.println("데이터 갯수 : " + list.size());
		System.out.println("5번째 값 : " + list.get(4));
		// 예외 발생, java.lang.IndexOutOfBoundsException
	
	}

}