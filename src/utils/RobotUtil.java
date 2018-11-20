package utils;

import java.util.regex.Pattern;

public class RobotUtil {

	  public static boolean isInteger(String str) {    
	    Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");    
	    return pattern.matcher(str).matches();    
	  } 
	  
	  public static boolean isRightDirection(String str) {
		  if(str==null) {
			  return false;
		  }
		  if(str.equals("NORTH")||str.equals("EAST")||str.equals("SOUTH")||str.equals("WEST")) {
			  return true;
		  }else {
			  return false;
		  }
	  }
	  
	  public static boolean isRightRange(int x, int y) {
		  if(x==0||x==1||x==2||x==3|x==4) {
			  if(y==0||y==1||y==2||y==3||y==4) {
				  return true;
			  }else {
				  return false;
			  }
		  }else {
			  return false;
		  }
	  }
}
