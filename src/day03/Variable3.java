package day03;

public class Variable3 {

	public static void main(String[] args) {
		
		/* int level = 10;
		System.out.println(level); 
		
		45,46page */ //結果　10
		
		
		/*short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		
		50page */ //結果　30
		
		
		/* char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		53page */ //結果　A 65 B 67 C
		
		
		/* char ch1 = '한';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		54page */ //結果　한 한
		
		
		/* int a = 65;
		int b = -66;
		
		char a2 = 65;
		// char b2 = -66;
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		
        55page */  //結果　A ? A
		
		
		/* double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		57page */  //結果　3.14 3.14
		
		
		/* double dnum = 1;
		for(int i = 0; i < 10000; i++) {
			dnum= dnum+ 0.1;	
		}
		System.out.println(dnum);
		
		58page */  //結果　1001.0000000159
		
		
		/* boolean isMarried = true;
		System.out.println(isMarried);
		
		59page */  //結果　true
		
		
		/* var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		// str = 3;
		
		60page */  //結果　10 10.0 hello
		
		
		/* final int MAX_NUM = 100;
		final int MIN_NUM; //　final変数は宣言と同時に初期化しべき。そして変更不可。
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		MAX_NUM = 1000; ＜－エラー。常数は値を変えられない。
		
		61page */   //結果　100 0
		
		
		/* byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		65page */  //結果　10 10 10 20.0 30.0
		
		
		/* double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4); 
		
		68page */  //結果　1 2
		
		
		/*
		 * 암묵적 형변환
		 * (데이터 타입의 용량이 높은 쪽에서 낮은걸로 형변환은 가능하지만)
		 * 
		 * 
		 * 명시적 형변환 (강제형변환)
		 * (데이터 타입의 용량이 낮은 쪽에서 높은걸로 형변환은 강제로 해야됨)
		 * double dnum3 = 3.14
		 * int dnum3 = (int)dnum3;
		 * 
		 * 
		 * */
		
	}
}