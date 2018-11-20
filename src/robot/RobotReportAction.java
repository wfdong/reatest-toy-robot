package robot;

import utils.RobotUtil;

public class RobotReportAction extends Robot {

	@Override
	public boolean action() {
		// with no need for impl
        return false;
	}

	@Override
	public boolean action(int position_x, int position_y, String facing) {
		// with no need for impl
        return false;
	}

	@Override
	public String action(boolean report) {
		// report action
		int curPosition_x = super.getPosition_x();
		int curPosition_y = super.getPosition_y();
		String curPosition_face = super.getFacing();
		if(curPosition_face!=null&&RobotUtil.isRightDirection(curPosition_face)&&RobotUtil.isRightRange(curPosition_x, curPosition_y)) {
			return super.getPosition_x()+", "+super.getPosition_y()+", "+super.getFacing();
		}else {
			return "wrong command! you should place the robot first!";
		}
		
	}

}
