package day12;

public class ArrayTest5 {

	public static void main(String[] args) {
		// ���������� : ��������(��->ū)
		
			    int[] a = { 11, 23, 7, 9, 14 };
			    System.out.println("=== ���� �� ===");
			    for( int i=0; i<5; i++ ) {
			     System.out.printf("%5d", a[i]);
			    }

			    for( int i=0; i<4; i++ ) { // �� ȸ��(�ܰ�) ��
			     for( int j=0; j<4-i; j++ ) { // �� ȸ�������� �� Ƚ��
			      if( a[j] > a[j+1] ) {  // �� > �� : ��������
			            // �� < �� : ��������
			       // ��ȯ�� : SAWP
			       int tmp = a[j];
			       a[j] = a[j+1];
			       a[j+1] = tmp;
			      }
			     } // (j)for end  
			     
			     System.out.printf("\n %d �ܰ� �� : ", i+1);
			     for( int k=0; k<5; k++ ) {
			      System.out.printf("%5d", a[k]);
			     }
			    } // (i)for end
			    
			    System.out.println("\n=== ���� �� ===");
			    for( int i=0; i<5; i++ ) {
			     System.out.printf("%5d", a[i]);
			     
			    }
			 }

		}