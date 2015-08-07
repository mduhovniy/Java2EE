package ui;

import employee.*;

public class MainClass {
	
	static Logo logo = new Logo();
	static EmployeeList newList = new EmployeeList();
	
	public static void main(String[] args) {
		
		Logo.printLogo();
		new MainMenu(newList);

	}

}
