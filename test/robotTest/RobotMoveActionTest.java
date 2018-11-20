package robotTest;

import robot.Robot;
import robot.RobotMoveAction;

public class RobotMoveActionTest {

	public static void main(String[] args) {
		//test cases for move actions
		RobotMoveAction robot = new RobotMoveAction();
		assert(robot.action(true)==null):"RobotMoveActionTest test1, action with boolean paremeter failed!";
		assert(!robot.action(1,2,"NORTH")):"RobotMoveActionTest test2, action with 3 paremeters failed!";
		
		assert(!robot.action()):"RobotMoveActionTest test3, without initialize, failed!";
		
		Robot.setPosition_x(0);
		Robot.setPosition_y(0);
		assert(!robot.action()):"RobotMoveActionTest test4, without full initialize, failed!";
		
		Robot.setFacing("NORTH");
		assert(robot.action()):"RobotMoveActionTest test5,  failed!";
		assert(Robot.getPosition_x()==0):"RobotMoveActionTest test6, verify x after move, failed!";
		assert(Robot.getPosition_y()==1):"RobotMoveActionTest test7, verify y after move, failed!";
		assert(Robot.getFacing().equals("NORTH")):"RobotMoveActionTest test8, verify face after move, failed!";
	}
}
