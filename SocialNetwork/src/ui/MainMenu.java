package ui;

import java.util.Scanner;

import logic.UserList;

public class MainMenu {

	private int userChoice;
	private Scanner input = new Scanner(System.in);

	public MainMenu(UserList userList) {

		do {
			this.printMenu();
			userChoice = input.nextInt();

			switch (userChoice) {

			case 1:
				userList.addUser();
				break;
			case 2:
				userList.printUserList();
				break;
			case 3:
				System.out.println("See you later;)");
				return;
			default:
				System.out.println("Urecognized choice. Please try again");
				break;
			}

		} while (true);

	}

	private void printMenu() {

		System.out.println("Main Menu");
		System.out.println("------------------------------");
		System.out.println("1 - Input new user");
		System.out.println("2 - Print details of all users");
		System.out.println("3 - Exit program");
		System.out.println("------------------------------");
		System.out.print("Please enter your choice:");

	}

}
