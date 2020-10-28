package rv_interfaces3;

public interface Queue {
	
	void enQueue(String title);		// 자료 추가 - 맨 마지막에 추가
	String deQueue();				// 자료 꺼내는 기능 - 맨 앞의 항목
	int getSize();				// 자료의 개수 반환
	
}
