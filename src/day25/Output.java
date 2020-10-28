package day25;

public class Output {

	public static void main(String[] args) {
		
//		System.out.print();
//		System.out.println();		
//		System.out.printf();

		System.out.println("\"");
		System.out.println("\\");
		System.out.printf("JAVA\n");
		
		System.out.println("정수 : 357");
		System.out.println("정수 : " + 3 + 5 + 7);
		System.out.printf("정수 : %d%d%d",3,5,7);
		
// 		출력 서식 지정문자
// 		%d 10진 정수형
//      %f 10진 실수형
//      %c (단일)문자형
//		%s 문자열형
//		특수문자 (줄바꿈)\n (탭간격이동)\t
		
		System.out.printf("실수 : %f %f \n",1.2,3.4);
		System.out.printf("#%6.2f#\n",1.2);
		System.out.printf("#%-6.2f#\n",1.2);
		
		System.out.printf("문자 : %c %c\n",'R','r');
		System.out.printf("%5c\n",'R');
		System.out.printf("%-5c\n",'R');
		
		System.out.printf("문자열 : %s %s\n","JAVA","START");
		System.out.printf("#%10s\n","JAVA");
		System.out.printf("#%-10s#\n","JAVA");
		
	}

}