package day04;

public class Operator3 {

	public static void main(String[] args) {
		
		// 교재 77page : (바이트)논리연산자
		// 논리부정(NOT) →　논리곱　→　논리합(OR)
		//     !a        a&&b     a||b
		int myAge = 27;
		// myAge는 20대이니?
		// myAge는 20이상이면서, myAge는 30미만
		boolean value = false;
		value = (myAge >= 20) && (myAge < 30);
		System.out.println(value);
		
		
		// 교재 78 page : 단락 회로
		int num1 = 10;
		int i = 2;
		//System.out.println((num1 = num1 + 10));
		value = ((num1 = num1 + 10)<10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);   // 결과 : 20
		System.out.println(i);      // 결과 : 2
		
		
		value = ((num1 = num1 + 10)<10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);   // 결과 : 30
		System.out.println(i);      // 결과 : 4
		
		
		// (비트 bitwise)논리연산자 : 교재 83 page
		// 0, 1
		
		// 논리연산자
		// 논리부정(NOT) → 논리곱(AND) → 논리합(OR)
		//     !a        a && b       a||b
		
		// 비트논리 연산자
		// 논리부정(NOT) → 논리곱(AND) → 배타적논리합(XOR) → 논리합(OR)
		//    ~a           a&b          a^b           a|b
		
		System.out.println(!true);   // false
		System.out.println(!false);  // true
		boolean a = true;
		System.out.println(!a);      // false
		
		int num2 = 5;                // 0~0101 (32자리)
		int num3 = 10;               // 0~1010 (32자리)
		int result1 = num2 & num3;   // 0~0000 (둘다 참이어야 참이니 32자리 다 거짓임)
		System.out.println(result1); // 결과 : 0
		
		int num4 = 5;                // 0~0101 (32자리)
		int num5 = 10;               // 0~1010 (32자리)
		int result2 = num4 | num5;   // 0~1111 (둘중 하나만 참이어도 참)
		System.out.println(result2); // 결과 : 15
		
		int num6 = 5;                // 0~0101 (32자리)
		int num7 = 10;               // 0~1010 (32자리)
		int result3 = num6 | num7;   // 0~1111 (둘이 같으면 거짓, 둘이 다르면 참)
		System.out.println(result3); // 결과 : 15
		
		System.out.println(!false);  // 결과 : true
		System.out.println(~0);      // 결과 : -1
		// 00000000 00000000 00000000 00000000 (0)
		// 11111111 11111111 11111111 11111111 (~0)  -> 이해 안되겠지만 그냥 그렇대;;
		System.out.println(~1);      // 결과 : -2	
		// 00000000 00000000 00000000 00000001 (1)
		// 11111111 11111111 11111111 11111110 (~1)  -> 이해 안되겠지만 그냥 그렇대;;		
		
		
		// 교재 86 page
		// 비트bitwise이동shift연산자
		// 정수연산 : %,<<,>>,>>>,~,&,^,|
		System.out.println(14<<2);    // 56
		System.out.println(14>>2);    // 3
		System.out.println(14>>>2);   // 3
		
		// << : Left Shift bitwise-operator
		// x << n : (1비트씩)n회 좌측으로 이동
		System.out.println(1<<1);     // 2
		System.out.println(1<<2);     // 4
		System.out.println(1<<3);     // 8
		
		// >> : Right Shift bitwise-operator
		// x >> n : (1비트씩)n회 우측으로 이동
		System.out.println(8<<1);     // 4
		System.out.println(8<<2);     // 2
		System.out.println(8<<3);     // 1
		
		// << : padding bit 가 무조건 0 (논리shift)
		// >> : padding bit 가 무조건 0 (논리shift)
		// >>> : padding bit 가 부호비트(+:0으로, -:1로) (산술shift)
		System.out.println(-4>>2);    // -1
		System.out.println(-4>>>2);    // 1073741823
		
		
		
	}

}