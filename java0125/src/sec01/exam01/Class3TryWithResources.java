package sec01.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class3TryWithResources {
	
	void method() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;

		try ( // close 해줘야하는 애들을 여기 넣어주는 것
			// finally를 안쓰고 알아서 닫힌다는 것
				// 대신 지역변수로 try catch 구문 안에서만 사용됨-단점
				Connection conn = DriverManager.getConnection(url, id, pass);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				){					
			while (rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] ar) {
		Class3TryWithResources cl = new Class3TryWithResources ();
		cl.method();
		// 두번쨰론 메소드에 static 붙이고 method();으로 그냥 호출 시키는 법
		
			
		
	}

}