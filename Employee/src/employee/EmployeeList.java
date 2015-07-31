package employee;

import java.util.Scanner;

public class EmployeeList {

	private static final int MAX_NUM_OF_EMPLOYEES = 10;
	private Scanner input = new Scanner(System.in);
	private Employee[] arr = new Employee[MAX_NUM_OF_EMPLOYEES];

	public EmployeeList(int numOfEmployees) {
		if(numOfEmployees < MAX_NUM_OF_EMPLOYEES) {
			for (int i = 0; i < numOfEmployees; i++) {
				arr[i] = createNewEmployee();
			}
		}
	}

	private Employee createNewEmployee() {
		Employee newEmployee;
		int menu;
		String name = "N/A";
		int age = 0, id = 0, experience = 0, vacation = 0, hours = 0;
		double salary = 0, bonus = 0, perHour = 0;

		printMenu();
		do {
			menu = input.nextInt();
			
			if(menu > 0 && menu < 4) {
				System.out.print("Enter name:");
				name = input.next();
				System.out.print("Enter age:");
				age = input.nextInt();
				System.out.print("Enter ID:");
				id = input.nextInt();
				System.out.print("Enter experience:");
				experience = input.nextInt();
				System.out.print("Enter salary:");
				salary = input.nextDouble();		
			}
			
			switch (menu) {
			
			case 1:
				System.out.print("Enter vacation:");
				vacation = input.nextInt();
				newEmployee = new Manager(name, age, id, experience, salary, vacation);
				return newEmployee;
			case 2:
				System.out.print("Enter hours of work:");
				hours = input.nextInt();
				System.out.print("Enter wage per hour:");
				perHour = input.nextDouble();
				newEmployee = new Secretary(name, age, id, experience, salary, hours, perHour);
				return newEmployee;
			case 3:
				System.out.print("Enter bonus:");
				bonus = input.nextDouble();
				newEmployee = new Engeneer(name, age, id, experience, salary, bonus);
				return newEmployee;
			default:
				System.out.println("Unrecognized choice! Please try again");
				break;
			}

		} while (true);

	}

	private void printMenu() {
		System.out.println("Please choose a type of new employee");
		System.out.println("------------------------------------");
		System.out.println("1 - Manager");
		System.out.println("2 - Secretary");
		System.out.println("3 - Engeneer");
		System.out.println("------------------------------------");
		System.out.print("Please enter your choice:");
	}

	public void printDetails() {
		System.out.println("Details of all employees:");
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].printDetails();
			}
		}
	}

	public void printSalary() {
		System.out.println("List of employees salary:");
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].printSalary();
			}
		}
	}

}