package com.m.s.myexcersise;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mesay-work
 */
public class RockPaperScissorsExercise {

    public static void main(String[] args) {

        //Intiating a scanner
        Scanner input = new Scanner(System.in);

        Random rng = new Random();
        //Creating an array from where the computer make a random choice.
        //"r" stands for Rock; "p" for Paper "s" for Scissors
        String[] rps = {"r", "p", "s",};

        //Declaring variables.
        String playerMove;
        String answer;
        int numOfRounds = 0;
        int userWon = 0;
        int computerWon = 0;
        int tie = 0;

        do {
            //Prompting the user.
            System.out.println("How many rounds do you want to play? ( 1 - 10)");
            numOfRounds = Integer.parseInt(input.nextLine());

            //if the user's input is out of bound, the program terminats here.
            if (numOfRounds > 10 || numOfRounds < 1) {
                System.out.println("Error! Good Bye!");

            } else {

                for (int i = 0; i < numOfRounds; i++) {
                    //Make Computer random choice.
                    String computerMove = rps[rng.nextInt(rps.length)];

                    while (true) {
                        //Prompting the user move
                        System.out.println("please enter your move r, p, s,");
                        playerMove = input.nextLine();

                        //making sure the user inputs the right letters
                        if (playerMove.equalsIgnoreCase("r") || playerMove.equalsIgnoreCase("p") || playerMove.equalsIgnoreCase("s")) {
                            break;
                            // If the user inputs invalid entry, notify the current round and score, and prompt them again.
                        } else {
                            System.out.println(playerMove + " is not a valid entry");
                            System.out.println("CURRENT SCORE: computer: " + computerWon + "  Player: " + userWon);
                            System.out.println("ROUND" + i);
                        }
                    }
                    System.out.println("computer played " + computerMove);

                    if (computerMove.equals(playerMove)) {
                        System.out.println("it was a tie");
                        //keep track of ties
                        tie++;

                    } else if (playerMove.equals("r")) {
                        if (computerMove.equals("p")) {
                            System.out.println("you lose");
                            //keep track of computer wins
                            computerWon++;

                        } else if (computerMove.equals("s")) {
                            System.out.println("you win");
                            //keep track of user wins
                            userWon++;
                        }

                    } else if (playerMove.equals("p")) {
                        if (computerMove.equals("r")) {
                            System.out.println("you win");
                            userWon++;

                        } else if (computerMove.equals("s")) {
                            System.out.println("you lose");
                            computerWon++;
                        }

                    } else if (playerMove.equals("s")) {
                        if (computerMove.equals("p")) {
                            System.out.println("you win");
                            userWon++;

                        } else if (computerMove.equals("r")) {
                            System.out.println("you lose");
                            computerWon++;
                        }

                    }
                }
            }

            //Displaying results
            System.out.println("\n");
            System.out.println("computer: " + computerWon);
            System.out.println("Player: " + userWon);
            System.out.println("tie:" + tie);
            System.out.println("\n");

            //Declaring the winner
            if (userWon == computerWon) {
                System.out.println("IT IS A TIE");
            } else if (userWon > computerWon) {
                System.out.println("CONGRATULATION!! YOU WON");
            } else if (computerWon > userWon) {
                System.out.println("YOU LOSE!");
            }

            //Prompting the user to play again.
            System.out.println("Do you want to play again y/n");
            answer = input.nextLine();

        } while (answer.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing! Good bye!");

    }

}
