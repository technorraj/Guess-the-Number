package GTN;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {

		Random random = new Random();
		int min = 1;
		int max = 100;
		int targetNumber = random.nextInt(max - min + 1) + min;

		Scanner sc = new Scanner(System.in);
		int guessNo;

		System.out.println("Guess the Number between " + min + " and " + max);

		while (true) {
			System.out.print("Enter your guess: ");
			guessNo = sc.nextInt();

			if (guessNo == targetNumber) {
				System.out.println("Congratulations! You guessed the correct number.");
				break;
			} else if (guessNo < targetNumber) {
				System.out.println("Too low, try again.");
			} else {
				System.out.println("Too high, try again.");
			}
		}

		sc.close();
	}
}
