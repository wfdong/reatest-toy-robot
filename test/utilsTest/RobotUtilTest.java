package utilsTest;

import utils.RobotUtil;

public class RobotUtilTest {
    public static void main(String[] args) {
    	
    	    //test cases for RobotUtil.isInteger
    	    assert(RobotUtil.isInteger("0")):"RobotUtilTest1: RobotUtil.isInteger failed!";
    	    assert(RobotUtil.isInteger("1")):"RobotUtilTest2: RobotUtil.isInteger failed!";
    	    assert(RobotUtil.isInteger("65535")):"RobotUtilTest3: RobotUtil.isInteger failed!";
    	    assert(RobotUtil.isInteger("-1")):"RobotUtilTest4: RobotUtil.isInteger failed!";
    	    assert(!RobotUtil.isInteger("1.5")):"RobotUtilTest5: RobotUtil.isInteger failed!";
    	    
    	    //test cases for RobotUtil.isRightDirection
    	    assert(RobotUtil.isRightDirection("NORTH")):"RobotUtilTest6: RobotUtil.isRightDirection failed!";
    	    assert(RobotUtil.isRightDirection("EAST")):"RobotUtilTest7: RobotUtil.isRightDirection failed!";
    	    assert(RobotUtil.isRightDirection("SOUTH")):"RobotUtilTest8: RobotUtil.isRightDirection failed!";
    	    assert(RobotUtil.isRightDirection("WEST")):"RobotUtilTest9: RobotUtil.isRightDirection failed!";
    	    assert(!RobotUtil.isRightDirection("north")):"RobotUtilTest10: RobotUtil.isRightDirection failed!";
    	    assert(!RobotUtil.isRightDirection("east")):"RobotUtilTest11: RobotUtil.isRightDirection failed!";
    	    assert(!RobotUtil.isRightDirection("south")):"RobotUtilTest12: RobotUtil.isRightDirection failed!";
    	    assert(!RobotUtil.isRightDirection("west")):"RobotUtilTest13: RobotUtil.isRightDirection failed!";
    	    assert(!RobotUtil.isRightDirection("norTH")):"RobotUtilTest14: RobotUtil.isRightDirection failed!";
    	    assert(!RobotUtil.isRightDirection("SOUTHEAST")):"RobotUtilTest15: RobotUtil.isRightDirection failed!";
    	    
    	    //test cases for RobotUtil.isRightRange
    	    assert(RobotUtil.isRightRange(0, 0)):"RobotUtilTest16: RobotUtil.isRightRange failed!";
    	    assert(RobotUtil.isRightRange(0, 1)):"RobotUtilTest17: RobotUtil.isRightRange failed!";
    	    assert(RobotUtil.isRightRange(0, 2)):"RobotUtilTest18: RobotUtil.isRightRange failed!";
    	    assert(RobotUtil.isRightRange(0, 3)):"RobotUtilTest19: RobotUtil.isRightRange failed!";
    	    assert(RobotUtil.isRightRange(0, 4)):"RobotUtilTest20: RobotUtil.isRightRange failed!";
    	    assert(RobotUtil.isRightRange(4, 4)):"RobotUtilTest21: RobotUtil.isRightRange failed!";
    	    assert(!RobotUtil.isRightRange(4, 5)):"RobotUtilTest22: RobotUtil.isRightRange failed!";
    	    assert(!RobotUtil.isRightRange(5, 5)):"RobotUtilTest23: RobotUtil.isRightRange failed!";
    	    assert(!RobotUtil.isRightRange(100, 100)):"RobotUtilTest24: RobotUtil.isRightRange failed!";
    	    assert(!RobotUtil.isRightRange(-1, 4)):"RobotUtilTest25: RobotUtil.isRightRange failed!";
    	    assert(!RobotUtil.isRightRange(-1, -1)):"RobotUtilTest26: RobotUtil.isRightRange failed!";
    	    assert(!RobotUtil.isRightRange(1, -1)):"RobotUtilTest27: RobotUtil.isRightRange failed!";
    }
}
