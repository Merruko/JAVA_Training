package day10;

import java.util.Scanner;

public class Method7 {
	
	public static int getBig(int a, int b) {
		// 조건연산자 --> 조건식 ? 참값 : 거짓값

		
	    if (a>b) {
	    	
	    	return a;
	    	
	    }	    
	    
	    else {
	    	
	    	return b;

	    }
		
	}
	
	
	/*
	  
	 return a >= b ? a : b;
	 // 조건연산자 --> 조건식 ? 참값 : 거짓값
	 
	  */
	
	
	
	public static int getSmall(int a, int b) {
		
		
		 if (a<b) {
		    	
		    	return a;
		    	
		    }
		    
		    
		    else {
		    	
		    	return b;
		    	
		    }
			
		}
	
	
	/*
	  
	 return a >= b ? b : a;
	 // 조건연산자 --> 조건식 ? 참값 : 거짓값
	 
	 */

	
	
	public static void main (String[] args) {
		
		System.out.println(getBig(8,12));
		System.out.println(getSmall(8,12));
		
	}
	
	

/* ---------------------------------------------
	# 두 정수의 큰값과 작은값을 구하는 2개를 메소드를 각각 정의하세요!
  	// 1. 두 정수를 전달 받아 큰값를 구하는 메서드(getBig)를 만들고
  	// :  main()에서 큰값을 받아 출력하세요!
  	// 2. 두 정수를 전달 받아 작은값를 구하는 메서드(getSmall)를 만들고
  	// :  main()에서 작은값을 받아 출력하세요!
   --------------------------------------------- */


}