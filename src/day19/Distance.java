package day19;

/*
Distance.java
두 점의 거리를 계산하는 클래스 MyPoint 내의 getDiatance() 메소드를 완성하시오.
[HINT] 
- 직각삼각형 '피타고라스 정의'를 검색하여 계산식을 작성하시오.
- 제곱근을 계산시  Math.sqrt( ) 을 사용하시오.
[결과 에]
1.4142135623730951
*/

class MyPoint {
	
	   int x; 
	   int y;
	   int a;
	   int b;
	   
	   MyPoint(int x, int y) {
		   
		   this.x = x;this.y = y;
		   
	   }
	   
	   public void getDistance(int a, int b) {
		   
		   int garo = a-x;
		   int sero = b-y;
		   
	   }
	   
}

public class Distance {

	   public static void main(String args[]) { 
		      MyPoint p = new MyPoint(1,1); 
		     
		      //System.out.println(p.getDistance(2,2)); 
		      
		   }
	   
		} 