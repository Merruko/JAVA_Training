package day06;

public class While2 {

	public static void main(String[] args) {
		
		int val = 7;
		int i = 1;      // (1)반복횟수  (2) 곱해지는 수 (1~9)
		while(i<10) {
			
			//System.out.println(val + "X" + i + "=" + (val*i));
			System.out.printf("%d X %d = %2d\n", val, i, (val*i));
			
			i++;
		
		}
		
	}

}


/*
 * 구구단 출력 : 7단(i:반복횟수 9회) --> 0~8(+1),"1~9(+1)"
 * -------------
 * 7 X 1 = 7
 * ........
 * 7 X 9 = 63
 * -------------
 * 
 * %2d  -> 정수 오른쪽정렬할때 쓰기!!
 * %.2f -> 실수 2번째 자리~
 *  
 */