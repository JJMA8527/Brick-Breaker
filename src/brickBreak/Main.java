package brickBreak;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// creates a interactive window
		JFrame obj = new JFrame();
		/*create a object using new keyword.
		 * invoke default constructor
		 */
		Gameplay game = new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game); //add object to jframe
		

	}

}
