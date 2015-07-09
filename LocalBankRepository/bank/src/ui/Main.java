package ui;

import logic.*;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		Logger tmp = new Logger(Logger.DEFAULT_DRIVER_NAME);
		Log tmp1 = new Log(date.getTime(), 1, "new", 1000);
		tmp.log(tmp1);
		

	}

}
