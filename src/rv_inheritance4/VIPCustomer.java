package rv_inheritance4;

public class VIPCustomer extends Customer{
		
		private int agentID;
		double saleRatio;
		
		// 기본생성자
		public VIPCustomer() {
			super();
			customerGrade = "VIP";
			bonusRatio = 0.05;		// 보너스 적립율 0.05
			saleRatio = 0.1;		// 구매할인율 10%
		}
		
		// 매개변수가 있는 생성자
		public VIPCustomer(int customerID, String customerName, int agentID) {
			super(customerID, customerName);
			this.agentID = agentID;
			customerGrade = "VIP";
			bonusRatio = 0.05;		// 보너스 적립율 0.05
			saleRatio = 0.1;		// 구매할인율 10%
		}
		
		public int getAgentID() {
			return agentID;
		}

		public void setAgentID(int agentID) {
			this.agentID = agentID;
		}

		@Override
		public int calcPrice(int price) {
			bonusPoint += price*bonusRatio;
			return price - (int)(price*saleRatio);		// 강제형변환
		}

		@Override
		public String showInfo() {
			return super.showInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
		}
		
}
