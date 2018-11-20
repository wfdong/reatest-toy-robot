package robotTest;

import robot.Robot;
import robot.RobotLeftAction;

public class RobotLeftActionTest {

	public static void main(String[] args) {
		RobotLeftAction robot = new RobotLeftAction();
		//test cases for Left Actions
		assert(robot.action(true)==null):"RobotLeftActionTest test1, action with boolean paremeter failed!";
		assert(!robot.action(1,2,"NORTH")):"RobotLeftActionTest test2, action with 3 paremeters failed!";
		
		assert(!robot.action()):"RobotLeftActionTest test3, without initialize, action failed!";
		
		Robot.setPosition_x(0);
		Robot.setPosition_y(0);
		assert(!robot.action()):"RobotLeftActionTest test4, without full initialize, action failed!";
		
		Robot.setFacing("NORTH");
		assert(robot.action()):"RobotLeftActionTest test5, with full initialize, action failed!";
		assert(Robot.getFacing().equals("WEST")):"RobotLeftActionTest test6, with full initialize and action, verify the lastest Facing failed!";
		
		Robot.setFacing("EAST");
		assert(robot.action()):"RobotLeftActionTest test7, with full initialize, action failed!";
		assert(Robot.getFacing().equals("NORTH")):"RobotLeftActionTest test8, with full initialize and action, verify the lastest Facing failed!";
		
		Robot.setFacing("SOUTH");
		assert(robot.action()):"RobotLeftActionTest test9, with full initialize, action failed!";
		assert(Robot.getFacing().equals("EAST")):"RobotLeftActionTest test10, with full initialize and action, verify the lastest Facing failed!";
		
		Robot.setFacing("WEST");
		assert(robot.action()):"RobotLeftActionTest test11, with full initialize, action failed!";
		assert(Robot.getFacing().equals("SOUTH")):"RobotLeftActionTest test12, with full initialize and action, verify the lastest Facing failed!";
	}
}
