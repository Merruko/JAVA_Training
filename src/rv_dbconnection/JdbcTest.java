package rv_dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private static final String driver = 
			"oracle.jdbc.driver.OracleDriver";
	private static final String url = 
			"jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = 
			"hr";
	private static final String pwd = 
			"1234";
	
	public static void main(String[] args) {
		Connection conn = null;	// DB접속하기 위한 클래스
		Statement stmt = null;		// sql 하기 위한 클래스
		ResultSet rs = null; 			// 검색을 위한 클래스(반환자료)
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection 객체 생성 성공!");
			
			// 자료 추가
			String query1 = "INSERT INTO employee VALUES (2001, 'Bill', SYSDATE)";
			System.out.println("query1");		// 기록
			stmt = conn.createStatement();
			stmt.executeUpdate(query1);
			
			// 자료 검색
			String query2 = 
					"SELECT * FROM employee ORDER BY companyID";
			System.out.println(query2);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query2);
			while(rs.next()) {
				System.out.println("사번 : " + rs.getInt("companyID"));		// int형 변환
				System.out.println("이름 : " + rs.getString("name"));			// String형 변환
				System.out.println("가입일 : " + rs.getDate("joinDate"));		// Date형 변환
			}
			
			rs.close();
			stmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}