package com.carolinasanchez;

import java.util.Random;
import java.util.Scanner;

public class NumbersGame {
    /* 3. Once you've completed the algorithm, create another CLI game. This one will have the following requirements:
    Create a while loop that starts the game
    Prompt the user to enter (1) to start adding numbers, or (2) to exit the console.
    Generate a random number for the user from 1-50.
    The user has an ongoing integer (we can name a variable called "sum") representing a sum of the random number that was generated.
    Before the while loop cycles again, print out a summary of the user's sum. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 to start the game or 2 to stop the game:");
        int digit = scanner.nextInt();
        int sum = 0;
        Random number = new Random();
        int largestNumber = 51;

        while (digit == 1) {
            sum += number.nextInt(largestNumber); // This generates numbers from 0 to largestNumber-1 (50).
            System.out.println(sum);
            System.out.println("Please enter 1 to continue the game or 2 to stop the game:");
            digit = scanner.nextInt();
        }

        /* if (digit == 2) {
            scanner.close();
        } */ // THIS ISN'T NECESSARY. THE PROGRAM ALREADY EXITS THE CONSOLE WHEN ANY NUMBER OTHER THAN 1 IS ENTERED!
    }
}
