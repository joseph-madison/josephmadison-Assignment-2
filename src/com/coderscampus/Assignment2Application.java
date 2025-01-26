package com.coderscampus;

import java.util.Random;

import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int attempts = 5;
		
		while (attempts > 0) {
			System.out.println("Pick a number between 1 and 100 ");
			
			int guess = scanner.nextInt();
			
			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
				continue;
			}
			
			if (guess < randomNumber) {
				System.out.println("Please pick a higher number.");
			} else if (guess > randomNumber) {
				System.out.println("Please pick a lower number.");
			} else {
				System.out.println("You win!");
				return;
			}
			attempts--;
				
			if (attempts > 0) {
				System.out.println("Attempts remaining: " + attempts);
			}else {
				System.out.println("You lose, the number was: " + randomNumber);
			}
			
		}
		scanner.close();
		
	}

}
