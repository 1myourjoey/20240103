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

	void methodInsert(int empno, String ename,String job, int deptno) {
		String url = "jdbc:mysql://localhost:3306/firm";
	    String id = "root";
	    String pass = "mysql";
	    
	    Connection conn = null;
	    Statement stmt = null;

	    try {
	        conn = DriverManager.getConnection(url, id, pass);
	        stmt = conn.createStatement();

	        String sql = "INSERT INTO emp (empno, ename, job, deptno) VALUES (" + empno + ", '" + ename + "', '" + job + "', " + deptno + ")";

	        int result = stmt.executeUpdate(sql);

	        if (result == 1) {
	            System.out.println("추가 성공!");
	        } else {
	            System.out.println("추가 실패!");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (stmt != null) {
	                stmt.close();
	            }
	            if (conn != null) {
	                conn.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
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

	void methodUpdate(int empno, String ename, String job) {
	    String url = "jdbc:mysql://localhost:3306/firm";
	    String id = "root";
	    String pass = "mysql";
	    Connection conn = null;
	    Statement stmt = null;

	    try {
	        conn = DriverManager.getConnection(url, id, pass);
	        stmt = conn.createStatement();

	        String sql = "UPDATE emp SET ename = '" + ename + "', job = '" + job + "' WHERE empno = " + empno;

	        int result = stmt.executeUpdate(sql);

	        if (result == 1) {
	            System.out.println("수정 성공!");
	        } else {
	            System.out.println("수정 실패 - 해당 사원 번호를 찾을 수 없습니다.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (stmt != null) {
	                stmt.close();
	            }
	            if (conn != null) {
	                conn.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
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
				System.out.print("새로운 회원의 사번을 입력하세요: ");
				int newEmpno = Integer.parseInt(scan.nextLine());
				System.out.print("새로운 회원의 이름을 입력하세요: ");
				String newEname = scan.nextLine();
				System.out.print("새로운 회원의 직위를 입력하세요: ");
				String newJob = scan.nextLine();
				System.out.print("새로운 회원의 부서 번호를 입력하세요: ");
				int newDeptno = Integer.parseInt(scan.nextLine());

				cl.methodInsert(newEmpno, newEname, newJob, newDeptno);
				
				break;
			case 4:
				System.out.println("회원 삭제");
				System.out.println("삭제할 사원의 사번을 입력하시오.");
			
				int empno = Integer.parseInt(scan.nextLine());
				cl.methodDelete(empno);
				break;
	
			case 5:
			    System.out.println("회원 정보 수정");
			    System.out.print("수정할 사원의 사번을 입력하세요: ");
			    int updateEmpno = Integer.parseInt(scan.nextLine());
			    
			    System.out.print("새로운 사원 이름을 입력하세요: ");
			    String updateEname = scan.nextLine();
			    
			    System.out.print("새로운 사원 직무를 입력하세요: ");
			    String updateJob = scan.nextLine();
			    
			    cl.methodUpdate(updateEmpno, updateEname, updateJob);
			    break;

			case 6:
				System.out.println("종료합니다.");
				return;

			}

		}

	}

}