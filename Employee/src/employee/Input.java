package employee;

import java.util.Scanner;

public class Input {
	
	private static Scanner input = new Scanner(System.in);
	
	private static boolean isInteger(String input) {
		try {
			Integer.valueOf(input);
		} catch (Exception e) {
			System.out.println("Incorrect input!!!");
			return true;
		} 
		return false;
	}
	
	private static boolean isDouble(String input) {
		try {
			Double.valueOf(input);
		} catch (Exception e) {
			System.out.println("Incorrect input!!!");
			return true;
		} 
		return false;
	}

	public static int getNewInt() {
		String tmp;
		tmp = input.next();
		while (isInteger(tmp)) {
			System.out.print("Try again:");
			tmp = input.next();
		}
		return Integer.valueOf(tmp);
	}
	
	public static double getNewDouble() {
		String tmp;
		tmp = input.next();
		while (isDouble(tmp)) {
			System.out.print("Try again:");
			tmp = input.next();
		}
		return Double.valueOf(tmp);
	}
	
	public static String getNewString() {
		return input.next();
	}
	
}
