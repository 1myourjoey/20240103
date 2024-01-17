package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameEx extends JFrame{
	public FrameEx () {
	Container con = this.getContentPane();
	con.setLayout(null);
	JButton jb1 = new JButton("버튼")	;
	jb1.setLocation(20,20);
	jb1.setSize(100, 30);
	con.add(jb1);
	
	JLabel jb2 = new JLabel("버튼");
	con.add(jb2);
	jb2.setLocation(120,20);
	jb2.setSize(100, 30);
	
	JTextField jt1 = new JTextField("버튼");
	con.add(jt1);
	jt1.setLocation(120,20);
	jt1.setSize(100, 30);
	
	
	this.setLocation(500, 500);
	this.setTitle("스윙연습");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(300, 300);
	this.setVisible(true);
}

	public static void main(String[] args) {
		new FrameEx();

	}

}
