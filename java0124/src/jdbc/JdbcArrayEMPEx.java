package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Emp {
	private int empno;
	private String ename;
	private String job;
	private int sal;
	public Emp(int empno, String ename, String job, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	

}

public class JdbcArrayEMPEx {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>	();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String sql = "select empno, ename, job, sal from emp";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				int deptno = rs.getInt(1); // 뒤 숫자는 위 sql의 셀렉트 문에서 자리값 순서
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
//				System.out.println(deptno+", "+loc+", "+dname);
//				String str =deptno+", "+loc+", "+dname;
				Emp emp = new Emp(empno, ename, job, sal);
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			for (Emp file : list ) {
				System.out.println
				(file.getEmpno()+"\t"
				+file.getEname()+"\t"
				+file.getJob()+"\t"
				+file.getSal());
				
				// select문 먼저 생각
				
				
			}
	}

}
