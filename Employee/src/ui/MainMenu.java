package ui;

import employee.*;

public class MainMenu {

	private int userChoice;
	
	private EmployeeList list = new EmployeeList();
	
	public void start() {
		
//		System.out.println(Manager.class.getSimpleName());
//		System.out.println(Cleaner.class.getTypeName());
//		System.out.println(Engineer.class.getCanonicalName());
//		System.out.println(Secretary.class.);
//		
		
		do{
			printMainMenu();
			userChoice = Input.getNewInt();
			switch (userChoice) {
			case 1:
				list.createNewEmployee();
				break;
			case 2:
				list.updateEmployee();
				break;
			case 3:
				list.removeEmployee();
				break;
			case 4:
				list.printDetails();
				break;
			case 5:
				list.printSalary();
				break;
			case 6:
				return;
			default:
				System.out.println("Unrecognized choise. Please try again");
				break;
			}
		} while (true);
		
	}
	
	private void printMainMenu() {
		System.out.println("Main menu");
		System.out.println("------------------------------");
		System.out.println("1 - Create new employee");
		System.out.println("2 - Update details of employee");
		System.out.println("3 - Remove employee");
		System.out.println("4 - Detail report");
		System.out.println("5 - Salary report");
		System.out.println("6 - Exit program");
		System.out.println("------------------------------");
		System.out.print("Please enter variant:");
	}
	
}
