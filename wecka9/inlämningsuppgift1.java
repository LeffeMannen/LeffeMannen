package wecka9;

import java.util.Scanner;
import java.util.Random;

public class inlämningsuppgift1 {

	/**
	 * Shows which difficulties you can select from from the menu.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int menu = 0;
		boolean game = true; // Game can only play if this is true.
		while (game) {
			System.out.println(" - Welcome - " + "\n - Choose Difficulty - "
					+ "\n - (1) - Super Easy 	- 1000 guesses	- random number between 1 - Your own choice "
					+ "\n - (2) - Medium 	- 100 guesses	- random number between 1 - Your own choice "
					+ "\n - (3) - Hard 		- 10 guesses	- random number between 1 - Your own choice "
					+ "\n - (4) - Impossible	- 1 guess	- random number between Integer Min and Max "
					+ "\n - (5) - Exit \n \n **ANY OTHER KEY GOES TO MAIN MENU** \n"); // Explaining what difficulties
																						// you can choose from and what
																						// happens if you press anything
																						// other than these numbers.

			try {
				menu = input.nextInt(); // Selects what difficulty you want to play.
				switch (menu) {

				case 1: // Supereasy
					System.out.println(" - Super Easy - ");
					if (hiddennumber(1000) == 0) { // Gives the player 1000 guesses because it's Super Easy. If integer
													// playagain returns with the number 0, exit system.
						System.exit(0);
					}

					break; // Without break the game will exit whatever key you press.

				case 2: // Medium
					System.out.println(" - Medium - ");
					if (hiddennumber(100) == 0) { // Gives the player 100 guesses because it's Medium. If integer
													// playagain returns with the number 0, exit system.
						System.exit(0);
					}

					break; // Without break the game will exit whatever key you press.

				case 3: // Hard
					System.out.println(" - Hard - ");
					if (hiddennumber(10) == 0) { // Gives the player 10 guesses because it's Hard. If integer
													// playagain returns with the number 0, exit system.
						System.exit(0);
					}

					break; // Without break the game will exit whatever key you press.

				case 4: // Impossible
					System.out.println(" - Impossible - ");
					if (hiddennumberImp(1) == 0) { // Gives the player 1 guess because it's Impossible. If integer
													// playagain returns with the number 0, exit system.
						System.exit(0);
					}

					break; // Without break the game will exit whatever key you press.

				case 5: // Exit

					System.out.println("Exiting.. \n");
					System.exit(0);// If player presses number 5 in the menu, the system will exit.

					break; // Without break the game will exit whatever key you press.

				default:
				}
			} catch (Exception e) {
				input.nextLine();// Any characters or symbols that isn't 1 - 5 will take the player to the menu.
			}

		}

	}

	/**
	 * Random number generates between integer 1 and random max number the player
	 * selects. Then you get guesses depending on the difficulty you selected to
	 * find the hiddenNumber, if you guess right the screen will say
	 * congratulations, show you how many guesses you had left and ask if you want
	 * to play again, if you don't get right it will tell you what then number was
	 * and ask if you want to play the game again.
	 * 
	 * @param guesses
	 * @return playagain
	 */
	public static int hiddennumber(int guesses) {

		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int max = 0;
		int min = 1;
		int guess = 0;

		for (int i = 0; i < 1; i++) {
			System.out.println(" - Enter Max number: 		(Number can't be higher than 2147483647) Write anything "
					+ "\n				other than a number will take you to the main menu");
			max = input.nextInt(); // Player selects what the max number will be.
			System.out.println("Max number set too: " + max + "\n");

		}

		int hiddenNumber = random.nextInt(max) + 1; // Hidden number can be between number 1 to max.
		System.out.println("Guess the hidden number between 1 - " + max);

		for (int i = 1; i < guesses + 1; i++) { // Loop for guess.

			try {

				guess = input.nextInt(); // Inputs guess as the next integer.

				if (guess > max) { // If guess is bigger than max it will print out that it can't go over max.
					System.out.println("You can't go over max");
				} else if (guess < min) { // If guess is lower than min it will print out that it can't go under min.
					System.out.println("You can't go under min");
				} else if (guess < hiddenNumber) { // If guess is lower than hiddenNumber it will pring out that the
													// number is higher.
					System.out.println("Higher \nyou have " + (guesses - i) + " guesses left \n");
				} else if (guess > hiddenNumber) { // If guess is bigger than hiddenNumber it will pring out that the
													// number is lower.
					System.out.println("Lower \nyou have " + (guesses - i) + " guesses left \n");
				} else if (guess == hiddenNumber) { // If guess is equal to hiddenNumber it will print out that you
													// found the number and how many guesses you had left.

					System.out.println("You found the number! Congratulations! \nYou won with " + (guesses - i)
							+ " guesses left \n");

					break;
				}

			} catch (Exception e) {
				input.nextLine(); // If you write a character it will print "Write an integer".
				i--;
				System.out.println("Write an integer");
			}

		}
		System.out.println("The hidden number was " + hiddenNumber + "\n"); // Asks if you want to play again.
		System.out.println(" - Play Again? - \n - 1 = Yes \n" + " - Anything Else = No");

		int playagain = 0;
		boolean again = true;
		while (again) {

			try {
				playagain = input.nextInt(); // Answer to if you want to play again.

				switch (playagain) {
				case 0:
					return playagain; // If player writes 0, return playagain.

				case 1:

					return playagain; // If player writes 1, return playagain.

				default:
					System.exit(0); // If player writes any other integer, system exit.
				}

			} catch (Exception e) {
				System.exit(0); // If player writes a character, system exit.

			}
		}
		return playagain;

	}

