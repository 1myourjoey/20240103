package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Dept {
	private int deptno;
	private String dname;
	private String loc;
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}

public class JdbcArrayEx {

	public static void main(String[] args) {
		List<Dept> list = new ArrayList<>	();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String sql = "select deptno, dname, loc from dept";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				int deptno = rs.getInt(1); // 뒤 숫자는 위 sql의 셀렉트 문에서 자리값 순서
				int deptno = rs.getInt("deptno");
				String loc = rs.getString("loc");
				String dname = rs.getString("dname");
//				System.out.println(deptno+", "+loc+", "+dname);
//				String str =deptno+", "+loc+", "+dname;
				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			for (Dept file : list ) {
				System.out.println
				(file.getDeptno()+"\t"
				+file.getDname()+"\t"
				+file.getLoc());
				
				
				
				
			}
	}

}
