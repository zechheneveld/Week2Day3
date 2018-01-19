package com.company;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {


        int H = 5;
        int W = 5;
        Random diceRoll = new Random();
        int scottsRandomX = diceRoll.nextInt(W);
        int scottsRandomY = diceRoll.nextInt(H);
        System.out.println("random numbers " + scottsRandomX + " " + scottsRandomY);
    }



}

