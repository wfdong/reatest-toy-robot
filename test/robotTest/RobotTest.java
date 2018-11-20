package robotTest;

import robot.Robot;

public class RobotTest {

	public static void main(String[] args) {
		
		//test cases for Robot default values and getters/setters
		assert(Robot.getPosition_x()==-1):"Robot test1, getPosition_x failed!";
		assert(Robot.getPosition_y()==-1):"Robot test2, getPosition_y failed!";
		assert(Robot.getFacing()==null):"Robot test3, getFacing failed!";
		
		Robot.setPosition_x(2);
		Robot.setPosition_y(3);
		Robot.setFacing("NORTH");
		assert(Robot.getPosition_x()==2):"Robot test4, getPosition_x failed!";
		assert(Robot.getPosition_y()==3):"Robot test5, getPosition_y failed!";
		assert(Robot.getFacing().equals("NORTH")):"Robot test6, getFacing failed!";
	}
}
