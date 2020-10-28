package day26;

interface IMmessage {
	public void msgPring();		// 필수기능 추상메서드 정의
}

class Message implements IMmessage {

	@Override
	public void msgPring() {
		System.out.println("Message 클래스");
		
	}
}

public class AnomymousTest {

	public static void main(String[] args) {
		// 익명 클래스, anonymous class
		// - 이름이 없는 클래스 -> 생성자를 갖을 수 없음
		// - 일시적으로 한번만 사용하고 버려지는 객체를 사용할 때 유용함
		// - 이벤트 구현시 사용
		// 1)
		Message mess = new Message();
		mess.msgPring();
		// 2) 다형성
		IMmessage msg = new Message();
		msg.msgPring();
		// 3) 익명클래스
		// - 인터페이스와 추상클래스는 new 객체생성이 불가능하지만,
		//   추상메소드를 오버라이드하면
		//	  일시적으로 new 객체생성을 할 수 있다. (익명클래스)
		IMmessage message = new IMmessage() {

			@Override
			public void msgPring() {
				System.out.println("anomymous 익명 내부 클래스");
				
			}
			
		};
		
		message.msgPring();

	}
	

}