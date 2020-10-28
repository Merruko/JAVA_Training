package day09;

public class Method3 {
	
	
		public static long fact (int num) {
		
	  	  long fac = 1;
		  for (int n = num; n>=1; n--) {
				
			fac *= n;
			
		}	
		
		     return fac;
		
		}	
		
		public static long fact1(int num) {
			// 재귀호출 : 자기자신 호출
			if(num == 0)
				return 1;
			else 
				return num * fact1(num-1);
		
		}
		
			public static void main(String[] args) {
			
		// 팩토리얼 : 3!= 3*2*1
		// 1. 입력 num!
		// 2. 처리 for문ㄴ {fac *= a;} -> fact()메소드
		// 3. 출력  num! --> fac
		
		int num = 3;
					
		long result = fact(num);
		System.out.println(num + "! : " + result);
		long result1 = fact1(num);		
		System.out.println(num + "! : " + result1);
		
			}
		
	}

