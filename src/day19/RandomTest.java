package day19;

public class RandomTest {

	public static void main(String[] args) {
	
		boolean d = true;
		
		while (d) { 
		
			int a = (int) (Math.ceil(Math.random()*3));
			int b = (int) (Math.ceil(Math.random()*3));
			int c = (int) (Math.ceil(Math.random()*3));
			
			System.out.printf("%d  %d  %d\n",a,b,c);
		
			if (a==b && b==c && a==c) {
				System.out.println("成功");
				d = false;
				
			}
			
		}

	}
}