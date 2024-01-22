package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/company";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 로딩");
	
		Connection conn = DriverManager.getConnection(url,id,pass);
		System.out.println("접속 성공");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		while (rs.next()) {
			
			String ename = rs.getString("ename");
			double sal = rs.getDouble("sal");
			String job = rs.getString("job");
			System.out.printf("%s, %.2f, %s\n",ename,sal,job);
		}
		
		conn.close();
	}
	
	

}
