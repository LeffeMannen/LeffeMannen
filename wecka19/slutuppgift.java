package leffe;

import java.util.Random;
import java.util.Scanner;

public class slutuppgift {
/**
 * Shows the game and list of words that can appear in the game.
 * @param args
 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		String words[] = { "above", "accept", "adult", "boat", "book", "bottle", "brain", "brother", "health",
				"homework", "hangman", "house", "radio", "ready", "remove", "rest", "boat", "ant", "baboon", "badger",
				"bat", "bear", "beaver", "camel", "cat", "clam", "cobra", "coyote", "crow", "deer", "dog", "donkey",
				"duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole",
				"monkey", "moose", "mouse", "mule", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit",
				"rat", "raven", "rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider",
				"tiger", "toad", "turkey", "turtle", "whale", "wolf", "zebra" }; // List of words that can appear in the hangman game.

		

		try {
			boolean game = true; // If game equals true the game will start.
			while (game) { // While game equals true play everything below this code.

				System.out.println(" - Welcome to my Hangman Game - \nGuess the right word and you will win!\n"); // Welcome instructions.
				int randomWord = random.nextInt(words.length); // randomWord generates a word from the list of words above.
				char hiddenWord[] = words[randomWord].toCharArray(); // Changes the hiddenWord to a char to seperate the characters.
				int life = words[randomWord].length(); // Added so the player has a life.
				char guess[] = new char[life]; // Added so you can guess the word.

				for (int i = 0; i < guess.length; i++) {
					guess[i] = '-'; // Replaces the characters in the word with '-'.
				}

				boolean guessedRight = false; // Makes it so you dont win instantly if its false.
				int tries = 15; // Sets the total tries you have to guess the word.

				while (!guessedRight && tries != 0) { // While you haven't guessed right and your tries is not equal to zero you can keep guessing.
					System.out.println("        - Hiddenword: -");
					System.out.println(guess); // Prints out what you recently guessed.
					System.out.println("\nGuesses left: " + (tries)); // Prints out how many guesses you have left.
					System.out.println("Enter a single character: \nIf you write a word only the first letter will be used");

					char c = input.nextLine().toLowerCase().charAt(0); // The next thing you write is the character you guess.
					tries--; // You lose one guess so you dont have infinite guesses.

					if (!Character.isLetter(c)) { // If your character is not a letter etc. a number you wont lose one guess.
						System.out.println("Write a character");
						tries++; // You get one guess back because you didn't write a character.
					}

					{
						for (int i = 0; i < hiddenWord.length; i++) {
							if (hiddenWord[i] == c) { // If hiddenWord contains your guess it will print out that character.
								guess[i] = c;
							}
						}
						if (isTheWordGuessed(guess)) { // If you found the hiddenWord you win the game.
							guessedRight = true; // Ends the game.
							System.out.println("\nCongratulations you found the word, the word was: \n");
							System.out.println(hiddenWord); // Prints out the hidden word.
							System.out.println();
						}

					}

				}

				if (!guessedRight) { // If you didn't find the hiddenWord you lost the game.
					System.out.println("You have no guesses left \nThe word was: \n");
					System.out.println(hiddenWord); // Prints out the hidden word.
					System.out.println();
				}
				System.out.println("Do you want to play again? (yes/no) "); // Asks if you want to play the game again.
				String playagain = input.nextLine(); // If you type yes the game will start over with a new word and if you type no the game will end.
				if (playagain.equals("no")) {
					System.out.println("Goodbye");
					game = false;
				} else if (playagain.equals("yes")) {
					game = true;
				} else { // If you type anything else then yes or no the game will end anyways.
					System.out.println(
							"You didnt follow you're instructions, guess i'll have to end the game anyways :)");
					System.exit(0); // Exits the game.
				}

			}
		} catch (Exception e) { // Removes error if you would have pressed enter.
			System.out.println("Why did you press enter without typing a character?"); // Asks why you pressed the enter key.
		}
	}
/**
 * If i dont have this method the game wont end when i get the right answer.
 * @param array
 * @return Game
 */
	public static boolean isTheWordGuessed(char[] array) {
		boolean Game = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '-') { // If the word has no '-' left, end the game.
				Game = false; // Ends the game.
			}
		}
		return Game; // Return game.
	}
}
