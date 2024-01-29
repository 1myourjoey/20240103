package gui_Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinEmpV3 extends JFrame {

    JTextField tf1 = new JTextField(5);
    JTextField tf2 = new JTextField(5);
    JTextField tf3 = new JTextField(5);

    JButton bt1 = new JButton("전체 내용");
    JButton bt2 = new JButton("입력");
    JButton bt3 = new JButton("이름 검색");
    JButton bt4 = new JButton("수정");
    JButton bt5 = new JButton("삭제");
    JTextArea ta = new JTextArea(10, 40);
    Connection conn;
    Statement stmt;

    public WinEmpV3() {
        String url = "jdbc:mysql://localhost:3306/firm";
        String id = "root";
        String pass = "mysql";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pass);
            stmt = conn.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        JLabel lb1 = new JLabel("사원번호:");
        JLabel lb2 = new JLabel("이름:");
        JLabel lb3 = new JLabel("직무:");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        JPanel jp1 = new JPanel(new FlowLayout());
        jp1.add(bt1);
        jp1.add(bt2);
        jp1.add(bt3);
        jp1.add(bt4);
        jp1.add(bt5);
        con.add(jp1, BorderLayout.SOUTH);
        JScrollPane scroll = new JScrollPane(ta);
        JPanel jp2 = new JPanel(new FlowLayout());
        jp2.add(scroll);
        con.add(jp2, BorderLayout.CENTER);

        JPanel jp3 = new JPanel(new FlowLayout());
        con.add(jp3, BorderLayout.NORTH);
        jp3.add(lb1);
        jp3.add(tf1);
        jp3.add(lb2);
        jp3.add(tf2);
        jp3.add(lb3);
        jp3.add(tf3);

        this.setTitle("EMP 관리");
        this.setLocation(500, 400);
        this.setSize(500, 300);
        this.setVisible(true);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                select();
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insert();
                clearTextField();
                select();
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                select2();
            }
        });
    }

    private void clearTextField() {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
    }

    public void select() {
        String sql = "select * from emp";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            ta.setText("");
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String mgr = rs.getString("mgr");
                String hiredate = rs.getString("hiredate");
                double sal = rs.getDouble("sal");
                String comm = rs.getString("comm");
                int deptno = rs.getInt("deptno");

                String str = String.format("%-5s / %-10s / %-10s / %-5s / %-10s / %-10.2f / %-5s / %-5s%n",
                        empno, ename, job, mgr, hiredate, sal, comm, deptno);

                ta.append(str);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert() {
        String sql = String.format("insert into emp (empno, ename, job) values (%s, '%s', '%s')", tf1.getText(),
                tf2.getText(), tf3.getText());
        try {
            int res = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select2() {
        String sql = String.format("select empno, ename, job from emp where ename = '%s'", tf2.getText());
        try {
            ResultSet rs = stmt.executeQuery(sql);
            ta.setText("");
            if (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String str = String.format("%d, %s, %s\n", empno, ename, job);
                ta.append(str);
                tf1.setText(empno + "");
            } else {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                ta.append("해당 자료 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new WinEmpV3();
    }
}
