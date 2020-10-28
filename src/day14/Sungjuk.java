package day14;

public class Sungjuk {
	// field
	public String name;
	public int kor, eng, math;
	private int avg;
	// method
	public void calc() {
		avg = (kor+eng+math)/3;
	}
	public void disp() {
		System.out.println("name : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("math : " + math);
		System.out.println("avg : " + avg);
		
	}
				
}
