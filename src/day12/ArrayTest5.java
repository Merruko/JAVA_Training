package day12;

public class ArrayTest5 {

	public static void main(String[] args) {
		// 버블택정렬 : 오름차순(작->큰)
		
			    int[] a = { 11, 23, 7, 9, 14 };
			    System.out.println("=== 정렬 전 ===");
			    for( int i=0; i<5; i++ ) {
			     System.out.printf("%5d", a[i]);
			    }

			    for( int i=0; i<4; i++ ) { // 총 회전(단계) 수
			     for( int j=0; j<4-i; j++ ) { // 각 회전에서의 비교 횟수
			      if( a[j] > a[j+1] ) {  // 앞 > 뒤 : 오름차순
			            // 앞 < 뒤 : 내림차순
			       // 교환법 : SAWP
			       int tmp = a[j];
			       a[j] = a[j+1];
			       a[j+1] = tmp;
			      }
			     } // (j)for end  
			     
			     System.out.printf("\n %d 단계 후 : ", i+1);
			     for( int k=0; k<5; k++ ) {
			      System.out.printf("%5d", a[k]);
			     }
			    } // (i)for end
			    
			    System.out.println("\n=== 정렬 후 ===");
			    for( int i=0; i<5; i++ ) {
			     System.out.printf("%5d", a[i]);
			     
			    }
			 }

		}