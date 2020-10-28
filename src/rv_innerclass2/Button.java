package rv_innerclass2;

public class Button {
	
	OnclickListener listener;

	interface OnclickListener {		// 내부 인터페이스
		
		void onClick();
		
	}
	
	void setOnclickListener(OnclickListener listener) {
		
		this.listener = listener;
		
	}
	
	void touch() {
		
		listener.onClick();
		
	}
}
