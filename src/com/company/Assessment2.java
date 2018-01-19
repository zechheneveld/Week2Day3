package com.company;

import java.util.Random;
import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) {
        Boolean ask = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please chose a number 1-10 and enter it below.");

        int counterNumber = 0;

        int lostNumber = 10;
        Random randomGuess = new Random();
        int zechsRandom = randomGuess.nextInt(lostNumber);
//        System.out.println("random numbers " + zechsRandom);

        while (ask){
            String inputNumber = sc.nextLine();

            int userNumber = Integer.parseInt(inputNumber);

            for (int i = 0; i < 1; i++) {

                counterNumber++;

            }

            if (userNumber > zechsRandom){

                System.out.println("Guess " + counterNumber + ": " + userNumber + " is to high. Please enter a lower number.");

            } else if (userNumber < zechsRandom){

                System.out.println("Guess " + counterNumber + ": " + userNumber + " is to low. Please enter a higher number.");
            } else if (userNumber == zechsRandom){
                System.out.println("Number matches. It took you " + counterNumber + " guesses to find the correct number.");
            }

            if (userNumber < zechsRandom || userNumber > zechsRandom){
                ask = true;
            } else {
                ask = false;
            }

        }


    }
}
