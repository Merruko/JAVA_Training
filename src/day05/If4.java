package day05;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		// 중첩 if
		// 국어 영어 수학 점수 입력받아
		// 총점과 평균을 구한 후,
		// 평균이 90점 이상 'A'
		// 평균이 80점 이상 'B'
		// 평균이 70점 이상 'C'
		// 평균이 70점 미만 'F'
		
		          // 평균이 95점 이상인 경우 "장학생"
		          // 평균이 60점 이상인 경우 "합격"
		          // 단, 세과목 중 한 과목이라도 40점 미만인 경우 "재시험"
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("国語 点数 : ");
		int num1 = input.nextInt();
		System.out.println("英語 点数 : ");
		int num2 = input.nextInt();
		System.out.println("数学 点数 : ");
		int num3 = input.nextInt();
		
		int total = num1 + num2 + num3;
		double avg = total / 3;
		
		/* 선생님 코드
		
		char grade;
		if (avg>=90 && avg<=100) {
			grade = 'A';
		} else if (avg>=80) {
		    grade = 'B';
		} else if (avg>=70) {
		    grade = 'C';
        } else {
            grade = 'F';
        }
        
        
        
        // ----- OR
        if(avg >= 60) {
           if(kor<40 || eng<40 || math<40) {
             System.out.println("재시험");
           } else {
             System.out.println("합격");   
           }
           
              
           
        // ----- AND   
        if(avg >= 60) {
             if(kor >= 40 && eng>=40 && math >= 40) {
               System.out.println("합격");
             } else {
               System.out.println("재시험");
             }
           }
        
        
		*/
		
		
		
		if (num1<40 || num2<40 || num3<40) {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\n単位無し\n再試験", num1,num2,num3,total,avg);}
		else if (avg>=95) {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\n奨学生\n合格", num1,num2,num3,total,avg);}
		else if (avg>=90) {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\nA単位\n合格", num1,num2,num3,total,avg);}
		else if (avg>=80) {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\nB単位\n合格", num1,num2,num3,total,avg);}
		else if (avg>=70) {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\nC単位\n合格", num1,num2,num3,total,avg);}
		else if (avg>=60) {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\nF単位\n合格", num1,num2,num3,total,avg);}
		else if (avg>50)  {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\n単位無し\n合格", num1,num2,num3,total,avg);}
		else {System.out.printf("国語：%d\n英語：%d\n英語 ：%d\nトタル：%d\n平均：%.2f\n単位無し\n再試験", num1,num2,num3,total,avg);}
	
	}

}