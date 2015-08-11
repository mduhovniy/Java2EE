package employee;

import java.util.ArrayList;
//import java.util.LinkedList;

public class EmployeeList {	

//	private static final int MAX_NUM_OF_EMPLOYEES = 10;
	private static final int NUM_OF_WORKER_TYPES = 4;
//	private static int numOfEmployees = 0;

	private ArrayList<Employee> arr = new ArrayList<Employee>();
	
/* 
 *  Singleton!!!
 */
//	private static EmployeeList newList = new EmployeeList();
//	
//	public static EmployeeList getEmployeeList() {
//		return newList;
//	}
//	
//	private EmployeeList() {
//		
//	}
	
	public void updateEmployee() {
		int index;
		if(arr.isEmpty()) {
			System.out.println("Nothing to update!");
			return;
		}
		printDetails();
		System.out.print("Please choose index of employee to update:");
		index = Input.getNewInt();
		if(index < 0 || index > arr.size()) {
			System.out.println("Incorrect index!");
		} else {
			System.out.println("Update details of " 
					+ arr.get(index).getClass().getSimpleName() 
					+ ". Please enter new details of " + arr.get(index).getName());
			System.out.println("------------------------------------------------------");
			arr.get(index).addEmployee();
			System.out.println("Details of " 
					+ arr.get(index).getClass().getSimpleName() 
					+ arr.get(index).getName()
					+ " was successfully updated!");
		}
	}
	
	public void removeEmployee() {
		int index;
		if(arr.isEmpty()) {
			System.out.println("Nothing to remove!");
			return;
		}
		printDetails();
		System.out.print("Please choose index of employee to remove:");
		index = Input.getNewInt();
		if(index < 0 || index > arr.size()) {
			System.out.println("Incorrect index!");
		} else {
			System.out.println("Removing of " 
					+ arr.get(index).getClass().getSimpleName() 
					+ " with name " + arr.get(index).getName());
			System.out.println("----------------------------------------------");
			arr.remove(index);
			System.out.println("Removed successfully!");
		}
	}
	
	public void createNewEmployee() {
		int menu;
		
		do {
//			if(numOfEmployees == MAX_NUM_OF_EMPLOYEES) {
//				System.out.println("Employee list overloaded! You cann't create new employee");
//				return;
//			}
			
			printMenu();
			menu = Input.getNewInt();
			
			switch (menu) {
			
			case 1:
				arr.add(new Manager());
				break;
			case 2:
				arr.add(new Secretary());
				break;
			case 3:
				arr.add(new Engineer());
				break;
			case 4:
				arr.add(new Cleaner());
				break;
			case 5:
				return;
			default:
				System.out.println("Unrecognized choice! Please try again");
				break;
			}
			
			if(menu > 0  && menu <= NUM_OF_WORKER_TYPES) {
				System.out.println("Creation of new" 
						+ arr.get(arr.size()-1).getClass().getSimpleName() 
						+ ". Please enter details");
				System.out.println("----------------------------------------------");
				arr.get(arr.size()-1).addEmployee();
				System.out.println("New employee " + arr.get(arr.size()-1).getName() 
						+ " was successfully added");
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
		for (Employee i : arr) {
			if(i != null) {
				System.out.print(arr.indexOf(i) + "# ");
				i.printDetails();
			}
		}
	}

	public void printSalary() {
		System.out.println("List of employees salary:");
		System.out.println("-------------------------");
		for (Employee i : arr) {
			if(i != null) {
				System.out.print(arr.indexOf(i) + "# ");
				i.printSalary();
			}
		}
	}

}