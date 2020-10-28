package rv_inheritance;

public class Engineer extends Person {
	
	int companyID;

	public Engineer(String name, int age, int companyID) {
		
		super (name, age);	// Person 클래스
		this.companyID = companyID;
		
	}

}