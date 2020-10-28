package day21;

public class ArrayCopy {
	// 배열간의 요소값 복사
	// System.arraycopy(원본배열명, 복사할 첫위치, 사본배열명, 붙여 넣을 첫위치, 복사할 요소 개수)
	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1, 2, 3, 4, 5};
		// (복사 후,)    {1, 10, 20, 30, 40};
		array2[1] = array1[0];
		array2[2] = array1[1];
		array2[3] = array1[2];
		array2[4] = array1[3];
		
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i = 0; i<array2.length; i++) {   // (1)반복횟수(2)배열첨자 --> int
			System.out.println(array2[i]);
		}
		
		for(int value : array2) {  // 정수형 array2[]배열의 순회(전체요소 참조)
			System.out.println(value);
		}
		
		
	} // main-end

} // class-end