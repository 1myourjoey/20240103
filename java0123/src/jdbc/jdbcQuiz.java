package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class jdbcQuiz {
    static String ename;
    static int empno;
    static double sal;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<Employee> employeeList = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/firm";
        String id = "root";
        String pass = "mysql";
        
        // 드라이버 로드
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 연결
        Connection conn = DriverManager.getConnection(url, id, pass);
        
        // 생성자
        Statement stmt = conn.createStatement();
        String sql = "select * from emp"; // SQL을 문자열로 만드는 명령어
        
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            empno = rs.getInt("empno");
            ename = rs.getString("ename");
            sal = rs.getDouble("sal");

            Employee employee = new Employee(empno, ename, sal);
            employeeList.add(employee);
        }
        
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    static class Employee {
        private int empno;
        private String ename;
        private double sal;

        public Employee(int empno, String ename, double sal) {
            this.empno = empno;
            this.ename = ename;
            this.sal = sal;
        }

        @Override
        public String toString() {
            return "Employee [ename=" + ename + ", empno=" + empno + ", sal=" + sal + "]";
        }
    }
}
