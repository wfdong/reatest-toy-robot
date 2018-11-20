package robotTest;

import robot.Robot;
import robot.RobotRightAction;

public class RobotRightActionTest {

	public static void main(String[] args) {
		RobotRightAction robot = new RobotRightAction();
		
		//test cases for Right Actions
		assert(robot.action(true)==null):"RobotRightActionTest test1, action with boolean paremeter failed!";
		assert(!robot.action(1,2,"NORTH")):"RobotRightActionTest test2, action with 3 paremeters failed!";
		
		assert(!robot.action()):"RobotRightActionTest test3, without initialize, action failed!";
		
		Robot.setPosition_x(0);
		Robot.setPosition_y(0);
		assert(!robot.action()):"RobotRightActionTest test4, without full initialize, action failed!";
		
		Robot.setFacing("NORTH");
		assert(robot.action()):"RobotRightActionTest test5, with full initialize, action failed!";
		assert(Robot.getFacing().equals("EAST")):"RobotRightActionTest test6, with full initialize and action, verify the lastest Facing failed!";
		
		Robot.setFacing("EAST");
		assert(robot.action()):"RobotRightActionTest test7, with full initialize, action failed!";
		assert(Robot.getFacing().equals("SOUTH")):"RobotRightActionTest test8, with full initialize and action, verify the lastest Facing failed!";
		
		Robot.setFacing("SOUTH");
		assert(robot.action()):"RobotRightActionTest test9, with full initialize, action failed!";
		assert(Robot.getFacing().equals("WEST")):"RobotRightActionTest test10, with full initialize and action, verify the lastest Facing failed!";
		
		Robot.setFacing("WEST");
		assert(robot.action()):"RobotRightActionTest test11, with full initialize, action failed!";
		assert(Robot.getFacing().equals("NORTH")):"RobotRightActionTest test12, with full initialize and action, verify the lastest Facing failed!";
	}
}
