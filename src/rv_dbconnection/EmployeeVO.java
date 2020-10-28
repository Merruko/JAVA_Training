package rv_dbconnection;

import java.util.Date;

public class EmployeeVO {
	private int companyID;
	private String name;
	private Date joinDate;
	
	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public EmployeeVO() {
	}
	
}
	