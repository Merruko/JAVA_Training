package day07;

public class For {
	
	public static void main (String[] args) {
		
		int i;
		i = 0;  // 반복제어변수 초기화
		
		for(;i<5;) {  // 굳이 세문장 다 채울 필요 없음 / 초기화,증감식 다 따로 둬도 됨
			System.out.println((i+1) + "번째 Hi, Java");  // 참일때 "반복대상"
			i++;  // 반복제어변수 증감식
		}
		
		System.out.println("최종 i : " + i);
		System.out.println("반복횟수 : " + i);
		
		
	} // main-end

} // class-end