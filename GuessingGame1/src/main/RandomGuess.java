package main;

import java.util.Scanner;
import java.util.Random;



public class RandomGuess {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("You have two random guessing game choices, you can either choose a 50/50 guessing game where your streak correct is counted.");
		System.out.println("Or you can choose a game where you have to choose a random number between 1 and 10 with 5 given tries.");
		
		
		
		
		while (true) { // This is the input code to initialize either game 1 or game 2.
			
			System.out.println("Press the number (1) to play the first game, and the number (2) to play the second game.");
			int game_choice_input = sc.nextInt();
			
			
			if (game_choice_input == 1) {
				Functions.fiftyFifty();
			}
			else if (game_choice_input == 2) {
				Functions.upToTen();
			}
			else {
				System.out.println("This number does not correspond to a game, please press either (1) or (2).");
			}
		}
	}
}
