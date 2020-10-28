package day26;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

// 파일(A.txt)의 내용을 거꾸로 화면 출력하기
// 파일(A.txt)의 내용을 거꾸로 파일(B.txt)에 저장하기
// Copy A.txt B.txt

public class FileTest3 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(new File("C:/workspace/basicJava/src/day26/A.txt"));
		PrintWriter pw = new PrintWriter("C:/workspace/basicJava/src/day26/B.txt");
		
		String str1, str2 = "";
		while(sc.hasNextLine()) {
			str1 = sc.nextLine();
			int size = str1.length();
			for (int i = size-1; i>=0; i--) {
				str2 += str1.charAt(i);
				
			}
			pw.println(str2);
			str2 = "";
		}
		
		sc.close();
		pw.close();
		
	}
}

/* === 교재 512page ~ 514page ===
 * 
 * 스트림 					입력/출력		    바이트/문자		   기반/보조
 * ---------------------------------------------------------
 * FileReader   		입력			    문자(2byte)		      기반
 * FileOutputStream		출력			    바이트(1byte)      기반
 * BufferedReader       입력			    문자(2byte)       보조
 * 
 */