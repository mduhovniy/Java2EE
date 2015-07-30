package exercises;

import java.util.Scanner;

public class Ex1_3 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int menu; // Main menu id

		while (true) {
			System.out.println();
			System.out.println("Please choose a variant");
			System.out.println("--------------------------------------");
			System.out.println("1 - exercise 1 - CheckPassFile");
			System.out.println("2 - exercise 2 - CheckOddEven");
			System.out.println("3 - exercise 3 - PrintNumberInWord(nested-if)");
			System.out
					.println("4 - exercise 3 - PrintNumberInWord(switch-case)");
			System.out.println("5 - Exit program");
			System.out.println("--------------------------------------");
			menu = input.nextInt();

			switch (menu) {

			case 1: // Calling of CheckPassFail method
				System.out.println("Please input number:");
				System.out.println(CheckPassFail(input.nextInt()));
				break;
			case 2: // Calling of CheckOddEven method
				System.out.println("Please input number:");
				System.out.println(CheckOddEven(input.nextInt()));
				break;
			case 3: // Calling for NumberInWordA method (with nested-if)
				System.out.println("Please input number:");
				System.out.println(NumberInWordA(input.nextInt()));
				break;
			case 4: // Calling for NumberInWordB method (with switch-case)
				System.out.println("Please input number:");
				System.out.println(NumberInWordB(input.nextInt()));
				break;
			case 5:
				System.out.println("See you later;)");
				break;
			default:
				System.out.println("Unrecognized input. Please try again");

			}
			// check for exit program
			if (menu == 5) {
				break;
			}

		}
		
		input.close();

	}

	/**
	 * Method for exercise 1 Checks the input number and if it >= 50 returns
	 * PASS, otherwise returns FAIL
	 * 
	 * @param mark
	 *            checking volume
	 */
	public static String CheckPassFail(int mark) {
		String result = "FAIL";
		if (mark >= 50) {
			result = "PASS";
		}
		return result;
	}

	/**
	 * Method for exercise 2 Checks the input number if it Odd or Even
	 * 
	 * @param number
	 *            checking number
	 */
	public static String CheckOddEven(int number) {
		String result = "Odd number";
		if ((number % 2) == 0) {
			result = "Even number";
		}
		return result;
	}

	/**
	 * Method for exercise 3. Nested-if version. Gets the number in word
	 * representation. Return word representation only for number between 1 and
	 * 9
	 * 
	 * @param number
	 * @return
	 */
	public static String NumberInWordA(int number) {
		String result = "OTHER";
		if (number == 1) {
			result = "ONE";
		} else if (number == 2) {
			result = "TWO";
		} else if (number == 3) {
			result = "THREE";
		} else if (number == 4) {
			result = "FOUR";
		} else if (number == 5) {
			result = "FIVE";
		} else if (number == 6) {
			result = "SIX";
		} else if (number == 7) {
			result = "SEVEN";
		} else if (number == 8) {
			result = "EIGHT";
		} else if (number == 9) {
			result = "NINE";
		}
		return result;
	}

	/**
	 * Method for exercise 3. Switch-case version. Gets the number in word
	 * representation. Return word representation only for number between 1 and
	 * 9
	 * 
	 * @param number
	 * @return
	 */
	public static String NumberInWordB(int number) {
		String result;

		switch (number) {

		case 1:
			result = "ONE";
			break;
		case 2:
			result = "TWO";
			break;
		case 3:
			result = "THREE";
			break;
		case 4:
			result = "FOUR";
			break;
		case 5:
			result = "FIVE";
			break;
		case 6:
			result = "SIX";
			break;
		case 7:
			result = "SEVEN";
			break;
		case 8:
			result = "EIGHT";
			break;
		case 9:
			result = "NINE";
			break;
		default:
			result = "OTHER";
		}
		return result;
	}

}