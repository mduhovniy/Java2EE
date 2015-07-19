package ui;

import logic.*;
import java.util.Scanner;

public class Main {

	private static final int NUMBER_OF_BOXES = 3;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Box[] boxes = new Box[NUMBER_OF_BOXES];

		for (int i = 0; i < NUMBER_OF_BOXES; i++) {

			boxes[i] = createBox();
			System.out.println();

		}

		for (int i = 0; i < NUMBER_OF_BOXES; i++) {

			System.out.println("Box#" + (i + 1) + " type "
					+ boxes[i].getClass().getSimpleName() + " ");
			printBoxData(boxes[i]);
			System.out.println();

		}

		input.close();

	}

	/**
	 * prints all of the Box data on the screen
	 * 
	 * @param box
	 */
	public static void printBoxData(Box box) {

		System.out.println(box.boxData());

	}

	public static Box createBox() {

		Box newBox;
		int newBoxType;
		String label;
		int diametr, lenght, width, height;

		while (true) {

			System.out.print("Input label:");
			label = input.next();

			System.out.println("1 - plastic box");
			System.out.println("2 - can box");
			System.out.println("-------------------------------");
			System.out.print("Please choose a new box type:");

			newBoxType = input.nextInt();

			switch (newBoxType) {

			case 1:
				System.out.print("Input length:");
				lenght = input.nextInt();
				if (lenght < 0) {
					lenght = 0;
				}
				System.out.print("Input width:");
				width = input.nextInt();
				if (width < 0) {
					width = 0;
				}
				System.out.print("Input heigth:");
				height = input.nextInt();
				if (height < 0) {
					height = 0;
				}

				newBox = new PlasticBox(label, lenght, width, height);

				break;

			case 2:
				System.out.print("Input diametr:");
				diametr = input.nextInt();
				if (diametr < 0) {
					diametr = 0;
				}
				System.out.print("Input heigth:");
				height = input.nextInt();
				if (height < 0) {
					height = 0;
				}

				newBox = new CanBox(label, height, diametr);

				break;

			default:
				System.out.println("Wrong box type! Try again");
				System.out.println();
				newBox = null;

			}

			if (newBox != null) {
				break;	
			}
		}

		return newBox;
	}
}

