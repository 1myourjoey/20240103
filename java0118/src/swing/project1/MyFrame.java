package swing.project1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	static List<Account> list = new ArrayList<>();
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	JButton jb3 = new JButton("조회");
	JButton jb4 = new JButton("수정");
	JButton jb5 = new JButton("삭제");
	
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	JTextField jt6 = new JTextField();
	
	
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		
		JLabel lb1 = new JLabel("이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);
		
		
		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);
		
		JLabel lb2 = new JLabel("아이디");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		
		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);
		
		JLabel lb3 = new JLabel("패스워드");
		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);
		
		
		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);
		
		JLabel lb4 = new JLabel("생년월일");
		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);
		
		
		con.add(jt4);
		jt4.setLocation(680, 50);
		jt4.setSize(100, 30);
		
		JLabel lb5 = new JLabel("전화");
		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);
		
		
		con.add(jt5);
		jt5.setLocation(50, 80);
		jt5.setSize(100, 30);
		
		JLabel lb6 = new JLabel("잔고");
		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);
		
		
		con.add(jt6);
		jt6.setLocation(250, 80);
		jt6.setSize(100, 30);
		
		
		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);
		jb1.addActionListener(this);
		
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);
		jb2.addActionListener(this);
		
		
		jb3.setLocation(380, 350);
		jb3.setSize(100, 30);
		con.add(jb3);
		
		
		jb4.setLocation(560, 350);
		jb4.setSize(100, 30);
		con.add(jb4);
		
		
		jb5.setLocation(740, 350);
		jb5.setSize(100, 30);
		con.add(jb5);
		
		JTextArea ta = new JTextArea();
		ta.setLocation(20, 120);
		ta.setSize(830, 200);
		con.add(ta);
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true);  // 윈도우 프레임을 보이게
		this.setSize(900, 500);  // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String... ar) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource()==jb1) {
//			System.out.println("전체내용");
//		}else if (e.getSource()==jb2) {
//			System.out.println("입력");
//		}
//		System.out.println(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "전체내용":
			System.out.println("전체내용 나오기");
			for (Account account : list) {
				System.out.println(account);
			}
			break;
		case "입력":
			System.out.println("입력실행");
			System.out.printf("%s,%s,%s,%s,%s,%s\n,", 
					jt1.getText(),jt2.getText(),jt3.getText(),
					jt4.getText(),jt5.getText(),jt6.getText());
			list.add(new Account(jt1.getText(),jt2.getText(),jt3.getText(),
					jt4.getText(),jt5.getText(),jt6.getText()));
			
			

		    System.out.println("저장되었습니다.");
			break;
		case "조회":
			
			
			break;
		default :
			break;
		}
		
		
	}
}
