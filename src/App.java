import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World");
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				new MainFrame();
			}
			
		});
		

	}

}
