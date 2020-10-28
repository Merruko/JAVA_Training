package day12;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 선택정렬 : 오름차순(작->큰)
		
			    int[] a = { 11, 23, 7, 9, 14 };
			    System.out.println("=== 정렬 전 ===");
			    for( int i=0; i<5; i++ ) {
			     System.out.printf("%5d", a[i]);
			    }

			    for( int i=0; i<4; i++ ) { // 총 회전(단계) 수
			     for( int j=i+1; j<5; j++ ) { // 각 회전에서의 비교 횟수
			      if( a[i] > a[j] ) {  // 앞 > 뒤 : 오름차순
			            // 앞 < 뒤 : 내림차순
			       // 교환법 : SAWP
			       int tmp = a[i];
			       a[i] = a[j];
			       a[j] = tmp;
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
			  

			 } // main-end
			} // class-end


			/* 
			 * 1차원 배열 {11, 23, 7, 9, 14}
			 * 중첩for문
			 * 단순if문
			 * 최솟값(오름차순)과 최댓값(내림차순)
			 * SWAP교환 처리  <--- 교환법(선택정렬, 버블정렬)
			 * 
			 * 
			 * === 정렬(sort)  ===
			 *      (기준) ------> 1) 오름차순 :      1 --------10
			 *            ASC (작->큰)  A --------Z
			 *                    가 --------하
			 *                          2) 내림차순 :   10 -------- 1
			 *                        DESC(큰->작)  Z -------- A
			 *                             하 -------- 가
			 *       1차정렬/2차정렬/3차정렬
			 *    교환법 : 선택정렬/버블정렬
			 *       삽입법 : 삽입정렬 
			 * === 생활코딩 
			*  https://www.opentutorials.org/course/543/2726 
			 */
		

/*
 * 1차원 배열 {11, 23, 7, 9, 14}
 * 중첩for문
 * 단순if문
 * 최소값(오름차순)과 최대값(내림차순)
 * SWAP교환 처리 <--- 교환법(선택정렬,버블정렬)
 * 
 * 
 * === 정렬(sort) ===
 * 
 *    (기준) ----> 1) 오름차순 : 		1 -------- 10
 *    				 ASC (작 -> 큰)   A -------- Z
 *                                  가 -------- 하
 *    
 *                2) 내림차순 DESC :   10 -------- 1 
 *                (큰 -> 작)          Z -------- A
 *                					하  -------- 가
 * 			1차정렬/2차정렬/3차정렬
 * 			교환법 : 선택정렬/버블정렬
 * 			삽입법 : 삽입정렬
 * 
 * 
 * */