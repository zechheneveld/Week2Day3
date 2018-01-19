package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {
    //Odds and Ends Lecture

        int[] simpleArray = {1, 2, 3};
        System.out.println(simpleArray[1]); //prints 2 because the position starts at 0

        simpleArray[1] = 90;
//        simpleArray[3] = 100;  will not print because it needs to be declared in the beginning (int[] section)


        int[] declaredArray = new int[5];
        //Kinda doing this: int{} declaredArray = {0,0,0,0,0}
        //If you log out all positions, they all are 0

        String[] declaredStringArray = new String [5];

        declaredStringArray[0] = "Hello";
        declaredStringArray[1] = "Zech";
        //null has no value, so it's just a place holder like 0 in a "int" and can be filled in later if applicable
        System.out.println(declaredStringArray[0]);
        System.out.println(declaredStringArray[1]);
        System.out.println(declaredStringArray[2]);

        char scottsChar = 'a';
//        char wrongChar = 'ab'; char's cannot handle more than one letter or number
        //char becomes an empty space instead of 0 or null
        System.out.println(scottsChar);


        //Double for loops
        //the fori speeds up the setup

        for (int x = 0; x < 5; x++) {
            //"y" will go through 10 times before looping to x for the next one
            for (int y = 0; y < 5; y++) {
              //  System.out.println(x + " " + y);
            }
        }

        int boardWidth = 5;
        int boardHeight = 5;

        //creating a new grid
        char[][] firstMultiArray = new char[boardWidth][boardHeight];

        //example of empty space
//        System.out.println("here:" + firstMultiArray[0][0] + "no space between which makes it empty");

        for (int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardHeight; j++) {
                firstMultiArray[i][j] = '0';

            }
        }

        firstMultiArray[1][4] = 'S';

        for (int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardHeight; j++) {
                //System.out.print allows side by side entry
                System.out.print(firstMultiArray[i][j] + " ");
            }
            System.out.println("");
        }

//        Scanner sc = new Scanner(System.in);
//        String userEntry = sc.nextLine();
//        double convertedNumber = Double.parseDouble(userEntry);

        Random diceRoll = new Random();
        int scottsRandomX = diceRoll.nextInt(boardWidth);
        int scottsRandomY = diceRoll.nextInt(boardHeight);
        System.out.println("what is scott's random: " + scottsRandomX + " " + scottsRandomY);

        firstMultiArray[scottsRandomX][scottsRandomY] = 'Q';

    }

    public void printBoard(){
        //Can move print code here,
        //but you have to move the variables outside the public static void method
    }
}

