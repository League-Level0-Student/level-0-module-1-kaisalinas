import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String a = "pizza";
	String b = JOptionPane.showInputDialog("Gimme a secret message");
	JOptionPane.showInputDialog("What is the passcode");
	if (a.equals("bob")) {
		JOptionPane.showMessageDialog(null, b);
	}
	else {
		JOptionPane.showMessageDialog(null, "Intruder!!");
	}
	}
}

