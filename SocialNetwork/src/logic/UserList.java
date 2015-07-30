package logic;

import java.util.Scanner;

public class UserList {

	private static final int MAX_NUM_OF_USERS = 2;
	private static int numOfUsers = 0;

	private SocialNetworkUser[] userList = new SocialNetworkUser[MAX_NUM_OF_USERS];

	private Scanner input;
	
	public void addUser() {
		int userChoice;
		input = new Scanner(System.in);
		String userName, userPassword;

		if (numOfUsers == MAX_NUM_OF_USERS) {
			System.out.println("List of users is overloaded");
			return;
		}

		this.printMenu();
		userChoice = input.nextInt();

		switch (userChoice) {

		case 1:
			System.out.print("Please enter new user name:");
			userName = input.next();
			System.out.print("Please enter new password:");
			userPassword = input.next();

			userList[numOfUsers] = new FacebookUser(userName, userPassword);
			numOfUsers ++;
			break;
		case 2:
			System.out.print("Please enter new user name:");
			userName = input.next();
			System.out.print("Please enter new password:");
			userPassword = input.next();

			userList[numOfUsers] = new GooglePlusUser(userName, userPassword);
			System.out.print("Please enter users Gmail account:");
			((GooglePlusUser) userList[numOfUsers]).setgMailAccount(input
					.next());
			numOfUsers ++;
			break;
		case 3:
			System.out.print("Please enter new user name:");
			userName = input.next();
			System.out.print("Please enter new password:");
			userPassword = input.next();

			userList[numOfUsers] = new InstagramUser(userName, userPassword);
			System.out.print("Please enter users photo album name:");
			((InstagramUser) userList[numOfUsers]).setPhotoAlbumName(input
					.next());
			numOfUsers ++;
			break;
		default:
			System.out.println("Urecognized choice");
			break;
		}

	}

	public void printUserList() {
		for (int i = 0; i < userList.length; i++) {
			if (userList[i] != null) {
				System.out.println("USER #" + (i+1));
				System.out.println(userList[i].toString());
			}
		}
	}

	private void printMenu() {

		System.out.println("New user creation menu");
		System.out.println("------------------------------");
		System.out.println("1 - Facebook user");
		System.out.println("2 - Google Plus user");
		System.out.println("3 - Instagram user");
		System.out.println("------------------------------");
		System.out.print("Please enter your choice:");

	}
}
