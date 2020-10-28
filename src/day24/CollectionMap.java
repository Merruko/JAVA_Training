package day24;

import java.util.*;

public class CollectionMap {

	public static void main(String[] args) {
		// 제네릭 : <키의 이름, 데이터의 종류> ---> 반드시 클래스 이름
		// Map : 순서가 없고, 이름(key) 중복 허용 안함
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 444);
		map.put("aaa", 555);
		map.put("ddd", null);
		System.out.println("Map size : " + map.size());
		
		System.out.println("Map size : " + map.size());
		// 데이터 꺼내기
		System.out.println(map.get("aaa"));
		// 데이터 삭제
		map.remove("aaa");
		System.out.println("Map size : " + map.size());
		// 데이터 추가는 put메소드 사용
		
		// 제거
		map.clear();
		
	}

}