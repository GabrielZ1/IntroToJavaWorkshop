package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot robby= new Robot();
robby.penDown();
robby.setSpeed(7);
robby.move(190);
robby.turn(90);
robby.setRandomPenColor();
robby.sparkle();
robby.move(500);
robby.setRandomPenColor();
robby.turn(810);
robby.move(500);
robby.turn(90);


	}
}
