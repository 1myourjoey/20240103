package swing.ver1;

import java.awt.Container;

import javax.swing.JFrame;

public class MyWin extends JFrame {

	public MyWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		this.setSize(400,300);
		this.setLocation(700,400);
		this.setVisible(true);
		this.setTitle("자바 스윙ver1");
	
	}
	
	public static void main(String[] args) {
		new MyWin();
	

	}

}
