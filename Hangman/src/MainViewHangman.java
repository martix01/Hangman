import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
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
		
		
		this.getMainPanel().setLayout(new BorderLayout());
		this.getSouthPanel().setLayout(new GridLayout(3, 9, 5, 5));
		
		
		String[] buchstaben = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		for (int i = 0; i < buchstaben.length; i++) {
			JButton[] buttons = new JButton[buchstaben.length];
			buttons[i] = new JButton(buchstaben[i]);
			this.getSouthPanel().add(buttons[i]);
		}
	
			
		this.getMainPanel().add(this.getSouthPanel(), BorderLayout.SOUTH);
		

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
