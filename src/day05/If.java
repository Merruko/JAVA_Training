package day05;

public class If {

	public static void main(String[] args) {
		// 교재 page 92
		
		int age = 10;
		
		if(age>=8) {
		System.out.println("학교에 다닙니다.");
		}
		
		int month = 7;
		int day = 2;
		if(month==1 && day==1) {
			++age;        // 참 실행문이여야한다.
		}
		System.out.println(age);
		
		
		
		int number = 5;
		if(number < 0) {
			System.out.println("음수입니다.");
		}
		if(number > 0) {
			System.out.println("양수입니다.");
		}
		if(number == 0) {	
			System.out.println("0입니다.");
		}
	}
}



/* === 구조적 프로그래밍(제어구조, 블록{}구조)
 * 
 * 1. 순차 제어
 * 	  int a;
 *    a = a + 1;
 *    
 * 2. 선택 제어
 *    1) if
 *         (1) 단순 if
 *         
 *              if(조건식) {
 *                true_실행문;
 *              } 
 *         
 *         (2) if~else
 *         
 *              if(조건식) {
 *                true_실행문;
 *              } 
 *              else {
 *			      false_실행문;              
 *              }
 *         
 *         (3) 중첩 if
 *         
 *              
 *              
 *              }
 *            
 *            
 *    2) switch~case
 *                    int, char형
 *           switch(변수명) {
 *             case  65 : 실행문1; break;
 *             case  66 : 실행문2; break;
 *             case 'c' : 실행문3; break;
 *             default  : 실행문4;
 *           }
 *         
 *         
 * 3. 반복 제어
 * 	 ("유한반복" VS "무한반복")
 *    "반복용 제어변수" --> 반복횟수(~번, ~회) : 5번
 *    
 *    시작    끝  (증감값)
 *    1,2,3,4,5 (+1)
 *    0,1,2,3,4 (+1)
 *    5,4,3,2,1 (-1)
 *    4,3,2,1,0 (-1)
 *    1,3,5,7,9 (+2)
 *    
 *    1) while 
 *    2) for
 *    3) do~while
 * 
 * 4. break;
 * 
 * 5. continue;
 * 
 * 
 * */