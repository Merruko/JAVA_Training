package practice;

import java.util.Scanner;

/*
Random 클래스를 이용하여
가위/바위/보 게임 프로그램을 작성하시오.
사용자와 컴퓨터가 대결하는 것으로 하고
컴퓨터는 0부터 2까지의 난수를 발생시킨다.
0은 가위, 1은 바위, 2는 보로 간주하고
사용자가 입력한 수를 비교하여 승부를 결정한다.
사용자가 3을 입력하면 게임을 종료한다.
[결과]
=== 가위바위보 게임 ===
다음 중 하나를 선택해주세요.
가위(0), 바위(1), 보(2), 종료(3) : 0 (입력)
컴퓨터는 가위를 냈습니다.
비겼습니다.
다음 중 하나를 선택해주세요.
가위(0), 바위(1), 보(2), 종료(3) : 1 (입력)
컴퓨터는 가위를 냈습니다.
이겼습니다.
다음 중 하나를 선택해주세요.
가위(0), 바위(1), 보(2), 종료(3) : 1 (입력)
컴퓨터는 가위를 냈습니다.
졌겼습니다.
다음 중 하나를 선택해주세요.
가위(0), 바위(1), 보(2), 종료(3) : 3 (입력)
게임을 종료합니다.
*/

class Random {
	
	public static void hairi () {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			int cNum = (int)(Math.random()*3);
			System.out.println("다음 중 하나를 선택해주세요.");
			System.out.print("가위(0), 바위(1), 보(2), 종료(3) :");
			int pNum = input.nextInt();
			
			if (cNum == 0) {
				
				if(pNum==0) {
					
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("비겼습니다.");
					continue;
					
				}
				
				if(pNum==1) {
					
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("이겼습니다.");;
					continue;
					
				}
				
				if(pNum==2) {
					
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("졌습니다.");;
					continue;
					
				}
			}
			
				if (cNum == 1) {
					
					if(pNum==0) {
						
						System.out.println("컴퓨터는 바위를 냈습니다.");
						System.out.println("졌습니다.");
						continue;
						
					}
					
					if(pNum==1) {
						
						System.out.println("컴퓨터는 바위를 냈습니다.");
						System.out.println("비겼습니다.");
						continue;
						
					}
					
					if(pNum==2) {
						
						System.out.println("컴퓨터는 바위를 냈습니다.");
						System.out.println("이겼습니다.");
						continue;
						
					}
				}
					
					if (cNum == 2) {
						
						if(pNum==0) {
							
							System.out.println("컴퓨터는 보를 냈습니다.");
							System.out.println("이겼습니다.");
							continue;
							
						}
						
						if(pNum==1) {
							
							System.out.println("컴퓨터는 보를 냈습니다.");
							System.out.println("졌습니다.");
							continue;
							
						}
						
						if(pNum==2) {
							
							System.out.println("컴퓨터는 보를 냈습니다.");
							System.out.println("비겼습니다.");
							continue;
							
						}
							
			}
					
					if (pNum==3) {
						
						System.out.println("종료합니다.");
						break;
						
					}
					
					else {
						
						System.out.println("다시 입력해주세요.");
						continue;
						
					}
					
					
		}
		
			
	}
	
	
}


public class JavaEx028 {

	public static void main(String[] args) {
		
		Random.hairi();

	}

}