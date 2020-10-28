package practice;

/*
배열 길이가 5인 정수형 배열을 선언하고,
1~10 중 짝수만을 배열에 저장한후
그 합을 출력하시오.
*/

public class JavaEx029 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i <arr.length; i++) {
			
				arr[i] = 2*i+2;
				sum += arr[i];
				
			}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("合計：" + sum);
		
		}
		
	}