	/**
	 * Random number generates between integer min and integer max (-2147483648 and
	 * 2147483647). Then you get one guess to find the hiddenNumber, if you guess
	 * right the screen will say congratulations and ask if you want to play again,
	 * if you don't get right it will tell you what then number was and ask if you
	 * want to play the game again.
	 * 
	 * @param guesses
	 * @return playagain
	 */
	public static int hiddennumberImp(int guesses) {

		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int max = 2147483647;
		int min = -2147483648;
		int guess = 0;

		System.out.println("Max number set too: " + max); // Print what max is.
		System.out.println("Min number set too: " + min + "\n"); // Print what min is.

		int hiddenNumber = random.nextInt() + 1; // Hidden number is between integer min and integer max.
		System.out.println("Guess the hidden number between: " + min + " and " + max + "\n");

		for (int i = 1; i < guesses + 1; i++) { // Loop for guess.

			try {

				guess = input.nextInt(); // Inputs guess as the next integer.

				if (guess == hiddenNumber) { // If guess is equal to hiddenNumber it will print out that you found the
												// number.
					System.out.println("Wow you found the number!! Congratulations!! \n");
				} else if (guess > hiddenNumber) { // If guess is bigger than hiddenNumber it will print out what the
													// number was.
					System.out.println("The hidden number was " + hiddenNumber + ", better luck next time :) \n");
				} else if (guess < hiddenNumber) { // If guess is lower than hiddenNumber it will print out what the
													// number was.
					System.out.println("The hidden number was " + hiddenNumber + ", better luck next time :) \n");
				}
			} catch (Exception e) {
				input.nextLine(); // If you write a character it will print "Write an integer".
				i--;
				System.out.println("Write an integer");
			}
		}
		System.out.println(" - Play Again? - \n - 1 = Yes \n - Anything Else = No"); // Asks if you want to play again.

		int playagain = 0;
		boolean again = true;
		while (again) {

			try {
				playagain = input.nextInt(); // Answer to if you want to play again.

				switch (playagain) {
				case 0:
					return playagain; // If player writes 0, return playagain.

				case 1:

					return playagain; // If player writes 1, return playagain.

				default:
					System.exit(0); // If player writes any other integer, system exit.
				}

			} catch (Exception e) {
				System.exit(0); // If player writes a character, system exit.

			}
		}
		return playagain;

	}

}
