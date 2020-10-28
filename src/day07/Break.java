package day07;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		// 유한 반복 <--- 무한반복+단순if문  { break; }
		// break; 제어문은 블럭영역{}을 탈출한다.
		//              switch, while, for, do~while
		// 정수를 "계속해서" 입력받고, <--- 무한반복
		// 입력받은 정수가 0이면, 반복을 끝내고,
		// 입력받은 정수의 합을 출력하시오.
	
		int num;
		int total = 0;
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 입력 : ");
			num = in.nextInt();
			
			if(num==0) {
				
				
				break;
				
			} else {
				
				total += num;
			}
			
		} // while-end
		System.out.printf("합 : %d",total);
	}
	
}


/* === 무한반복 ===
 * 
 * while(true) {
 * 
 *      // 반복대상
 *  }
 *   
 * for(;;) {
 * 
 *      // 반복대상
 *      
 *  } 
 *
 *   
 */