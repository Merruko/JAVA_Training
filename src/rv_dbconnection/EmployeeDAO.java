package rv_dbconnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO {
	
	private static final String driver = 
			"oracle.jdbc.driver.OracleDriver";
	private static final String url = 
			"jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = 
			"hr";
	private static final String pwd = 
			"1234";
	
	Connection conn = null;	// DB접속하기 위한 클래스
	PreparedStatement pstmt = null;		// 동적 sql 객체
	ResultSet rs = null; 			// 검색을 위한 클래스(반환자료)
	
	// 접속 메서드
	public void connDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 객체 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 사원 추가
	public void addEmployee(EmployeeVO employee) {
		connDB();
		String query1 = 
				"INSERT INTO employee (companyID, name, joinDate) VALUES (?, ?, SYSDATE)";
		try {
			pstmt = conn.prepareStatement(query1);
			pstmt.setInt(1, employee.getCompanyID());
			pstmt.setString(2, employee.getName());
			pstmt.executeUpdate();		// sysdate는 설정하지 않음.
		
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 사원 조회
	public ArrayList<EmployeeVO> getListAll() {
		connDB();
		ArrayList<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		String query2 = "SELECT * FROM employee ORDER BY companyID";
		try {
			pstmt = conn.prepareStatement(query2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("companyID");
				String name = rs.getString("name");
				Date date = rs.getDate("joinDate");
				
				EmployeeVO employee = new EmployeeVO();
				employee.setCompanyID(id);
				employee.setName(name);
				employee.setJoinDate(date);
				
				empList.add(employee);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}
	
}