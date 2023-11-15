package src.main;

import java.util.Random;
import java.util.Scanner;


public class Functions {

	public static void fiftyFifty() { // This begins the function code for game 1.
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("You have chosen to play game #1!");
		System.out.println("The goal of this game is to guess a random number between 1 and 2, and see how long of a streak you can get.");
		System.out.println("You may begin by either pressing (0) or (1), good luck! You can end this game at any time by pressing the number (9).");
		
		int upperbound = 2;
		int correct_streak = 0;
		boolean gameComplete = false;
		
		while (gameComplete == false) { // Begins the loop for the second game, looping between a random number, 0-1
			
			int random_number = rand.nextInt(upperbound);
			int fifty_fifty_input = sc.nextInt();
			
			if (fifty_fifty_input == random_number) { // Initializing the streak if the random number is guessed correctly
				correct_streak++;
				if (correct_streak == 1) { // Using correct grammar
					System.out.println("You are on a streak of " + correct_streak + " guess!");
				}
				else { // Using correct grammar
				System.out.println("You are on a streak of " + correct_streak + " guesses!");
				}
			}
			else if (fifty_fifty_input != random_number && fifty_fifty_input != 9){ // This is what is printed when the correct number is not guessed and the user chooses to keep playing
				correct_streak = 0;
				if (fifty_fifty_input == 1 || fifty_fifty_input == 0 || fifty_fifty_input == 9) {
					System.out.println("That is not the correct number! Your streak is broken, try again!");
				}
				else {
					System.out.println("You have not chosen the numbers (0), (1). Or if you would like to exit the game please press (9)");
				}
			}
			else if (fifty_fifty_input == 9) { // The user has chosen to exit the game
				System.out.println("You have chosen to exit the game and return to the main menu, goodbye!");
				gameComplete = true;
			}
		}
	
	}
	
	
	public static void upToTen() { // This begins the function code for game 2.
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int upperbound = 10;
		int random_number = rand.nextInt(upperbound);
		boolean gameComplete = false;
		int numGuesses = 5;
		
		System.out.println("You have chosen to play game #2!");
		System.out.println("Please guess a random number 1-10, if your guess is wrong, please try again.");
		System.out.println("You only have 5 guesses to get it correct!");
	
		
		while (gameComplete == false) { //Runs a loop so the user can continue to guess

			int input_guess_number = sc.nextInt();

			if (input_guess_number == random_number) { // Ends the game if the user correctly guesses the random number
				System.out.println("Congradulations, you guessed the correct number!");
				System.out.println("Returning to main menu.");
				gameComplete = true;
			}

			else if (input_guess_number != random_number && input_guess_number >= 1 && input_guess_number <= 10) { // Defines the bounds the user can guess, must be between 0 and 10.
				numGuesses--;
				if (numGuesses != 0) {
					System.out.println("This is not the correct number, guess again! You have " + numGuesses + " guesses remaining.");
				}

				else if (numGuesses == 0) {
					System.out.println("You have exceeded your maximum number of guesses without a correct answer. If you would like to continue please press any button");
					System.out.println("If you would not like to continue, please press (9)");
					int game_return = sc.nextInt(); 
					
					if (game_return == 9) {
						System.out.println("You have chosen to return to the main menu, goodbye!");
						gameComplete = true;
					}
					else {
						System.out.println("You have chosen to restart the game, good luck!");
						numGuesses = 5;
					}
				}

			}

			else {
				System.out.println("This number is not between 1 and 10, please guess again. You have " + numGuesses + "guesses remaining.");
				numGuesses--;
			}

		}
	}
}