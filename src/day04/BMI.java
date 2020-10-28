package day04;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		
	/*	double m = 1.77;
		double cm = m * 100;
	    int kg = 65;
	    double bmi = (double)kg / (m*m);
	    		
	    System.out.println("背：" + cm);
	    System.out.println("重さ：" + kg);
	    System.out.printf("あなたのBMIは%.2fです。", bmi);	*/ 
		//내꺼
	    
	 
	    Scanner in = new Scanner(System.in);
	    System.out.print("背(cm)：");
	    double ki = in.nextDouble();
	    System.out.print("重さ(kg)：");
	    double mom = in.nextDouble();       // inは客体、nextDoubleはmethod
	    ki /= 100;    // ki = ki / 100
	    double bmi = mom / Math.pow(ki, 2); // double bmi = mom / (ki*ki);
	    System.out.printf("あなたのBMIは%.2fです。", bmi); 
	    // 선생님꺼
	
	}
}