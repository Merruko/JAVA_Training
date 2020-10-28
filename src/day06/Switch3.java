package day06;

public class Switch3 {

	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 100;
		int math = 60;
		int total = kor+eng+math;
		double avg = (double)total/3;
		char grade;
		int avg2 = (int)avg/10;
		     
		switch(avg2) {
		case 10: case 9:
			grade = 'A'; break;   // 평균이 100점과 90점대
		case 8:
			grade = 'B'; break;   // 평균이 80점대
		case 7:
			grade = 'C'; break;   // 평균이 70점대
		default:
			grade = 'F'; break;   // 그외
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + grade);
				
	}

}