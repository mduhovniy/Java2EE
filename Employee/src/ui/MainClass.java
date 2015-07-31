package ui;

import employee.EmployeeList;

public class MainClass {
	
	public static void main(String[] args) {
		
		EmployeeList newList = new EmployeeList(4);
		newList.printDetails();
		newList.printSalary();

	}

}
