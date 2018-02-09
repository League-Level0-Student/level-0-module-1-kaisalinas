import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0; 
	String pizza = JOptionPane.showInputDialog("There is a tiny ship on a big ship. You are on the tiny ship and there are 40 people. How come you see 44 heads.");
	if (pizza.equals("They see 40 foreheads")) {
		JOptionPane.showMessageDialog(null, "correct!!!");
		score = score + 1;
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong!!!! The answer is they see 40 foreheads");
}
}
}