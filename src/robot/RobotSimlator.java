package robot;

import java.util.ArrayList;
import java.util.Scanner;

import utils.RobotUtil;

public class RobotSimlator {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input your commands(in upper case, and each command in its own line, sepparate parameters by blank space):");
		ArrayList<String> commands = new ArrayList<String>();
		while(scanner.hasNext()) {
			String curCmd = scanner.nextLine();
			if(curCmd.equals("-1")) {
				scanner.close();
				break;
			}
			commands.add(curCmd);
		}
		scanner.close();
		String result = simulateRobot(commands);
		System.out.println(result);
	}
	
	public static String simulateRobot(ArrayList<String> commands) {
		String result = "";
		boolean flag = true;
		Robot rb=null;
		for(String cmd:commands) {
			//System.out.println(cmd);
			if(cmd.startsWith("PLACE")) {
				String[] placeCMD = cmd.split(" ");
				if(placeCMD.length==4&&RobotUtil.isInteger(placeCMD[1])&&RobotUtil.isInteger(placeCMD[2])){
					rb = new RobotPlaceAction();
					if(!rb.action(Integer.parseInt(placeCMD[1]), Integer.parseInt(placeCMD[2]), placeCMD[3]))
					{
						flag = false;
					}
				}else {
					flag = false;
				}
			}else if(cmd.equals("MOVE")) {
				rb = new RobotMoveAction();
				if(!rb.action()) {
					flag = false;
				}
			}else if(cmd.equals("LEFT")) {
				rb = new RobotLeftAction();
				if(!rb.action()) {
					flag = false;
				}
			}else if(cmd.equals("RIGHT")) {
				rb = new RobotRightAction();
				if(!rb.action()) {
					flag = false;
				}
			}else if(cmd.equals("REPORT")) {
				rb = new RobotReportAction();
				result = result + "\n"+ rb.action(true);
			}else {
				flag = false;
			}
		}
		if(!flag) {
			result = "wrong command!";
		}
		return result;
	}
	
}
