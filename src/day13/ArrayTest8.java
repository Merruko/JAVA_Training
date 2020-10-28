package day13;

public class ArrayTest8 {

	public static void main(String[] args) {
		// 220page : 이차원 배열의 행길이와 열길이
		
		int[][]arr = {{1,2,3},{4,5,6},{7,8}};
		System.out.println(arr.length);       // 6이 아닌 행길이 2
		System.out.println(arr[0].length);    // 열길이 3
		
		for (int i = 0; i < arr.length; i++) {			// i < arr.length 		= i < 2
			
			for(int j = 0; j < arr[i].length; j++) {    // j < arr[i].length 	= j < 3
				
				System.out.println(arr[i][j]);
				
			}
	
			System.out.println();
			
		}
		
	}

}