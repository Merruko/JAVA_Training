package gita;

public class Circle {

	public static void main(String[] args) {
		
		double radius = 1; 
		double pi =  3.14;
		double r = 2 * pi * radius;
		double a = pi * radius * radius;
		
		System.out.println("[結果]\n\n半径：" + radius);
		System.out.println("パイ：" + pi);
		System.out.println("へり：" + r);
		System.out.println("広さ：" + a);	
		
		System.out.printf("%f\n",r); // %f = 基本は6目まで 　　　　　fの意味はfloat
		System.out.printf("%.1f",r); // %.1f = 1目まで表示 
		

	}

}