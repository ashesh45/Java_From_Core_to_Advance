package boot.example.j2se.swing;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Inventory Management System");
		//frame.setTitle("Inventory Management System");
		//frame.setSize(800, 500);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		frame.setBounds(250, 100, 800, 500);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}

}
