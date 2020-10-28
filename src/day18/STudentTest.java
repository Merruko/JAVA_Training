package day18;

public class STudentTest {

	public static void main(String[] args) {
				
				STudent studentLee = new STudent();
				studentLee.setStudentName("김자탕");
				System.out.println(studentLee.serialNum);    // serialNum = 1000
				studentLee.serialNum++;						 // Lee객체만 시리얼넘버 1증가.
				System.out.println("--------------------------");
				STudent studentSon = new STudent();
				studentSon.setStudentName("김말이");
				System.out.println(studentSon.serialNum);	 
				// serialNum 이 static 일 경우      위 코드의 영향을 받아서 Son객체의 시리얼넘버도 1증가: 1001
				// serialNum 이 static 아닐 경우   위 코드의 영향을 안받아 Son객체의 시리얼넘버는 변한게 없으니 : 1000
				System.out.println(studentLee.serialNum); 	 // Lee객체는 그대로 1001		
	}
	
}

/* === satic === 
					     cf) 클래스 내의 필드 : 객체(인스턴스)마다 존재
1. static 변수 : (안)정적변수, 클래스 변수
   JVM으로 소스 로딩시, 메모리(데이터 영역) 할당
      프로그램 실행시 최소 한번만 메모리 할당 받음
      메모리 주소가 공유
      자주 생성이 필요한 객체의 경우, static 객체 형식으로
      생성하면 처리 속도를 많이 향상 시킬 수 있다.
     
2. static() 메소드 () : 클래스 함수()
	
*/