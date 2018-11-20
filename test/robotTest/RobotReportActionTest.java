package robotTest;

import robot.Robot;
import robot.RobotReportAction;

public class RobotReportActionTest {

	public static void main(String[] args) {
		//test cases for report action
		RobotReportAction robot = new RobotReportAction();
		assert(!robot.action()):"RobotReportActionTest test1, action with boolean paremeter failed!";
		assert(!robot.action(1,2,"NORTH")):"RobotReportActionTest test2, action with 3 paremeters failed!";
		
		assert(robot.action(true).equals("wrong command! you should place the robot first!")):"RobotReportActionTest test3, without initialize, action failed!";
		Robot.setPosition_x(1);
		Robot.setPosition_y(4);
		assert(robot.action(true).equals("wrong command! you should place the robot first!")):"RobotReportActionTest test4, without full initialize, action failed!";
		Robot.setFacing("NORTH");
		assert(robot.action(true).equals("1, 4, NORTH")):"RobotReportActionTest test5, without full initialize, action failed!";
		
	}
}
