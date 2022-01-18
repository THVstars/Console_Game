package com.carolinasanchez;

import java.util.Scanner;

public class Main {

    static Integer number = 0;

    public static void main(String[] args) {

        System.out.print("How many years are in a century? ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (number != 100) {
            System.out.println("Wrong, try again!");
            number = scanner.nextInt();
            }

        if (number == 100) {
            System.out.println("Congratulations! You're right!");
        }
    }
}