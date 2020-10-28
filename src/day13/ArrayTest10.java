package day13;

public class ArrayTest10 {

	public static void main(String[] args) {
		// 2차원 배열 : 열 크기가 다른 행들의 배열
		// 					열크기 생략 -> 열크기가 일정하지 않으니까 가능
		// 					new int[2][3];   // 모든 행의 열크기가 같은 배열
		int[][] twoD = new int[4][];     // 열은 생략가능해도 행은 생략못함
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		int k = 0;
		
		for(int i = 0; i < 4; i++) {                   // 행고정
			for(int j = 0; j < i+1; j++) {			   // 열변화
				twoD[i][j] = ++k;
				System.out.printf("%3d",twoD[i][j]);
			}
			System.out.println();
		}
		
		
		for (int i=0; i < twoD.length; i++) {
			for(int j=0; j<twoD[i].length; j++) {
				System.out.printf("%3d",twoD[i][j]);
			}
			System.out.println();
		}
		
		
	}

}


// 그쳐? 무한반복 아아~ 이렇게 묻는다 대부분은 이렇게.. 그쳐?