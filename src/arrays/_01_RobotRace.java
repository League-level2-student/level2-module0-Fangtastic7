package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean winner = false;
	// 1. make a main method
	public static void main(String[] args) {
		
		
	// 2. create an array of 5 robots.
		
		Robot[] array = new Robot[5];
	// 3. use a for loop to initialize the robots.
		for(int i=0;i<array.length;i++) {
			array[i]= new Robot();
			array[i].setY(500);
			
			array[i].setRandomPenColor();
			array[i].setSpeed(100);
			
		}
	// 4. make each robot start at the bottom of the screen, side by side, facing up
		int store =0;
		for(Robot rob:array) {
			rob.setX(50+ store);
			store = store + 150;
		}
		
	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.
		//for(int x=0;x<array.length;x++) {
		//	int random = new Random().nextInt(50);
		//}
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.
		
		while(!winner) {
			int robotcounter =0;
			for(Robot robot: array) {
				
			robotcounter += 1;
			robot.move(new Random().nextInt(50));
			
			if(robot.getY()<=0) {
				winner=true;		
				System.out.println(robotcounter + " wins!");
				break;
			}
			}
		}
		
	// 7. declare that robot the winner and throw it a party!
		
		for(Robot bob: array) {
			bob.sparkle();
			
		}
	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
			
	}
}
