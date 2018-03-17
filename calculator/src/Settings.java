import javax.swing.JFrame;

public class Settings {
	public static void main(String args[]) {
		FirstCalculator fc = new FirstCalculator("Stinky");
		fc.setVisible(true);
		fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fc.setSize(200, 210);
		fc.setResizable(false);
		fc.setLocationRelativeTo(null);		
	}

}
