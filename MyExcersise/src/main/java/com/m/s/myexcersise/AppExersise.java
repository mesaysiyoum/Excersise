
package com.m.s.myexcersise;

import java.util.Scanner;

/**
 *
 * @author mesay-work
 */
public class AppExersise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String operation;
        int firstNumber = 0;
        int secondNumber = 0;

        while (true) {
            System.out.println("\n");
            System.out.println("This is your simple calculator");
            System.out.println("Please choose an operation");
            System.out.println("'A' for addition, 'S' for subtraction, 'M' for multiplication, 'D' for division");
            System.out.println("Or 'Q' to EXIT");

            operation = input.nextLine();

            if (operation.equalsIgnoreCase("Q")) {
                System.out.println("Thank You!");
                break;

            } else {

                System.out.println("please input the first number");
                firstNumber = Integer.parseInt(input.nextLine());
                System.out.println("please input the second number");
                secondNumber = Integer.parseInt(input.nextLine());

                if (operation.equalsIgnoreCase("A")) {

                    SimpleCalculator mySimpleCalculator = new SimpleCalculator();
                    int sum = mySimpleCalculator.add(firstNumber, secondNumber);
                    System.out.println(firstNumber + " + " + secondNumber + " is: " + sum);

                } else if (operation.equalsIgnoreCase("S")) {

                    SimpleCalculator mySimpleCalculator = new SimpleCalculator();
                    int difference = mySimpleCalculator.subtract(firstNumber, secondNumber);
                    System.out.println(firstNumber + " - " + secondNumber + " is: " + difference);

                } else if (operation.equalsIgnoreCase("D")) {

                    SimpleCalculator mySimpleCalculator = new SimpleCalculator();
                    double quotient = mySimpleCalculator.divide(firstNumber, secondNumber);
                    System.out.println(firstNumber + " / " + secondNumber + " is: " + quotient);

                } else if (operation.equalsIgnoreCase("M")) {

                    SimpleCalculator mySimpleCalculator = new SimpleCalculator();
                    int product = mySimpleCalculator.multiply(firstNumber, secondNumber);
                    System.out.println(firstNumber + " * " + secondNumber + " is: " + product);

                } else {
                    System.out.println("Invalid Input. Please try again.");
                }

            }

        }
    }
}
