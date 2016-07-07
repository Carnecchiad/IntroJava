package day_2;

import javax.swing.JOptionPane;

public class Quiz {
	static int score = 0;

	public static void main(String[] args) {

		String ans1 = JOptionPane.showInputDialog("how many sides does a nonagon have?");
		int answer1 = Integer.parseInt(ans1);
		if (answer1 == 9) {
			score++;
		}

		String ans2 = JOptionPane.showInputDialog("What year did Columbus discover America?");
		int answer2 = Integer.parseInt(ans2);
		if (answer2 == 1492)
			score++;

		String ans3 = JOptionPane.showInputDialog("Where is the Rosetta Stone");

		if (ans3.equalsIgnoreCase("The British Museum")) {
			score++;
		}
		JOptionPane.showMessageDialog(null, "Your score was " + score + "/3!");
	}
}
