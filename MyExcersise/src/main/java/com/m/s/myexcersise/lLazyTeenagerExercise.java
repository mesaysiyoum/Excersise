package com.m.s.myexcersise;

import java.util.Random;

public class lLazyTeenagerExercise {

    public static void main(String[] args) {
        Random rng = new Random();
        double chance = 0;
        int tries = 1;

        do {
            chance = +0.1;
            double randomValue = rng.nextDouble();
            System.out.println("ask teenager (x" + tries + ")");
            if (randomValue <= chance) {
                System.out.println("FINE!");
                break;
            }
            tries++;
        } while (tries < 8);
        if (tries == 8) {
            System.out.println("thats it am doing it");
        }

    }

}
