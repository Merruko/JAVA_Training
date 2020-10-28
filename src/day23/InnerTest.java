package day23;

class WebProgram { // 외부 클래스
	
	String title = "Java Programming";
	
	class Language { // 내부 클래스
		
		String basic = "Java, HTML, JavaScript";
		void display() {
			System.out.println("기초 수업 : " + basic);
		}
	}
	
	class Smart {
		String basic = "Objective-C, Mac-OS";
		void display() {
			System.out.println("기초 수업 : " + basic);
		}
	}
	
	void print() {
		Language lang = new Language();
		lang.display();
		Smart sm = new Smart();
		sm.display();
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		// 교재 : 448page~
		// Language lang = new Language();   // 에러. 내부클래스는 바로 접근불가
		// Smart sm = new Smart();           // 에러. 외부클래스를 통해 단계적으로 접근해야만 함
		WebProgram web = new WebProgram();
		web.print();
		
		// 외부클래스 생성하지 않고도
		// 외부클래스명.내부클래스생성자()로 생성가능
		WebProgram.Language lang = new WebProgram().new Language();
		lang.display();
		
		WebProgram.Smart sm = new WebProgram().new Smart();
		sm.display();
		
	}

}



/* === inner class 내부클래스 ===
- 클래스 안에 클래스가 있는 경우
- 외부에서 접근할 필요가 없는 클래스
- GUI 어플리케이션의 (AWT, Swing)
- 이벤트(마우스 클릭, 마우스 오버, 키보드 눌렀을때) 처리에 많이 사용
    예) 자바스크립트 ---> jQuery, Ajax 
*/