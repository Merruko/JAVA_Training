package day19;
// abstract : �߻�
abstract class Parent {     // �߻� Ŭ����
	
	String name = "�θ�";
	abstract void disp();	// �߻� �޼ҵ�
	void line() {}			// �Ϲ� �޼ҵ�
}

class Son extends Parent {

	@Override
	void disp() {
		System.out.println("�Ƶ��Դϴ�.");
	}
}
class Daughter extends Parent {
	
	@Override
	void disp() {
		System.out.println("���Դϴ�.");
	}
	
}

public class AbstractTest {

	// ���� : 281page
	// �߻� Ŭ����
	
	public static void main(String[] args) {
		
		// Parent papa = new Parent();  // ����. �߻�Ŭ������ ��ü ���� �Ұ���
		Son son = new Son();
		son.disp();
		Daughter daugu = new Daughter();
		daugu.disp();
		// ������
		Parent pa = new Son();
		pa.disp();
		pa = new Daughter();
		pa.disp();
	
	}
	
}