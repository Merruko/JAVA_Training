package rv_list;

public class Array {

	public static void main(String[] args) {
		// 배열 자료 구조
		String[] array1 = new String[] {"양파", "마늘", "감자", "고추"};
		String[] array2 = new String[5];
		
		// 자료 추가 - "상추"
		array2[0] = "양파";
		array2[1] = "마늘";
		array2[2] = "상추";
		array2[3] = "감자";
		array2[4] = "고추";
		
		// 자료 전체 조회
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		
		// 자료 수정
		array2[3] = "고구마";
		for(String arr : array2) System.out.print(arr + " ");
	}
	
}