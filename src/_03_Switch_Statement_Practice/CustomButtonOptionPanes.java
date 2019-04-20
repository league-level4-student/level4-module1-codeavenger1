package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
	switch(choice) {
	case "Sunday":
		JOptionPane.showMessageDialog(null, "Finish your homework.");
	break;
	case "Monday":
		JOptionPane.showMessageDialog(null, "Do your chores and finish your homework.");
	break;
	case "Tuesday":
		JOptionPane.showMessageDialog(null, "Do your homework and go to extracurriculars.");
	break;
	case "Wednesday":
		JOptionPane.showMessageDialog(null, "Do your chores.");
	break;
	case "Thursday":
		JOptionPane.showMessageDialog(null, "Do your homework and go to extracurriculars.");
		break;
	case "Friday":
		JOptionPane.showMessageDialog(null, "Do something fun.");
	break;
	case "Saturday":
		JOptionPane.showMessageDialog(null, "Do some more fun things.");
	}
	}
}
