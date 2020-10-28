package day24;

public class CollectionTest {

	public static void main(String[] args) {
		
		
	}

}

/*  
  	교재 : 404page~
  === Java Collection Framework ===
  - 자바에서 제공하는 자료 구조 라이브러리
  - 객체들을 효율적으로 추가,삭제,검색할 수 있도록 제공되는 컬렉션 라이브러리
  - 배열(array)의 단점을 개선한 클래스로 객체만 저장 할 수 있다.
  - java.util.*
  - 객체를 수집하여 저장하여 두었다가 요청이 있을시 저장소에서
        추출하여 제공하는 것을 목적으로 함
  - int 등 각종 기본 데이터 타입을 저장하려면
    Interger Wrapper Class 등으로 변환해서 사용해야 한다. --> 오토박싱 가능
  - 배열의 크기는 변경이 불가능하나 ArrayList, Vector는 동적인 크기 변경이 가능하다.
  - Collection Framework 의 인터페이스
  - List : 순서가 있는 데이터의 집합. 데이터의 중복을 허용
  		      배열기반. 순서를 유지. 중복허용
  		      매개변수가 중요.
  		   ArrayList, Iterator, Vector, Collections
  		   
  - Set : 순서를 유지하지 않는 데이터의 집합
  		    중복허용안함.
  		  Set,HashSet,TreeSet  
  
  - Map : 순서가 없다.
  		  key, value쌍으로 이뤄져 있음. 순서 유지하지 않음.
  		  key 중복불가능
  		  value 중복가능
  	   	    우편번호,지역번호
*/