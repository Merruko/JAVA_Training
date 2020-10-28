package day11;

public class ArrayTest {

	public static void main(String[] args) {

		int kor = 10;
		int eng = 40;
		int math = 50;
		int total = kor + eng + math;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
	//		 	3개 요소의 갯수, 배열의 크기, 정수				
	//	int kimScore[] = { 10, 40, 50 };          // 4byte*3 -> 12byte
	//	int[] kimScore = { 10, 40, 50 };
	//       레퍼런스변수(스택)       배열객체(heap)	
		int[] kimScore = new int[3];
		//        index, 첨자, 위치, ~번째, 색인, 순서, 0부터 시작
		kimScore[0] = 10;
		kimScore[1] = 40;
		kimScore[2] = 50;
		// kimScore[3] = 100;  // java.lang.ArrayIndexOutOfBoundsException 오류
		total = kimScore[0] + kimScore[1] + kimScore[2]; 
		System.out.println(kimScore[0]);
		System.out.println(kimScore[1]);
		System.out.println(kimScore[2]);
		for (int i = 0; i < 3; i++) {
			
			System.out.println(kimScore[i]);
			
		}
		for (int i = 0; i < kimScore.length; i++) {
			
			System.out.println(kimScore[i]);
			
		}
		
		System.out.println("kimScore배열 요소의 갯수 : " + kimScore.length);
		
		double[] dArr = {1.1 , 2.2 , 3.3};   // 8byte*3 -> 24byte
		// double[] dArr = new double[3];
		int size = dArr.length;
		for(int idx = 0; idx < size; idx++) {
			System.out.println(dArr[idx]);
		}
		
		char[] chArr = {'H','a','p','p','y'};  // 2byte*5 -> 10byte
		size = chArr.length;
		for(int a = 0; a < size; a++) {
			System.out.println(chArr[a]);
		}
		
		String[] season = {"봄","여름","가을","겨울"};
		size = season.length;
		for(int i = 0; i < size; i++) {
			System.out.println(season[i]);
		}
		
		// 문제1) 한 영단어내의 모음의 갯수 	 	A E I O U  a e i o u
		char[] word = {'H','a','p','p','y'};
		int mo = 0;
		for(int idx = 0; idx < word.length; idx++) {
			char c = word[idx];
			if ( c >= 'A' && c <= 'Z') {  // 알파벳 대문자->소문자
				 c = (char)(c+32);
				
			}
			
			switch(c) {
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				mo++;
			}	
			
		} // for-end
		
		System.out.println("단어 내의 모음의 갯수 : " + mo);
		
		// 문제2) 대소문자를 서로 변환하여 출력(대문자 <-> 소문자)
		char[] wd = {'H','a','p','p','y'};
		for(int idx = 0; idx < word.length; idx++) {
			char ch = wd[idx];
			if ( ch >= 'A' && ch <= 'Z') {  // 알파벳 대문자 -> 소문자
				System.out.println((char)(ch+32));
			} else if ( ch >= 'a' && ch <= 'z') {  // 알파벳 소문자 -> 대문자
				System.out.println((char)(ch-32));
			} else {
				System.out.println(ch);
			}
		} // for-end
		
		// 아니면,
		System.out.println("Happy".toUpperCase());
		System.out.println("Happy".toLowerCase());
		
	} // main-end

} // class-end


/*
 
=== 자료형(data type) ===
1. 기본형(primitive type) : stack memory
1) 정수형 : byte(1), char(2), short(2), "int(4)", long(8)
2) 실수형 : float(4), "double(8)"
3) 논리형 : boolean(1)
2. 참조형(레퍼런스형)(reference type) : heap memory
1) 배열형
2) 열거형
3) 클래형 : String
4) 인터페이스형
=== 배열변수(stack) vs 배열(객체, heap)
- array : 확장자료형, 동질형 자료의 연속적 모임
                  (~끼리 ~끼리)
                  int int int
                  double double double
                  char char char
				    요소s(element)s
				    	  
*/