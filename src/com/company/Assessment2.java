package com.company;

import java.util.Random;
import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) {
        Boolean ask = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please chose a number 1-10 and enter it below.");

        int lostNumber = 10;
        Random diceRoll = new Random();
        int zechsRandom = diceRoll.nextInt(lostNumber);
//        System.out.println("random numbers " + zechsRandom);

        while (ask){
            String inputNumber = sc.nextLine();

            int userNumber = Integer.parseInt(inputNumber);

            if (userNumber > zechsRandom){

                System.out.println(userNumber + " is to high. Please enter a lower number.");

            } else if (userNumber < zechsRandom){

                System.out.println(userNumber + " is to low. Please enter a higher number.");
            } else if (userNumber == zechsRandom){
                System.out.println("Number matches.");
            }

            if (userNumber < zechsRandom || userNumber > zechsRandom){
                ask = true;
            } else {
                ask = false;
            }

        }


    }
}
