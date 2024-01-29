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

public class WinEmp2 extends JFrame {

    JTextField tf1 = new JTextField(5);
    JTextField tf2 = new JTextField(5);
    JTextField tf3 = new JTextField(5);
    JTextField tf4 = new JTextField(5);
    JTextField tf5 = new JTextField(5);
    JTextField tf6 = new JTextField(5);
    JTextField tf7 = new JTextField(5);
    JTextField tf8 = new JTextField(5);

    JButton bt1 = new JButton("전체 내용");
    JButton bt2 = new JButton("입력");
    JButton bt3 = new JButton("이름 검색");
    JButton bt4 = new JButton("내용 수정");
    JButton bt5 = new JButton("데이터 삭제");

    JTextArea ta = new JTextArea(10, 60);
    Connection conn;
    Statement stmt;

    public WinEmp2() {
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
        JLabel lb4 = new JLabel("입사일:"); // 상사번호 대신 입사일로 변경
        JLabel lb5 = new JLabel("급여:");
        JLabel lb6 = new JLabel("커미션:");
        JLabel lb7 = new JLabel("부서번호:");

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
        jp3.add(lb4);
        jp3.add(tf4);
        jp3.add(lb5);
        jp3.add(tf5);
        jp3.add(lb6);
        jp3.add(tf6);
        jp3.add(lb7);
        jp3.add(tf7);
        jp3.add(tf8); // 상사번호 필드 삭제

        this.setTitle("EMP 관리");
        this.setLocation(500, 400);
        this.setSize(700, 300);
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

        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
                clearTextField();
                select();
            }
        });

        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
                clearTextField();
                select();
            }
        });
    }

    private void clearTextField() {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        tf7.setText("");
        tf8.setText("");
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
                String hiredate = rs.getString("hiredate");
                double sal = rs.getDouble("sal");
                String comm = rs.getString("comm");
                int deptno = rs.getInt("deptno");

                String str = String.format("%d, %s, %s, %s, %.2f, %s, %d\n", empno, ename, job, hiredate, sal, comm, deptno);
                ta.append(str);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert() {
        int empno = Integer.parseInt(tf1.getText());
        String ename = tf2.getText();
        String job = tf3.getText();
        String hiredate = tf4.getText();
        double sal = Double.parseDouble(tf5.getText());
        String comm = tf6.getText();
        int deptno = Integer.parseInt(tf7.getText());

        String sql = String.format("insert into emp values(%d, '%s', '%s', null, '%s', %.2f, '%s', %d)",
                empno, ename, job, hiredate, sal, comm, deptno);

        try {
            int res = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select2() {
        String sql = String.format("select * from emp where ename = '%s'", tf2.getText());
        try {
            ResultSet rs = stmt.executeQuery(sql);
            ta.setText("");
            if (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String hiredate = rs.getString("hiredate");
                double sal = rs.getDouble("sal");
                String comm = rs.getString("comm");
                int deptno = rs.getInt("deptno");

                String str = String.format("%d, %s, %s, %s, %.2f, %s, %d\n", empno, ename, job, hiredate, sal, comm, deptno);
                ta.append(str);

                tf1.setText(String.valueOf(empno));
                tf3.setText(job);
                tf4.setText(hiredate);
                tf5.setText(String.valueOf(sal));
                tf6.setText(comm);
                tf7.setText(String.valueOf(deptno));
            } else {
                clearTextField();
                ta.append("해당 자료 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void update() {
        String sql = String.format("update emp set ename = '%s', job = '%s', hiredate = '%s', sal = %.2f, comm = '%s', deptno = %s where empno = %s",
                tf2.getText(), tf3.getText(), tf4.getText(), Double.parseDouble(tf5.getText()), tf6.getText(), tf7.getText(), tf1.getText());
        try {
            int res = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void delete() {
        String sql = String.format("delete from emp where empno = %s", tf1.getText());
        try {
            int res = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new WinEmp2();
    }
}
