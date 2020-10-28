package day01;

public class Variable {
	public static void main (String[] args) {
		//　変数（variable）：　Memory、常数をセーブする空間
		//　常数（constant）：　いつも同じ数、値、value
	        System.out.println(123);    // 一白二十三　（定数　常数）
		    System.out.println("123");  // いちにさん（文字列　常数）
		    System.out.println(123+1);
		    System.out.println("123+1");
		    System.out.println("123" + 1); //　+　文字列　連結　連算字
	}
}

/* === 상수 ===
 * 정수형 상수 : +1,3,5,-3 -------
 * 실수형 상수 : +3.14, -3.14 -------
 * 단정도형 실수 : 3.14f (4byte)
 * 배정도형 실수 : 3.14  (8byte)
 * 문자형 상수 : 'a','A','1','+' ----
 * 문자열형 상수 : "Hello", "Hi", "화이팅", "A" ----
 * 논리형 상수 : true, false ----
 * 
 * === 변수 : Memory ===
 * 1. 변수 선언문; (자바의 경우 최초선언시 초기화 해야만한다.)
 *      자료형 변수명;
 *  ex) int age = 0;
 *  
 * 2. 변수 대입(배정,할당)문;
 *      변수명 = 값;
 *  ex)age = 20;
 *      50 = 12; <- Error
 *    #변수명 규칙 : 대문자 또는 소문자 또는 숫자 또는 _ , $
 *      -숫자로 시작 못함
 *      -예약어는 변수명 사용할 수 없음
 *      -특수문자 사용할 수 없음
 *      
 * ===자료형(data type)===
 * 
 * 1. 기본(primitive) 타입
 *   1) 정수형 : 
 *        byte(1) -> char(2) -> short(2) -> int(4) -> long(8) 
 *   2) 실수형 : float(4) -> double(8)
 *   3) 논리형 : boolean(1)
 *   4) 문자형 : char(2)
 *   
 * 2. 참조(reference) 타입(확장형, 사용자정의자료형)
 *   1) class(클래스형)
 *   2) interface(인터페이스형)
 *   3) array(배열형)
 *   4) enum type(열거형)
 * 
 * 
 * 
 * 
 *  
 * */