package rv_list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector<String> aniList = new Vector<>();
		
		// 자료 추가
		aniList.add("bear");
		aniList.add("chicken");
		aniList.add("cow");
		
		// 자료의 총개수
		System.out.println("동물의 수 : " + aniList.size());
		
		// 자료 조회
		for(String ani : aniList) System.out.print(ani + " ");
		
		System.out.println();
		
		// 자료 수정
		aniList.set(1, "dog");
		for(String ani : aniList) System.out.print(ani + " ");
		
		System.out.println();
		
		// 자료 삭제
		aniList.remove(2);
		for(String ani : aniList) System.out.print(ani + " ");
		
	}

}