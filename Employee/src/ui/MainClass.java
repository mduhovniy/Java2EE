package ui;

public class MainClass {
	
	static Logo logo = new Logo();

	public static void main(String[] args) {
		
		Logo.printLogo();
		MainMenu menu = new MainMenu();
		menu.start();

	}

}
