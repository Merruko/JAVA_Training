package day25;

import java.util.Scanner;

public class MoziOkikae {

	public static void main(String[] args) {
		
		        // 自分の得意な言語で
		        // Let's チャレンジ！！

		        Scanner sc = new Scanner(System.in);
		        String str = sc.next();
		        char ch = str.charAt(0);

		        if (ch == 'A') {
		        String text = str.replace('A', 'R');
		        System.out.println(text);
		        }
		        else {
		        	System.out.println(str);
		        	}
		        
		    }
}