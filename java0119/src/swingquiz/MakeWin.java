package swingquiz;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MakeWin extends JFrame implements ActionListener{
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	
	JLabel lb1 = new JLabel("이름");
	JLabel lb2 = new JLabel("아이디");
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();

	public MakeWin () {
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(600, 300);
		this.setLocation(650, 300);
		this.setTitle("Today's Quiz");
		
		
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);
		
		
		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);
		
		
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		
		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);
		
		
		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);
		jb1.addActionListener(this);
		
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);
		jb2.addActionListener(this);
	}
	public static void main(String []args) {
		new MakeWin();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jb1) {
			System.out.println("전체내용");
		}else if (e.getSource()==jb2) {
			System.out.println("입력");
		}
		
		
	}
	
}