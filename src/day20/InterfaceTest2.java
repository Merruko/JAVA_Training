package day20;
// 인터페이스를 이용하여 사칙연산 구현

interface ICalc {
	
	public abstract int numAdd();
	public int numMin();
	public int numMul();
	public int numDiv();
	
}

class Cals implements ICalc {
	
	private int x;
	private int y;
	
	public Cals (int x, int y) {

		super();
		this.x = x;
		this.y = y;
	
	}

	@Override
	public int numAdd() {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int numMin() {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int numMul() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int numDiv() {
		// TODO Auto-generated method stub
		return x/y;
	}
	
	
	
}
public interface InterfaceTest2 {
	
	public static void main(String[] args) {
		
		ICalc cal = new Cals(5,3);
		
		System.out.println(cal.numAdd());
		System.out.println(cal.numMin());
		System.out.println(cal.numMul());
		System.out.println(cal.numDiv());
		
	}

}