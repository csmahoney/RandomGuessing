package main;

import java.util.Scanner;
import java.util.Random;

public class RandomGuess {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		

		int upperbound = 10;
		int random_number = rand.nextInt(upperbound);
		boolean gameComplete = false;
		int numGuesses = 5;
		

		System.out.println("Please guess a random number 1-10, if your guess is wrong, please try again.");
		System.out.println("You only have 5 guesses to get it correct!");
		

			while (gameComplete == false) { //Runs a loop so the user can continue to guess

				int number_guess = sc.nextInt();

				if (number_guess == random_number) { // Ends the game if the user correctly guesses the random number
					System.out.println("Congradulations, you guessed the correct number!");
					gameComplete = true;
				}

				else if (number_guess != random_number && number_guess >= 1 && number_guess <= 10) { // Defines the bounds the user can guess, must be between 0 and 10.
					numGuesses--;
					if (numGuesses != 0) {
						System.out.println("This is not the correct number, guess again! You have " + numGuesses + " guesses remaining.");
					}

					else if (numGuesses == 0) {
						System.out.println("You have exceeded your maximum number of guesses without a correct answer, sucks to suck!");
						System.exit(-1);
					}

				}

				else {
					System.out.println("This number is not between 1 and 10, please guess again. You have " + numGuesses + "guesses remaining.");
					numGuesses--;
				}
	

			}

		}
	
	


	}