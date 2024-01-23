package jdbcSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		//드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		//연결
		Connection conn = DriverManager.getConnection(url,id,pass);
		//생성자
		Statement stmt = conn.createStatement();
		String sql = "select * from emp"; // sql을 문자열로 만드는 명령어
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt("empno")+",\t");
			System.out.print(rs.getString("ename")+",\t");
			System.out.println(rs.getDouble("sal")+",\t");
		}
		
	}

}
