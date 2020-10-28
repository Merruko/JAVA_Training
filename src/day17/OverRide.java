package day17;

class Over {
	
	public int sub(int num1, int num2) {
		
		return num1-num2;
		
	}

}

class OverSub extends Over {
	
	// sub() 메소드를 더 가꾸고 정비할건데 이 행위 이름이 "오버라이드(부모 메소드 재정의)"
	
	public int sub(int num1, int num2) {
	
	return num1>num2 ? num1-num2 : num2-num1;
	
	}
	
}

public class OverRide {

	public static void main(String[] args) {
		
		Over cal1 = new Over();
		// 					sub() : 무작정 두 정수 뺄셈 (구닥다리)
		System.out.println(cal1.sub(10,20));   // (결과) -10
		
		
		OverSub cal2 = new OverSub();
		//					sub() : 둘 중 큰거에 작은거를 뺄셈 (신닥다리)
		System.out.println(cal2.sub(10,20));   // (결과)  10

		
	}

}

/*
 
 === OverLoad(ing) : 오버로딩 ===
 		(한 클래스 내에서) 중복
 		메소드명이 같고, 매개변수의 갯수 또는 자료형이 다름!
 		같은 이름의 메소드 n개에 n개의 또다른 기능 추가~
 
 
 
 === OverRide(ing) : 오버라이딩 ===
		(두 클래스 간에) 재정의
		메소드명이 같고, 매개변수의 갯수와 자료형 모두 같음!
*/