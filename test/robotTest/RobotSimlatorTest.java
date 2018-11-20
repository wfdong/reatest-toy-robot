package robotTest;

import java.util.ArrayList;

import robot.RobotSimlator;


public class RobotSimlatorTest {

	public static void main(String[] args) {
		
		ArrayList<String> commands = new ArrayList<String>();
		commands.add("PLACE 0 0 NORTH");
		commands.add("MOVE");
		commands.add("REPORT");
		String result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("\n0, 1, NORTH")):"RobotSimlatorTest test1: failed!";
		
		commands.add("RIGHT");
		commands.add("MOVE");
		commands.add("MOVE");
		commands.add("LEFT");
		commands.add("MOVE");
		commands.add("LEFT");
		commands.add("REPORT");
		result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("\n0, 1, NORTH\n2, 2, WEST")):"RobotSimlatorTest test2: failed!";
		
		commands.add("PLACE 4 4 SOUTH");
		commands.add("MOVE");
		commands.add("REPORT");
		result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("\n0, 1, NORTH\n2, 2, WEST\n4, 3, SOUTH")):"RobotSimlatorTest test3: failed!";
		
		commands.add("LEFT");
		commands.add("MOVE");
		commands.add("REPORT");
		result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("wrong command!")):"RobotSimlatorTest test4: failed!";
		
		commands.add("PLACE 8 100 NORTH");
		commands.add("MOVE");
		commands.add("REPORT");
		result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("wrong command!")):"RobotSimlatorTest test5: failed!";
		
		commands.add("PLACE 3 2 northeast");
		commands.add("REPORT");
		result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("wrong command!")):"RobotSimlatorTest test6: failed!";
		
		commands.clear();
		commands.add("PLACE 3 3 NORTH");
		commands.add("MOVE");
		commands.add("REPORT");
		result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("\n3, 4, NORTH")):"RobotSimlatorTest test7: failed!";
		
		commands.add("MOVE");
		commands.add("REPORT");
		result = RobotSimlator.simulateRobot(commands);
		assert(result.equals("wrong command!")):"RobotSimlatorTest test8: failed!";
	}
}
