package jdbcSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExDelete {

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
		String sql = "delete from emp where empno = 7777"; // sql을 문자열로 만드는 명령어
		int result = stmt.executeUpdate(sql);
		if (result >= 1) {
			System.out.println("삭제 성공"+result);
		} else {
			System.out.println("삭제 값"+result);
		}
	}

}
