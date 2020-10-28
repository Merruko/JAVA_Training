package day22;
import java.lang.String;
public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");				// new "abc"@힙
		String str2 = "abc";									// "abc"@데이터영역(상수영역)
		
		// '단일문자상수'  ---> 'a', 'A', '1', '!',  '<', '가'			(불변의 데이터)
		// "문자열상수"    ---> "Hi", "a", "가나다", "Ha"     (불변의 데이터)
		String str3 = new String("하이");
		System.out.println(str3);
		String str4 = "Hi";
		System.out.println(str4);
		str4 = "Bye";
		
//		StringBuffer str5 = "Bye";    // 에러
//		StringBuffter 클래스와 StringBuilder 클래스 : 가변(mutable), new인스턴스화
		StringBuffer str5 = new StringBuffer("Bye");
		System.out.println(str5);
		
		System.out.println(str3);
//		System.out.println(str3.length);			// 에러
		System.out.println(str3.length());			// 문자열의 글자갯수
		System.out.println(str4.length());
		
		System.out.println(str1);
		str1 = str1 + "java";
		System.out.println(str1);
		str1 = "hi" + "java";
		System.out.println(str1);
		
		String str = "Gone With The Wind";
		// 0번째 문자 추출
		System.out.println(str.charAt(0));
		// 마지막"번째" 문자 추출
		System.out.println(str.charAt(17));
		System.out.println(str.length());    				// 18
		System.out.println(str.length()-1);				// 17
		System.out.println(str.charAt(str.length()-1));
		
		
		// "G"문자의 위치(인덱스)
		System.out.println(str.indexOf("G"));  // 0번째
		// "R"문자/없는 문자열
		System.out.println(str.indexOf("R"));	// -1
		// "W"문자/중목 문자열
		System.out.println(str.indexOf("W"));	// 5번째
		
		// 메소드명이...
		// set..(설정) get..(참조) to..(변환) is..(~이니?)
		System.out.println(str.isEmpty()); // 공백이니? false/true
		//str = "";
		//System.out.println(str.isEmpty()); 
		System.out.println(str.toLowerCase()); // 소문자로 변환
		System.out.println(str);
		System.out.println(str.toUpperCase()); // 대문자로 변환
		
		str = str.replace('n', 'N');
		System.out.println(str);
		
		// 문자열 추출(자르기)
		System.out.println(str.substring(6));  	// 6번째~마지막
		System.out.println(str.substring(6, 11));
		// 마지막 글자(한문자) 출력 : 'd'
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.substring(17, 18));
		System.out.println(str.substring(str.length()-1, str.length()));
		// 첫글자
		System.out.println(str.charAt(0));
		System.out.println(str.substring(0,1));
		
		// 문자열 분리
		// String str = "Gone With The Wind";
		String[] word = str.split(" ");
		// word[0] : "Gone"
		// word[1] : "With"
		// word[2] : "The"
		// word[3] : "Wind"
		for(int i = 0; i<word.length; i++) {
			System.out.println(word[i]);
		}
	}

}