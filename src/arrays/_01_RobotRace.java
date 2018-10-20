package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot bot1 = new Robot();
		Robot bot2 = new Robot();
		Robot bot3 = new Robot();
		Robot bot4 = new Robot();
		Robot bot5 = new Robot();
	
	// 2. create an array of 5 robots.
		Robot[] array = {bot1, bot2, bot3, bot4, bot5};
	// 3. use a for loop to initialize the robots.
		for(int i=0;i<array.length;i++) {
		//	array[i]= new Robot();
			array[i].setY(500);
			array[i].setRandomPenColor();
		}
	// 4. make each robot start at the bottom of the screen, side by side, facing up
		bot1.setX(100-50);
		bot2.setX(300-50);
		bot3.setX(500-50);
		bot4.setX(700-50);
		bot5.setX(900-50);
	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.
		for(int x=0;x<array.length;x++) {
			int random = new Random().nextInt(50);
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.
			
			bot1.move(new Random().nextInt(50));
			bot2.move(new Random().nextInt(50));
			bot3.move(new Random().nextInt(50));
			bot4.move(new Random().nextInt(50));
			bot5.move(new Random().nextInt(50));
		}
	// 7. declare that robot the winner and throw it a party!
		
	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
	}
}
