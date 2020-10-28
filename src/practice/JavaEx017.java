package practice;

class Rect {
	
	private int yoko, tate;
	
	public Rect(int yoko,int tate) {
		this.yoko = yoko;
		this.tate = tate;
	}
	
	public void setYoko (int yoko) {
		this.yoko = yoko;	
	}
	
	public void setTate (int tate) {
		this.tate = tate;
	}
	
	public int getYoko() {
		return yoko;
	}
	
	public int getTate() {
		return tate;
	}

	public void hirosa() {
		
		System.out.println(yoko*tate);
		
	}
	
	public void mawari() {
		
		System.out.println((yoko+tate) * 2);
		
	}
	
}


	public class JavaEx017 {
	
	/*	문제17]
		※ 다음의 문제들에 맞추어 메서드를 정의하고 main() 에서 호출하여 
   		실행하도록 해보세요. (출력결과는 자유롭게 만들어 보세요 ^^)
		사각형을 나타내는 Rect 클래스를 정의하시오.
		사각형은 private 가로와 세로를 가지며
		넓이를 반환하는 area() 메서드
		둘레를 반환하는 round() 메서드를 가지고 있다.
		getter와 setter 메서드도 추가하시오. */
	
		
		public static void main (String[] args) {
			
			Rect sikaku = new Rect(5,10);
			
			sikaku.hirosa();
			sikaku.mawari();
			
			
		}
			
		 
}
	
	