package day24;

import java.util.ArrayList;

class Mountain {
	
	String name;	// 산이름
	int height;		// 산높이
	public Mountain() {}
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
}

public class GenericTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("seoul");
		list.add("Jeju");
		//list.add("3");
		//list.add("3.14");
		//list.add("new Integer(5));
		
		Mountain one = new Mountain("한라산", 1950);
		Mountain two = new Mountain("지리산", 1900);
		Mountain three = new Mountain("설악산", 1700);
		int[] A = new int[50];
		ArrayList<Mountain> mList = new ArrayList<>();
		mList.add(one);
		mList.add(two);
		mList.add(three);
		
		// 1)
		for(int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i).name);
			System.out.println(mList.get(i).height);
			Object obj = mList.get(i);
			Mountain dto = (Mountain)obj;
			System.out.println(dto.name + ":" + dto.height);
		}
		
		// 2)
		java.util.Iterator<Mountain> iter = mList.iterator();
		while(iter.hasNext()) {
			Mountain dto = iter.next();
			System.out.println(dto.name + ":" + dto.height);
		}
		
	}

}

/*  교재 : 388page
=== 제네릭(스) generics ===
- 자료형(data type)을 일반화(generalize)하는 것
- 객체를 저장하는 기술 컬렉션 프레임워크를 개선한 기능
- E element(요소) ---> 클래스만 가능
*/