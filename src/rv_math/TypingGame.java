package rv_math;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String word[] = {"ant", "bear", "cat", "chicken", "cow", "dog", "eagle",
				         "horse", "monkey", "penguin", "tiger"};		
		int n = 0;   //정답 개수
		long miliseconds = 0;
		System.out.println("영어 타자 게임 - 준비되면 [Enter]");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();   //enter
		miliseconds = System.currentTimeMillis();  //start
		for(int i=1; i<=10; i++) {
			System.out.println("문제 " + i);
			int rand = (int) (Math.random()*word.length);
			String question = word[rand];
			System.out.println(question);
			
			String answer = sc.nextLine();
			if(answer.equals(question)) {
				System.out.println("통과!!");
				n++;
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}
		miliseconds = System.currentTimeMillis() - miliseconds; //end
		System.out.println("게임 종료");
		System.out.println("정답 개수 : " + n);
		System.out.println("소요 시간 : " + (float)miliseconds/1000 + "초");
		sc.close();
		
	}

}
