package boot.example.j2se.swing;

import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarExample {
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		JMenuItem home = new JMenuItem("Home");
		JMenuItem gallery = new JMenuItem("Gallery");
		JMenuItem products = new JMenuItem("Products");
		JMenuItem purcahse = new JMenuItem("Purchase");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem finance = new JMenuItem("Finance");
		JMenuItem consultation = new JMenuItem("Consultation");
		JMenuItem contact = new JMenuItem("Contact");
		
		JMenu services = new JMenu("Services");
		services.add(purcahse);
		services.add(sales);
		services.add(finance);
		services.add(consultation);
		
		JMenuBar menubar = new JMenuBar();
		menubar.setLayout(new FlowLayout	(0));
		menubar.add(home);
		menubar.add(gallery);
		menubar.add(products);
		menubar.add(services);
		menubar.add(contact);
		
		frame.setJMenuBar(menubar);
		
		frame.setVisible(true);
	}

}
