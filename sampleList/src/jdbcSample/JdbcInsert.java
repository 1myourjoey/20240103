package jdbcSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

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
		String sql = "insert into emp values (7777, '아무개','사원',7899,'2024-01-2',3000,null,10)"; // sql을 문자열로 만드는 명령어
		int result = stmt.executeUpdate(sql);
		if (result == 1) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
	}

}
