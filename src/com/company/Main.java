package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Opgave 5.2
        System.out.println("I want to play a game :D.");
        System.out.println("I'm thinking of a number beetween 1 and 100, can you guess it?");
        System.out.println("Choose your number beewtween 1 and 100");


        Random random = new Random();
        int number = random.nextInt(100) + 1;

        for (int i = 0; i < 3; i++){

            Scanner scanner = new Scanner (System.in);
            int userNumber = scanner.nextInt();
            System.out.println("Your number is "+userNumber);

            if (userNumber == number){
                System.out.println("You are correct! i thinking off "+ number);
                return;
            }
            if (userNumber > number){
                System.out.println("Your guess was too high");
            }
            if (userNumber < number){
                System.out.println("Your guess was too low");
            }
/*
            System.out.print("The number i was thinking of was: ");
            System.out.println(number);*/

            /*
            int difference;
            difference=(userNumber-number);

            if (difference < 0) {difference = difference * -1;}
            if (difference == 0) {System.out.println("You were right!");}
            else {System.out.println("You were off by: "+difference);}*/
        }  System.out.println("You've used your 3 guesses, i was thinking off the number "+number+", better luck next time.");
    }
}