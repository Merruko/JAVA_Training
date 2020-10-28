package day17;

class  Mobile {
	
	  public int time;
	  private String MobileName;
	  private int BatterySize;
	  private String OsType;
	  
	  
	  public void setMobileName (String MobileName) {
		  
		  this.MobileName = MobileName;
		  
	  }
	  
	  public void setBatterySize (int BatterySize) {
		  
		  this.BatterySize = BatterySize;
		  
	  }
	  
	  public void setOsType (String OsType) {
		  
		  this.OsType = OsType;
		  
	  }
	  
	  public String getMobileName () {
		  
		  return MobileName;
		  
	  }
	  
	  public int getBatterySize () {
		  
		  return BatterySize;
		  
	  }
	  
	  public String getOsType () {
		  
		  return OsType;
		  
	  }
	  
	  public int operate (int time) {
		  
		  return BatterySize = BatterySize - time*12;
		  
	  }
	  
	  public int charge (int time) {
		 
		  return BatterySize = BatterySize + time*8;
		  
	  }
	  
	  public void showInfo () {
			 
		  System.out.println("Mobile   Battery  OS \n---------------------------------------------\n" + MobileName + BatterySize + OsType + "\n---------------------------------------------\n");
		  
	  }
	  
	
}



public class MobileTest {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		mobile.setMobileName("Myphone ");
		mobile.setBatterySize(1000);
		mobile.setOsType(" AND-12");
		mobile.showInfo();
		
		mobile.charge(10);
		mobile.showInfo();
		mobile.operate(5);
		mobile.showInfo();
		
	
	}
}