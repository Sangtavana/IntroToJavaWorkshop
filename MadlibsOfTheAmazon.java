package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String Input= JOptionPane.showInputDialog("Enter a adjective");
		// Get the user to enter a type of liquid
String Input1= JOptionPane.showInputDialog ("Enter a type of liquid");
		// Get the user to enter a body part
String Input2= JOptionPane.showInputDialog ("Enter a body part");
		// Get the user to enter a verb
String Input3= JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
String Input4= JOptionPane.showInputDialog ("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		String Story=" Piranhas are more " +Input +  " during the day, so cross the river at\n"+
		"night. Piranhas are attracted to fresh " + Input1+ " and will most\n"+
		 "likely take a bite out of your " + Input2+" if you "+Input3+ " .Whatever\n"+
		"you do, if you have an open wound, try to find another way to get\n"+
		" back to the " + Input4+ ". Good luck!";
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, Story);

	}
}

