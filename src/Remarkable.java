import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null,"What is your name?");
	if (name.equals("Aidan")) {
		JOptionPane.showMessageDialog(null, "You are kind and smart.");
	}
}
}
