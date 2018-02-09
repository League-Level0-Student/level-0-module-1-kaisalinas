import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String pizza = JOptionPane.showInputDialog(null,"When is your birthday");
	if (pizza.equals ("2/8")){
	JOptionPane.showMessageDialog(null, "Happy Birthday");	
		}
	if(!pizza.equals("2/8")) {
		JOptionPane.showMessageDialog(null,"Happy Unbirthday" );
	}

}
}
