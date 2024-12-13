package Utils;

import java.util.Date;

public class Util {
		
	public static void main(String[] args) {
		emailWithDateTimeStamp();
	}

	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		String TimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "suraiyaahmed" + TimeStamp + "@gmail.com";
	}

	public static final int IMPLICIT_WAIT = 10;
	public static final int PAGE_LOAD_TIMEOUT = 20;
	public static final int SCRIPT_TIMEOUT = 2000;
}
