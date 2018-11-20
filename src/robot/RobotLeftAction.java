package robot;

import utils.RobotUtil;

public class RobotLeftAction extends Robot {

	@Override
	public boolean action() {
		// Left action
		int curPosition_x = super.getPosition_x();
		int curPosition_y = super.getPosition_y();
		String curPosition_face = super.getFacing();
		if(curPosition_face!=null&&RobotUtil.isRightDirection(curPosition_face)&&RobotUtil.isRightRange(curPosition_x, curPosition_y)) {
			if(curPosition_face.equals("NORTH")) {
        	        super.setFacing("WEST");
            }else if(curPosition_face.equals("EAST")) {
        	        super.setFacing("NORTH");
            }else if(curPosition_face.equals("SOUTH")) {
        	        super.setFacing("EAST");
            }else if(curPosition_face.equals("WEST")) {
        	        super.setFacing("SOUTH");
            }
		}else {
			return false;
		}
        
        return true;
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
