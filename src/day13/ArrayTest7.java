package day13;

import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
	    double[] dArr = new double[5];
	    double sum = 0;
	    int i = 0;
	    
	    for (;i<dArr.length;i++) {
	    	
		    System.out.print("数字を入力してください：");
		    double num = in.nextDouble();
		    
			dArr[i] = num;
			
			sum += dArr[i];
		}
	    
	    
	    /* 
	     * 선생님 코드
	     * 
	     * Scanner stdln = new Scanner(System.in);
	     * System.out.print("요소 수 : ");
	     * int n = stdln.nextInt();
	     * double[] a = new double[n];
	     * 
	     * for(int i = 0; i < n; i++) {
	     * 		System.out.print("a[" + i + "]=");
	     * 		a[i] = stdln.nextDouble();
	     * } 
	     *
	     */
	    
	    
	    
	    System.out.printf("[結果]\n数：%d\n",i);
	    System.out.printf("a[0]:%.1f\na[1]:%.1f\na[2]:%.1f\na[3]:%.1f\na[4]:%.1f\n",
	    		dArr[0],dArr[1],dArr[2],dArr[3],dArr[4]);
		System.out.printf("合計は%.1fです。\n平均は%.2fです。",sum,sum/dArr.length);
	    
	    
	}

}