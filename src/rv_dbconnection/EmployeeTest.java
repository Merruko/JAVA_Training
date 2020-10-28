package rv_dbconnection;

import java.util.ArrayList;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		EmployeeVO park = new EmployeeVO();
		park.setCompanyID(3003);
		park.setName("박인비");
		
		EmployeeDAO dao = new EmployeeDAO();
		dao.addEmployee(park);
		
		ArrayList<EmployeeVO> list = dao.getListAll();
		for(int i = 0; i < list.size(); i++) {
			EmployeeVO vo = list.get(i);
			System.out.println("사번 : " + vo.getCompanyID());
			System.out.println("이름 : " + vo.getName());
			System.out.println("가입일 : " + vo.getJoinDate());
		}
		
	}

}
