package day23;

import java.util.Calendar;

public class StringTest2 {

	public static void main(String[] args) {
		
		  // StringTest2.java
		  // 문제) 주민번호를 이용해서 아래와 같이 출력하도록 완성하시오.
		  // [출력결과]
		  // 생년월일 : 2000년11월30일
		  // 성별 : 남자
		  // 나이 : 21
		  // substring() // charAt()
		
		  String jumin = "0011303234567";
		  
		  int myYear = Integer.parseInt(jumin.substring(0, 2));
		  int myMonth = Integer.parseInt(jumin.substring(2, 4));
		  int myDate = Integer.parseInt(jumin.substring(4, 6));
		  int code = Integer.parseInt(jumin.substring(6, 7));
		  String gender = "";
		  switch(code) {
		  
		  case 1: case 3: gender = "男性"; break;		  
		  case 2: case 4: gender = "女性"; break;
		  
		  }
		  
		  /* switch(code%2) {
		  
		  case 0: gender = "남자"; break;		  
		  case 1: gender = "여자"; break;
		  
		  } */
		  
		  Calendar now = Calendar.getInstance();
		  int cYear = now.get(Calendar.YEAR);
		  
		  switch(code) {
		  case 1: case 2: // 2000년 이전
			  myYear = 1900 + myYear;
		  case 3: case 4:
			  myYear = 2000 + myYear;
		  }
		  
		  int myAge = cYear - myYear +1;
		  
		  
		  System.out.println("生年月日： "+ myYear + "年 " + myMonth + "月 " + myDate + "日");
		  
		  System.out.println("性別：" + gender);
		  
		  System.out.println("年齢：" + myAge);
		  
	}

}