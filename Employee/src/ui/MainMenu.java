package ui;

import java.util.Scanner;
import employee.EmployeeList;

public class MainMenu {

	private int userChoice;
	private Scanner input = new Scanner(System.in);
	
	public MainMenu(EmployeeList list) {
		
		do{
			printMainMenu();
			userChoice = input.nextInt();
			switch (userChoice) {
			case 1:
				list.createNewEmployee();
				break;
			case 2:
				list.printDetails();
				break;
			case 3:
				list.printSalary();
				break;
			case 4:
				return;
			default:
				System.out.println("Unrecognized choise. Please try again");
				break;
			}
		} while (true);
		
	}
	
	private void printMainMenu() {
		System.out.println("Main menu");
		System.out.println("-----------------------");
		System.out.println("1 - Create new employee");
		System.out.println("2 - Detail report");
		System.out.println("3 - Salary report");
		System.out.println("4 - Exit program");
		System.out.println("-----------------------");
		System.out.print("Please enter variant:");
	}
	
}
