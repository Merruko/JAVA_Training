package day14;

class Login {
	
	// 1. 필드, 멤버변수
	private String id;
	private String passwd;
	private String userName;
	
	// 2. 생성자(constructor)
	public Login() {}
	
	// 3. 메소드, 멤버함수
	// (마우스 오른쪽) Source = Generate Getters and Setters
	public void setId(String id) {
		this.id = id;	// this.멤버변수 = 매개변수;
	} // setter
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	} // setter
	
	public void setUserName(String userName) {
		this.userName = userName;
	} // setter
	
	public String getId() {
		return id;
	} // getter
	
	public String getPasswd() {
		return passwd;
	} // getter
	
	public String getUserName() {
		return userName;
	} // getter
	
}

public class GetSetTest {

	public static void main(String[] args) {

		Login login = new Login();
		login.setId("abc777");  		  // login.id = "abc777" 쓸시 에러. private 멤버는 외부접근 불가능! 그러니까 setter 메서드를 이용한 것.
		//login.getId(); 			      // System.out.println(login.id) 쓸시 에러. private 멤버는 외부접근 불가능! 그러니까 getter 메서드를 이용한 것.
		login.setPasswd("1234");
		//login.getPasswd();
		login.setUserName("kim");
		//login.getUserName();
		
		System.out.println(login.getId());
		System.out.println(login.getPasswd());
		System.out.println(login.getUserName());
				
	}

}