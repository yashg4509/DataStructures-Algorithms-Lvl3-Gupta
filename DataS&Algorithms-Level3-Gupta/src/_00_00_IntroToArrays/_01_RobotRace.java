package _00_00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random r = new Random();
		// 2. create an array of 5 robots.
		Robot[] arr = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Robot();
			arr[i].setSpeed(11);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < arr.length; i++) {
			arr[i].setX(850);
			arr[i].setY(550);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean atTop = false;
		while (atTop == false) {
			for (int i = 0; i < arr.length; i++) {
				arr[i].move(r.nextInt(50));

				if (arr[i].getY() < 0) {
					atTop = true;
					JOptionPane.showMessageDialog(null, "Congrats Robot #" + i + " is the winner!");
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		for (int i = 0; i < arr.length; i++) {
			arr[i].setX(300);
			arr[i].setY(300);
		}

		boolean isRacing = true;
		while (isRacing) {
			for (int j = 0; j < arr.length; j++) {
				int robotDiff = r.nextInt(2) + 1;
				arr[j].turn(robotDiff);
				arr[j].move(robotDiff);

				if ((arr[j].getX() == 300) && (arr[j].getY() == 300)) {
					isRacing = false;
					JOptionPane.showMessageDialog(null, "Congrats Robot #" + j + " is the winner!");
					break;
				}
			}
		}
	}
}
