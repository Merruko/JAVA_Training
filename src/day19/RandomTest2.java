package day19;

public class RandomTest2 {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		
		for (int i = 0; i < 10; i++) {
			
			int a = (int) (Math.random() * 6 + 1);
			
			if (a == 1) {
				
				num[0]++;
				
			}
			
			if (a == 2) {
				
				num[1]++;
				
			}
			
			if (a == 3) {
				
				num[2]++;
				
			}
			
			if (a == 4) {
				
				num[3]++;
				
			}
			
			if (a == 5) {
				
				num[4]++;
				
			}
			
			if (a == 6) {
				
				num[5]++;
				
			}
			
		}
		
		System.out.println("サイコロ10回投げ");
		System.out.println("1 : " + num[0] + "回");
		System.out.println("2 : " + num[1] + "回");
		System.out.println("3 : " + num[2] + "回");
		System.out.println("4 : " + num[3] + "回");
		System.out.println("5 : " + num[4] + "回");
		System.out.println("6 : " + num[5] + "回");
		
	}

}