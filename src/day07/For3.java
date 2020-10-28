package day07;

public class For3 {

	public static void main (String[] args) {
		
		// 1) 중첩for : 사각형(5x5) 별(*)출력
		
	
		for(int row=0;row<2;row++) {	// 외부(고정) : 행
			
		
		for(int col=0;col<5;col++) {    // 내부(변화) : 열  
			// 0으로 시작하는것에 익숙해지는게 좋다.
			// 이렇게 변수 선언하면 여기서의 i는 해당 for문에서만 쓰이는 지역변수가 되버리는 것에 주의.
			System.out.println("*****");
			
		}
		
	    System.out.println();   // 5별 출력 후 한줄 띄우기
		
		} // 코드 정리 : 별 5줄 생성하고 한 줄 띄는 것을(col for) - 2번 반복하라(row for)
		
		
		
		
		
		
		
		
		
		
		// 2) 중첩for : 사각형(5x5) 1~25 출력
		
		int num = 1;
		
		for(int i=0;i<5;i++) {	// 외부(고정) : 행
					
			for(int j=0;j<5;j++) {    // 내부(변화) : 열  

					System.out.printf("%3d",num);
					num ++;
					
					/* 
					 * System.out.printf("%3d",num++);
					 * 이렇게하면 한줄로 대체 가능.
					 * ++num 으로 하면 숫자가 2부터 시작 됨
					 */
					
				}
				
			    System.out.println();   // 5별 출력 후 한줄 띄우기
			    
				} // 코드 정리 : 별 5줄 생성하고 한 줄 띄는 것을(col for) - 5번 반복하라(row for)
		
		
		
		System.out.println();
		
		
		// 3) 중첩for : 삼각형 모양 * 출력
		
		for (int i=0;i<5;i++) {
			
			for (int j=0;j<i+1;j++) {
				        
						// i  j
				
				        // 0  0 * (0<1)
				        // 0  1 x (1<1x)
				
				        // 1  0 * (0<1)
				        // 1  1 * (1<2)
				        // 1  2 x (2<2x) .....
				         
				System.out.print("*");		
				
			}
			
				System.out.println();
				
		}
		
		
		
		
		
		
		
		
		// 4) 중첩for : 왼쪽에 붙은 역삼각형 모양 출력
		
		for (int i=0;i<5;i++) {
					
			for (int j=6;j>i+1;j--) {
			// for (int j=0;j<5-i;j++) {
						
						// i  j
						
				        // 0  6 g (6>1)
				        // 0  5 g (5>1)
						// 0  4 g (4>1)
						// 0  3 g (3>1)
						// 0  2 g (2>1)
						// 0  1 x (1>1x)
					
				        // 1  6 g (6>2)
				        // 1  5 g (5>2)
				        // 1  4 g (4>2)
						// 1  3 g (3>2)
						// 1  2 x (2>2x) .....
						
						         
						System.out.print("g");		
						
					}
					
						System.out.println();
						
				}
		
				
				
				
				
		// 5) 중첩for : 오른쪽에 붙은 삼각형 모양 출력
				
		for (int i=0;i<5;i++) {
			
			for (int j=0; j<4-i;j++) {
				
				System.out.print(" ");
			}
			
			for (int j=0;j<i+1;j++) {
				
				System.out.print("f");
				
			}
			
			System.out.println();
			
		}
			
				
				
		
		
		
		
		// 6) 중첩for : 오른쪽에 붙은 역삼각형 모양 출력
		
		for (int i=0;i<5;i++) {
			
			for (int j=0;j<i;j++) 
				
			{
				System.out.printf(" ");
			}
			
			for (int j=0;j<5-i;j++)
		         
			{
				System.out.printf("h");
			}
			
			/*
			 *   hhhhh
			 * ㅁ   hhhh
			 * ㅁㅁ  hhh
			 * ㅁㅁㅁ hh
			 * ㅁㅁㅁㅁ h
			 * 
			 * */
			
			System.out.println();
		}
				
				
				
		
				
				
				
		// 7) 중첩for : 피라미드 모양 출력
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("p");
			}
			System.out.println();
		}
				
				
				
		
		
	}   // main-end
	
}   // class-end