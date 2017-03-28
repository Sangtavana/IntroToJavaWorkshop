package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Sangtavana= new Robot();
Sangtavana.penDown();
int sides = 34;
Sangtavana.setPenColor(Color.cyan);
for (int i = 0; i < 8; i++) {
		Sangtavana.move(100);
		Sangtavana.turn(360/8);
		
	}

	
	
	}
}
