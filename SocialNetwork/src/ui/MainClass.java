package ui;

import logic.UserList;;

public class MainClass {

	public static void main(String[] args) {

		UserList userList = new UserList();
		new MainMenu(userList);

	}

}
