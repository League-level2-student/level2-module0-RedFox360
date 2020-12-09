package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main(String[] args) {
	//1. make a main method

	//2. create an array of 5 robots.
		Robot[] r = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot("mini");
			r[i].setY(450);
			r[i].setX(i * 100);
			r[i].setSpeed(15);
		}

		r[0].setWindowSize(500, 500);
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		boolean repeat = true;
		while(repeat) {
		for (int i = 0; i < r.length; i++) {
			r[i].move(new Random().nextInt(50));
			if(r[i].getY()<=0) {
				repeat = false;
				int robotNumber = i+1;
				JOptionPane.showMessageDialog(null, "Robot number " + robotNumber + " won the race!");
			}
		}
		} 
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
	//7. declare that robot the winner and throw it a party!
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
