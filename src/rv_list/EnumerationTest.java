package rv_list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<String> aniList = new Vector<>();
		
		aniList.addElement("cat");
		aniList.addElement("dog");
		aniList.addElement("pig");

		System.out.println("Vector 요소들은 다음과 같다.");
		for(int i=0; i<aniList.size(); i++) {
			System.out.println(i + "번 : " + aniList.elementAt(i));
		}
		
		Enumeration<String> enu = aniList.elements();
		System.out.println("vector의 객체인 aniList로 생성한 Enumeration 요소들");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
	}
}