package day25;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사번 : ");
		int num = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		
		System.out.println(name);
		System.out.println(num);

	}

}

/* 
  	=== 표준 입출력 ===
	System.in - 콘솔로부터 데이터를 입력받는데 사용
	System.out - 콘솔로 데이터를 출력하는데 사용
	System.err - 콘솔로 오류를 출력하는데 사용
	
	표준입력 : from 표준입력장치(키보드) to Memory(변수)
	표준출력 : to 표준출력장치(모니터) from Memory(변수)
*/