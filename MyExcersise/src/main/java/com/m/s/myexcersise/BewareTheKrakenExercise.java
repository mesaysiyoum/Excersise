package com.m.s.myexcersise;

import java.util.Random;

public class BewareTheKrakenExercise {

    public static void main(String[] args) {

        Random rng = new Random();

        String fish1 = "Shark";
        String fish2 = "Whale";
        String fish3 = "Goldfish";
        String fish4 = "Prada";

        System.out.println("Alrighty! Get those flippers and wetsuit on - we're going diving!");

        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        while (depthDivedInFt < 36200) {

            System.out.println("So far, we've swam " + depthDivedInFt + " feet");

            int x = rng.nextInt(4);
            switch (x) {

                case 0:
                    System.out.println(fish1);
                    break;
                case 1:
                    System.out.println(fish2);
                    break;
                case 2:
                    System.out.println(fish3);
                    break;
                case 3:
                    System.out.println(fish4);
                    break;
            }

            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("Time To Go!");
                break;
            }
            depthDivedInFt += 1000;

        }

    }
}
