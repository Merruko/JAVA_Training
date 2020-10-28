package day17;

class School extends Object {
	
	public String name = "학교";
	
	public void disp() {
		
		System.out.println(this.name); // this 붙히는거 권장
		
	}	// disp()-end
	
} // class-end


class MiddleSchool extends School {
	
}


class HighSchool extends School {
	
	public String name = "고등학교";
	
	public void disp() {
	
		System.out.println("구로" + this.name);
	
	}
	
}



public class OverRide2 {	// 실행 클래스

	public static void main(String[] args) {
		
		MiddleSchool ms = new MiddleSchool();
		System.out.println(ms.name);
		ms.disp();
		
		HighSchool hs = new HighSchool();
		System.out.println(hs.name);
		hs.disp();
		
	}

}