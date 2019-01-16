import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	
	
	public MainFrame() {
		super("Hello World");
		
/// testcommentaar
		
//testcommentaar2
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Click me");
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
