package robot;

public abstract class Robot {
	//current position of this robot
    static int position_x=-1;
    static int position_y=-1;
    
    //current direction this robot facing
    static String facing;
    
	public abstract boolean action();
    public abstract String action(boolean report);
    public abstract boolean action(int position_x, int position_y, String facing);
    
    
    public static int getPosition_x() {
		return position_x;
	}
	public static void setPosition_x(int position_x) {
		Robot.position_x = position_x;
	}
	public static int getPosition_y() {
		return position_y;
	}
	public static void setPosition_y(int position_y) {
		Robot.position_y = position_y;
	}
	public static String getFacing() {
		return facing;
	}
	public static void setFacing(String facing) {
		Robot.facing = facing;
	}
}
