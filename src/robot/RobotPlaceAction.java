package robot;

import utils.RobotUtil;

public class RobotPlaceAction extends Robot {

	@Override
	public boolean action() {
		// with no need for impl
        return false;
	}

	@Override
	public boolean action(int position_x, int position_y, String facing) {
		// Place action
		if(RobotUtil.isRightRange(position_x, position_y)) {
			if(RobotUtil.isRightDirection(facing)) {
				super.setPosition_x(position_x);
				super.setPosition_y(position_y);
				super.setFacing(facing);
				return true;
			}else{
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public String action(boolean report) {
		// with no need for impl
		return null;
	}

}
