package day12;

public class ArrayTest6 {

	public static void main(String[] args) {
		// 1차원 배열 : 선
		// int[] arr1 = new int[6];
		int[] arr1 = {11,22,33,44,55,66};
		// 1차원 배열의 전체 요소 출력하기
		for(int i=0; i<arr1.length; i++) {   // 6 대신 length 쓰면 유지보수 간단
			System.out.println(arr1[i]);
			
		}
		
		// 향상된 for(each-for) : 배열 전체요소의 순회
		for(int element : arr1) {		// element = arr1[0]; ----- element = arr1[5];
			System.out.println(element);
		}
		
		
		char[] ch = {'A','B','C'};
		for (char i : ch) {
			System.out.println(i);
		}
		
		
		// 2차원 배열 : 면
		//						세로  가로
		//						  행   렬      <----- 선언문(크기),대입문(위치)
		// int[][] arr2 = new int[2][3];
		int[][] arr2 = {{11,22,33}, 
				        {44,55,66}};
		// arr2[행][열] = 값;
		arr2[0][0] = 11;	 	 //	     0열   1열   2열   col
		arr2[0][1] = 22;         // 0행     11  22  33
		arr2[0][2] = 33;		 // 1행     44  55  66		
		arr2[1][0] = 44;		 //	row	
		arr2[1][1] = 55;
		arr2[1][2] = 66;
		
		
		
		for (int row=0; row<2; row++) { 			// 외부 : 고정반복(행 고정) ---->
			for(int col=0; col<3; col++) {			// 내부 : 변화반복(열 변화)
				System.out.println(arr2[row][col] + "");
			}
			
		}
		
	}

}