package day03;

import java.util.Scanner; // 外部パッケージ使用

public class Operator {

	public static void main(String[] args) {
	
	//int num1 = 5;
	//int num2 = 2;
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("첫번째 정수입력 : ");
	int num1 = input.nextInt();
	System.out.print("두번째 정수입력 : ");
    int num2 = input.nextInt();
    
	int result = num1 + num2;
	System.out.println("덧셈:" + result);              //　結果　7
	System.out.println("덧셈:" + num1 + num2);         //　結果　52
	System.out.println("덧셈:" + (num1 + num2));       //　結果　7
	System.out.println("뺄셈:" + (num1 - num2));       //　結果　3
	System.out.println("곱셈:" + (num1 * num2));       //　結果　10
	System.out.println("나눗셈(몫):" + (num1 / num2));  //　結果　2
	System.out.println("나눗셈(몫):" + ((double)num1 / (double)num2)); // 結果　2.5
	System.out.println("나눗셈(나머지):" + (num1 % num2));  //　結果　1
		
		
	} // main-end

} // class-end

/*
 * 연산자(operator) : 연산기능을 표현하는 기호
 * ----> 연산대상의 갯수, 피연산자, 항, operand
 * 1. 단항연산자 ~a, -a, ++a, a--, !a, (int)a [항이 하나니까]
 * 2. 이항연산자 a+b, a-b, a&&b, a&b, a=b, a|b, a==b, a<b [항이 두개니까]
 * 3. 삼항연산자 ? : [항이 세개니까]
 *  
 * ===이항연산자의 우선순위===
 *                      shift비트연산자                          논리비트연산자
 *                       <<,>>,>>>                 &→^→|
 *                             (결과)논리값:true,false      (결과)논리값:true,false
 * (   ) -----> 산술연산자 -----------> 관계(비교)연산자 ------------> 논리연산자
 *  괄호               * / → + -         <,<=,>,>= → ==,!=          NOT → AND → OR
 *              %                                           !     &&   ||
 *  
 *  나눗셈 5/2 -> 2            5>2→true            
 *  int int int             5>2→false
 *  5.0/2.0 -> 2.5          5==2->false
 *  double double double    5!=2->true             
 *              
 *  나머지 5 % 2 -> 1            
 *              
 */