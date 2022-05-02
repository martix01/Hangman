import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MainViewHangman extends JFrame{
	
	private JPanel mainPanel;
	private JPanel centerPanel;
	private JPanel southPanel;

	
	public MainViewHangman() {
		
		this.setTitle("Hangman");
		this.setBounds(300, 200, 800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		

		this.setMainPanel(new JPanel());
		this.setCenterPanel(new JPanel());
		this.setSouthPanel(new JPanel());
		
		
		
		
		
		this.setContentPane(this.getMainPanel());
		this.setVisible(true);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public JPanel getMainPanel() {
		return mainPanel;
	}


	public void setMainPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
	}


	public JPanel getCenterPanel() {
		return centerPanel;
	}


	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}


	public JPanel getSouthPanel() {
		return southPanel;
	}


	public void setSouthPanel(JPanel southPanel) {
		this.southPanel = southPanel;
	}
	
	
}
