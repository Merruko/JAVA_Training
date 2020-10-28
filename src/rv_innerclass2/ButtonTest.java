package rv_innerclass2;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		CallListener call = new CallListener(); // 방법1
		button.setOnclickListener(call);	// 방법1
		button.touch();
		
		button.setOnclickListener(new MessageListener());	// 방법2
		button.touch();
		
		// 익명 클래스 만들기
		button.setOnclickListener(new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				
				System.out.println("사진을 찍습니다.");
				
			}
			
		});
		button.touch();
	}
}
