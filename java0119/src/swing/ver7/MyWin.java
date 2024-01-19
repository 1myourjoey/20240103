package swing.ver7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWin extends JFrame {

	JLabel lb1 = new JLabel("이름");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("버튼");

	JLabel lb2 = new JLabel("이름2");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("버튼2");

	JButton bt3 = new JButton("종료");
	JLabel lbState = new JLabel("메세지를 보여줍니다.");
	JTextArea ta = new JTextArea(5,10);
	
	public MyWin() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		con.add(bt3);
		con.add(lbState);
		
		JScrollPane scroll = new JScrollPane(ta);
//		scroll.setSize(100,20);
		con.add(scroll);
		
		this.setTitle("자바 스윙ver1");
		this.setSize(400, 300);
		this.setLocation(700, 400);
		this.setVisible(true);
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				lbState.setText("lbState을 눌렀다");
			}
		});
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2");
			}
		});
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();

			}
		});
		//파일읽기 작업 처리
		
		JOptionPane.showMessageDialog(this, "파일을 읽었다.","파일읽기", JOptionPane.INFORMATION_MESSAGE);
		
	}

	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?","confirm",JOptionPane.YES_NO_OPTION);
		if(answer == JOptionPane.YES_OPTION) {
			System.out.println("프로그램 종료");
			//파일로 객체를 보내는 일
			System.exit(0);
		} else {
			System.out.println("종료를 취소합니다.");
		}
	
	}
	public static void main(String[] args) {
		new MyWin();

	}

}
