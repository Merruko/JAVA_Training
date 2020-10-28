package day18;

import java.util.Scanner;

public class MathMethods {

	public static void main(String[] args) {
		
		// 절댓값, 제곱근, 원의 면적 구하기
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("실수값 : ");
		double x = in.nextDouble();
		
		System.out.println("절대값 : " + Math.abs(x));
		System.out.println("제곱값 : " + Math.sqrt(x));
		System.out.println("면 적 : " + Math.PI * x * x);
		System.out.println("면 적 : " + Math.PI * Math.pow(x, 2));
		
	}

}