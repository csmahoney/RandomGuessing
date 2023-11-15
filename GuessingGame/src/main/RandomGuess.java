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

		int numGuesses = 0;

		
		System.out.println("Please guess a random number 1-10, if your guess is wrong please try again.");

		System.out.println("You only have 5 guesses to get it correct!");
				
			while (gameComplete == false) {
				int number_guess = sc.nextInt();

				

				if (number_guess == random_number) {

				System.out.println("Congradulations, you guessed the correct number!");

				gameComplete = true;

				}

				else if (number_guess != random_number && number_guess >= 1 && number_guess <= 9) {

					numGuesses++;

					if (numGuesses != 5) {

						System.out.println("This is not the correct number, guess again!");

					}

					else if (numGuesses == 5) {

						System.out.println("You have exceeded your maximum number of guesses without a correct answer, sucks to suck!");

						System.exit(-1);

					}
				}
				else if (number_guess >= 11 && number_guess <= 0) {
					System.out.println("That number is not within the bounds, please pick a number between 1 and 10.");
				}
				
						

		}

	}



}
