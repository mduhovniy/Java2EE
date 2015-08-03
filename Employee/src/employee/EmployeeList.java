package employee;

import java.util.Scanner;

public class EmployeeList {

	private static final int MAX_NUM_OF_EMPLOYEES = 3;
	private static final int NUM_OF_WORKER_TYPES = 4;
	private static int numOfEmployees = 0;
	
	private Scanner input = new Scanner(System.in);
	private Employee[] arr = new Employee[MAX_NUM_OF_EMPLOYEES];
	
	public void createNewEmployee() {
		int menu;
		
		do {
			if(numOfEmployees == MAX_NUM_OF_EMPLOYEES) {
				System.out.println("Employee list overloaded! You cann't create new employee");
				return;
			}
			
			printMenu();
			menu = input.nextInt();
			
			switch (menu) {
			
			case 1:
				arr[numOfEmployees] = new Manager();
				break;
			case 2:
				arr[numOfEmployees] = new Secretary();
				break;
			case 3:
				arr[numOfEmployees] = new Engineer();
				break;
			case 4:
				arr[numOfEmployees] = new Cleaner();
				break;
			case 5:
				return;
			default:
				System.out.println("Unrecognized choice! Please try again");
				break;
			}
			
			if(menu > 0  && menu <= NUM_OF_WORKER_TYPES) {
				arr[numOfEmployees].addEmployee();
				System.out.println("New employee " + arr[numOfEmployees].getName() + " was successfully added");
				numOfEmployees++;
			}

		} while (true);

	}

	private void printMenu() {
		System.out.println("Please choose a type of new employee");
		System.out.println("------------------------------------");
		System.out.println("1 - Manager");
		System.out.println("2 - Secretary");
		System.out.println("3 - Engineer");
		System.out.println("4 - Cleaner");
		System.out.println("5 - Return to main menu");
		System.out.println("------------------------------------");
		System.out.print("Please enter your choice:");
	}

	public void printDetails() {
		System.out.println("Details of all employees:");
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.print(i + "# ");
				arr[i].printDetails();
			}
		}
	}

	public void printSalary() {
		System.out.println("List of employees salary:");
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.print(i + "# ");
				arr[i].printSalary();
			}
		}
	}

}