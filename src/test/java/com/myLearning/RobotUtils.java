package com.myLearning;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

public class RobotUtils {
	public static void typeKeys(String str, Robot r) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ':') {
				typeChracter(r, "SEMICOLON", str, true);
			} else if (str.charAt(i) == '\\') {
				typeChracter(r, "BACK_SLASH", str, false);
			} else if (str.charAt(i) == '.') {
				typeChracter(r, "PERIOD", str, false);
			} else {
				char ch = str.charAt(i);
				if (Character.isUpperCase(ch)) {
					typeChracter(r, "" + ch, str, true);
				} else {
					typeChracter(r, "" + ch, str, false);
				}
			}
		}
		r.keyPress(KeyEvent.VK_ENTER);
	}

	private static void typeChracter(Robot r,String letter, String string, boolean b) {
		// TODO Auto-generated method stub
		try {
			String variableName ="VK_" + letter.toUpperCase();
			Class<KeyEvent> clazz = KeyEvent.class;
			Field field = clazz.getField(variableName);
			int KeyCode = field.getInt(null);
			
			r.delay(1000);
			boolean needShift = false;
			if(needShift)
		    r.keyPress(KeyEvent.VK_SHIFT);
	        r.keyPress(KeyCode);
	        r.keyRelease(KeyCode);
	        
	        boolean needENTER = true;
			if(needENTER)
			    r.keyPress(KeyEvent.VK_ENTER);
		        r.keyPress(KeyCode);
		        r.keyRelease(KeyCode);
	        
	        if(needShift)
	        r.keyPress(KeyEvent.VK_SHIFT);	
		}catch(Exception e) {
			System.out.println("Print the Shift");
		}
}

}
