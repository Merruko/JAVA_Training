package day11;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 프로그램 기본 알고리즘 : 최소값(min)과 최대값(max)
		int[] su = { 7,3,1,8,6 };
		int size = su.length;
		int min = Integer.MAX_VALUE;    // 최소값
		// int min = 999;				// 최소값
		// int min = su[0];             // 최소값   
		for(int idx = 0; idx < size; idx++) {
			if (min > su[idx]) {
				min = su[idx];
			}
			
		} // for-end
		
		System.out.println("최소값 : " + min);
		int max = Integer.MIN_VALUE;    // 최대값
		// int max = -999;              // 최대값
		// int max = su[0];
		for(int idx = 0; idx < size; idx++) {
			if (max < su[idx]) {
				max = su[idx];
			}
			
		} // for-end
		
		System.out.println("최대값 : " + max);
		
	}

}