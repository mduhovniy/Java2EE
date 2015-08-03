package ui;

import employee.EmployeeList;

public class MainClass {
	
	static Logo logo = new Logo();
	static EmployeeList newList = new EmployeeList();
	
	public static void main(String[] args) {
		
		logo.printLogo();
		new MainMenu(newList);

	}

}
