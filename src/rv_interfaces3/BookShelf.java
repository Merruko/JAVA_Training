package rv_interfaces3;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);			// 맨 뒤에서 추가
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);		// 맨 앞 항목 삭제
	}

	@Override
	public int getSize() {
		return getCount();	// 자료의 개수
	}

}