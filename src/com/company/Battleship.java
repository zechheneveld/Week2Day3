package com.company;

import java.util.Random;
import java.util.Scanner;

public class Battleship {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Create 5x5 game board

//        int[] simpleArray = {1, 2, 3, 4, 5};

        int H = 5;
        int W = 5;
        String[][] declaredStringArray = new String[W][H];
        int counterNumber = 0;
        //String counterLetter = ("A" + "B" + "C" + "D" + "E");
        String addASpace;

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                counterNumber++;

                if (counterNumber < 10) {
                    addASpace = " " + String.valueOf(counterNumber);
                } else {
                    addASpace = String.valueOf(counterNumber);
                }
                declaredStringArray[i][j] = addASpace;
                System.out.print(declaredStringArray[i][j] + "  ");

            }

            System.out.println(" ");
        }

        Random diceRoll = new Random();
        int scottsRandomX = diceRoll.nextInt(W);
        int scottsRandomY = diceRoll.nextInt(H);
        System.out.println("random numbers " + scottsRandomX + " " + scottsRandomY);

        //[scottsRandomX][scottsRandomY] = 'Q';
//
//        for (int x = 0; x < boardHeight; x++) {
//            for (int y = 0; y < boardWidth; y++) {
//
//                System.out.print(firstMultiArray[x][y] + " ");
//            }
//
//       System.out.println("");
//        public static void printMap(){
//            for (int i = 0; i < W; i++) { //Y positions
//                for (int j = 0; j < H; j++) { //X positions
//                    System.out.print(declaredStringArray[j][i] + " "); //Print the row
//                }
//                System.out.println(""); //Move to next column
//            }
        }

    }

