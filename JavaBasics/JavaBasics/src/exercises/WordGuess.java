package exercises;

import java.util.Scanner;

public class WordGuess {

	private static Scanner input = new Scanner(System.in);
	public static int sLength; 	// Length of guessing word
	public static Character[] sGuessedChars; // Chars that was guessed 
	public static String sGuessingWord;
	
	/**
	 * WordGuess to guess a word by trying to guess the individual characters.
	 * The word to be guessed should be provided using the command-line argument 
	 * and just in lower case.
	 * Guessing letters may be inputed in any cases.
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean guessedFlag = false;	// flag True if word was guessed
		sGuessingWord = args[0];
		sLength = sGuessingWord.length();
		sGuessedChars = new Character[sLength];
		int trailCounter = 1;
		String trailString;
		
		while (!guessedFlag) {
			
			System.out.println();
			System.out.println("Key in one character or your guess word: ");
			trailString = input.next();
			
			System.out.print("Trail " + trailCounter + ": ");
			trail(trailString);
			
			if (checkGuess()) {
				guessedFlag = true;
			} else {
				printTrail();
			}
			
			trailCounter++;
			
		}
		
		System.out.println("Congratulation!");
		System.out.println("You got in " + (trailCounter - 1) +" trials");
		
	}
	
	public static boolean checkGuess() {
		boolean result = true;
		for (int i = 0; i < sLength; i++) {
			if (sGuessedChars[i] == null) {
				result = false;
			}
		}
		return result;
	}

	public static void trail(String checkigString) {
		
		if (checkigString.length() > 1) {
			if (checkigString.equalsIgnoreCase(sGuessingWord)) {
				for (int i = 0; i < sLength; i++) {
					sGuessedChars[i] = sGuessingWord.charAt(i);
				}
			}
		} else {
			for (int i = 0; i < sLength; i++) {
				if(sGuessingWord.charAt(i) == Character.toLowerCase(checkigString.charAt(0))) {
					sGuessedChars[i] = Character.toLowerCase(checkigString.charAt(0));
				}
			}
		}
	}
	
	public static void printTrail() {
	
		for (int i = 0; i < sLength; i++) {
			if (sGuessedChars[i] != null) {
				System.out.print(sGuessedChars[i]);
			} else { 
				System.out.print("_");
			}
		}
	}
	
}
