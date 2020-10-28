package day04;

public class TotalMinute {

	public static void main(String[] args) {
		
		int total = 190;
		int minute = total % 60;
		int hour = total / 60;
		
		System.out.println("[結果]\n" + hour+"時間 " + minute + "分\n" + "総 " + total + "分");

	}

}