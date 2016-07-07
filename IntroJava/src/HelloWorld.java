import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HelloWorld {
	public static void main(String[] args) {

		// System.out.print("hello");
		// JOptionPane.showMessageDialog(null, "hello");
		JOptionPane.showInputDialog("hello");
		
		
		
		Robot jeff = new Robot();
		Robot tim = new Robot();
		int i = 1;
		int o = 1;
		
		jeff.setSpeed(3);
		tim.setSpeed(3);
		jeff.penDown();
		tim.penDown();
		
		while(i < 5){
		jeff.move(100);
		jeff.turn(90);
		i++;
		}
		tim.turn(180);
		while(o < 5){
		tim.move(100);	
		tim.turn(90);
		o++;
		}
		
		

	}
}
