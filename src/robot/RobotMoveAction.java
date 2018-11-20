package robot;

import utils.RobotUtil;

public class RobotMoveAction extends Robot {

	@Override
	public boolean action() {
		// Move action
		int curPosition_x = super.getPosition_x();
		int curPosition_y = super.getPosition_y();
		String curPosition_face = super.getFacing();
		if(curPosition_face!=null&&RobotUtil.isRightDirection(curPosition_face)&&RobotUtil.isRightRange(curPosition_x, curPosition_y)) {
			if(curPosition_face.equals("NORTH")) {
				curPosition_y++;
			}else if(curPosition_face.equals("EAST")) {
				curPosition_x++;
			}else if(curPosition_face.equals("SOUTH")) {
				curPosition_y--;
			}else if(curPosition_face.equals("WEST")) {
				curPosition_x--;
			}
		}else {
			return false;
		}
		if(RobotUtil.isRightRange(curPosition_x, curPosition_y)) {
			super.setPosition_x(curPosition_x);
			super.setPosition_y(curPosition_y);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean action(int position_x, int position_y, String facing) {
		// with no need for impl
		return false;
	}

	@Override
	public String action(boolean report) {
		// with no need for impl
		return null;
	}

}
