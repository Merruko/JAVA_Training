package day05;

public class Operator6 {

	public static void main(String[] args) {
		
		// 교재 74page
		
		int a = 10;
		++a;
		System.out.println(a); // 11
		a = 10;
		a++;
		System.out.println(a); // 11
		
		int x;
		a = 10;
		x = ++a;
		System.out.println("x:" +x); // 11
		System.out.println("a:" +a); // 11

		a = 10;
		x = a++;
		System.out.println("x:" +x); // 10 !!!!!!! x출력하고 a에 +1 하는거니까.
		System.out.println("a:" +a); // 11
		
		a = 10;
		System.out.println(++a);     // 11
		
		a = 10;
		System.out.println(a++);              // 10
		System.out.println("최종 a : " + a);    // 11
		
		a = 10;
		x = 20;
		int y = 7 + ++a + x--;  
		
		// (1) ++a;
		// (2) y = 7 + a + x;
		// (3) x--;
		
		System.out.println(a);    // 11
		System.out.println(x);    // 19
		System.out.println(y);    // 38  
		
		int num = 7;
		System.out.println(-num); // -7
		System.out.println(num);  // 7
		
		num = -num;               // num *= -1;
		System.out.println(num);  // -7
		
	}  // main-end
	
} // class-end

/* 
 * ===단항연산자(산술처리) : ++,--,-
 *
 * 
 *                  전위     후위
 * 1. 증가연산자(++)   ++a  a++
 * 2. 감소연산자(--)   --a  a--
 * 
 *                  a=a+1;    a=a-1;
 *                  a+=1;     a-=1;
 *                  ++a;      --a;
 *                  a++;      a--;
 * 
 * 3. 부호연산자(-)    -a
 * 
 * 
 * */