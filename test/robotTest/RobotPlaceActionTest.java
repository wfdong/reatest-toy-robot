package robotTest;

import robot.Robot;
import robot.RobotPlaceAction;

public class RobotPlaceActionTest {

	public static void main(String[] args) {
		//test cases for place action
		RobotPlaceAction robot = new RobotPlaceAction();
		assert(robot.action(true)==null):"RobotPlaceActionTest test1, action with boolean paremeter failed!";
		assert(!robot.action()):"RobotPlaceActionTest test2, action with 3 paremeters failed!";
		
		assert(robot.action(1,2,"NORTH")):"RobotPlaceActionTest test3, action failed!";
		
		assert(Robot.getPosition_x()==1):"RobotPlaceActionTest test4, verify x failed!";
		assert(Robot.getPosition_y()==2):"RobotPlaceActionTest test5, verify y failed!";
		assert(Robot.getFacing().equals("NORTH")):"RobotPlaceActionTest test6, verify face failed!";
	}
}
