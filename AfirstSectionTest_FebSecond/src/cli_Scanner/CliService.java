package cli_Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Scanner;

public class CliService {
	void methodEveryone() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.printf("%-5s / %-10s / %-10s / %-5s / %-10s / %-10.2f / %-5s / %-5s%n", rs.getInt("empno"),
						rs.getString("ename"), rs.getString("job"), rs.getString("mgr"), rs.getString("hiredate"),
						rs.getDouble("sal"), rs.getString("comm"), rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
	}

	void methodSelect(String ename) {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp where ename = '" + ename + "'";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.printf("%-5s / %-10s / %-10s / %-5s / %-10s / %-10.2f / %-5s / %-5s%n", rs.getInt("empno"),
						rs.getString("ename"), rs.getString("job"), rs.getString("mgr"), rs.getString("hiredate"),
						rs.getDouble("sal"), rs.getString("comm"), rs.getInt("deptno"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
	}

	void methodInsert(int empno, String ename, int deptno) {
		
			
		}
	

	void methodDelete(int empno) {
	    String url = "jdbc:mysql://localhost:3306/firm";
	    String id = "root";
	    String pass = "mysql";
	    String sql = "delete from emp where empno = '" + empno + "'";
	    Connection conn = null;
	    Statement stmt = null;

	    try {
	        conn = DriverManager.getConnection(url, id, pass);
	        stmt = conn.createStatement();
	        int result = stmt.executeUpdate(sql);
	        if (result >= 1) {
	            System.out.println("삭제 성공: " + result + "행이 삭제되었습니다.");
	        } else {
	            System.out.println("삭제된 행이 없습니다.");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        if (stmt != null) {
	            try {
	                stmt.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        if (conn != null) {
	            try {
	                conn.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	void methodUpdate() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Scanner scan = new Scanner(System.in);
		System.out.print("부서번호:");
		int deptno = Integer.parseInt(scan.nextLine());
		System.out.print("부서이름:");
		String dname = scan.nextLine();
		System.out.print("부서위치:");
		String loc = scan.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		String sql = "update dept set dname = '" + dname + "', loc = '" + loc + "' where deptno = " + deptno;
		System.out.println(sql);
		int result = stmt.executeUpdate(sql);
		if (result == 1) {
			System.out.println("수정 성공!");
		} else {
			System.out.println("수정 실패!");
		}

	}


	public static void main(String[] ar) {
		Scanner scan = new Scanner(System.in);
		int num;
		CliService cl = new CliService();

		while (true) {
			System.out.println("선택할 메뉴 번호를 입력하시오.");
			System.out.println("1. 전체 회원 출력|2. 특정 회원 출력 | 3. 회원 추가 | 4. 회원 삭제 | 5. 회원 정보 수정 | 6. 종료");
			num = Integer.parseInt(scan.nextLine());
			switch (num) {

			case 1:
				cl.methodEveryone();
				break;

			case 2:
				System.out.println("이름을 입력하세요,");
				String ename = scan.nextLine();
				cl.methodSelect(ename);
				break;

			case 3:
				System.out.println("회원 삽입");
				System.out.println("새로운 회원을 사번을 입력하시오.");
				
				break;
			case 4:
				System.out.println("회원 삭제");
				System.out.println("삭제할 사번을 입력하시오.");
			
				int empno = Integer.parseInt(scan.nextLine());
				cl.methodDelete(empno);
				break;
			case 5:
				System.out.println("회원 정보 수정");
				try {
					cl.methodUpdate();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 6:
				System.out.println("종료합니다.");
				return;

			}

		}

	}

}