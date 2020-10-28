package day05;

import java.util.Scanner;

public class Operator7 {

	public static void main(String[] args) {

		// (조건연산자) 조건식? 참값 : 거짓값
		//          (결과)논리값
		//          true/false
		// if~else문
		// 삼항연산자 --> 항1 ? 항2 : 항3
		// 교재 page 81
		int x = 100;
		int y = 20;
		int max;
		int min;
		max = (x>y) ? x: y;        // max = (x<y) ? y:x;
		min = (x<y) ? x: y;
		System.out.println("x와 y값 중 큰값 : " + max);
		System.out.println("x와 y값 중 작은값 : " + min);
	
			
	}

}


