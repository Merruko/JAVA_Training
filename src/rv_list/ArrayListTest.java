package rv_list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> vegeList = new ArrayList();
		
		// 자료추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		vegeList.add("고추");

		// 검색
		System.out.println(vegeList.get(1));
		System.out.println(vegeList.get(3));
		
		// 전체 요소의 개수
		System.out.println("야채의 개수 : " + vegeList.size());
		
		// 자료 전체 조회
		for(int i=0; i<vegeList.size(); i++){
			String list = vegeList.get(i);
			System.out.print(list + " ");
		}
		
		// 특정 위치에 자료 추가
		vegeList.add(2, "상추");
		
		System.out.println();

		// 향상된 for문
		for(String list : vegeList) System.out.print(list + " ");	

		System.out.println();
		
		// 중복 추가
		vegeList.add("감자");
		for(String list : vegeList) System.out.print(list + " ");
		
		System.out.println();

		// 자료 수정, 변경
		vegeList.set(3, "고구마");
		for(String list : vegeList) System.out.print(list + " ");
		
		System.out.println();
		
		// 자료 삭제
		vegeList.remove(0);
		for(String list : vegeList) System.out.print(list + " ");
		
	}
}