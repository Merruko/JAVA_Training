package day16;

public class MyDate {
	
	private int day,month,year;
	private boolean isValid;
	
	public MyDate() {}  // 디폴트 생성자
	
	public MyDate (int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public void setDay (int day) {
		
		this.day = day;

	}
	
	public void setMonth (int month) {
		// 유효한 월 : 1월 ~ 12월
		if (month < 1 || month > 12) {	// if(month >= 1 && month <= 12) {
			isValid = false;			// isValid = true;
		}								// }
		else
			this.month = month;
	}
	
	public void setYear (int year) {
		
		this.year = year;

	}
	
	public int getDay () {
		
		return day;

	}
	
	public int getMonth () {
		
		return month;

	}
	
	public int getYear () {
		
		return year;

	}
	
	public boolean isValid() {
		isValid = true;
		if (month == 2) {
			if(day >= 1 && day <= 28) {
				isValid = false;
			}
		}
		
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			if(day>=1 && day <= 31)
				isValid = true; break;
		default:
			isValid = false;
			
		}
		
		return isValid;
	}
	
	public void showDate () {
		
		if (isValid) {
			System.out.println(year + "년" + month + "월" + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
		
	}
	
	public static void main (String[] args) {
		
		MyDate date = new MyDate();
		
		MyDate date1 = new MyDate(30, 2, 2000);   // 2000년 2월 30일

		System.out.println(date1.isValid() ? "유효한 날짜입니다." : "유효하지않은 날짜입니다.");

		MyDate date2 = new MyDate(2, 10, 2006);   // 2006년 10월 2일
		
		System.out.println(date2.isValid() ? "유효한 날짜입니다." : "유효하지않은 날짜입니다.");
		
	}

	
	/*<MyDate 클래스 완성하기>
	- day, month, year 변수는 private로 선언합니다.
	- 각 변수의 get, set 메서드를 public으로 만듭니다.
	- MyDate(int day, int month, int year) "매개변수"를 갖는 생성자를 만듭니다.
	- public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인합니다.
	- MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 다음의 결과와 같이 확인합니다.*/

}