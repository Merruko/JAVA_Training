package rv_innerclass;

class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	class Score {		// 인스턴스 내부 클래스
		int japanese;
		int java;
		
		void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("일본어 : " + japanese);
			System.out.println("자바 : " + java);
		}
	}
}

public class StudentInnerClass {

	public static void main(String[] args) {
		
		Student jang = new Student("장그래");
		Student.Score score = jang.new Score();
		score.japanese = 90;
		score.java = 80;
		score.showInfo();
		
	}

}
