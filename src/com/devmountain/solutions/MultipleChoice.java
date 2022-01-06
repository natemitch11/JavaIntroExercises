package com.devmountain.solutions;

import java.util.Objects;
import java.util.Scanner;

public class MultipleChoice {
    /*
    In this portion we will combine elements from all three exercises so far to create a simple Multiple Choice Question

    1)Begin by creating an entry point for your program below.

    2)Instantiate a variable called 'input' of type 'Scanner' and store a new instance of Scanner passing in System.in
    as an argument

    3) Print to the terminal using System.out.println() your first question you wish to ask.

    4) Create a new String variable named 'correctAnswer' and assign it to be a String containing the correct answer
    to your question

    5) Create a new String variable named 'answer' and store the next line from the input variable

    6) Using an if-else statement, evaluate the answer variable to see if it is correct and print out the corresponding
    message to the terminal

    ------------------- EXTRA CREDIT --------------------------

    Add More multiple choice questions!


     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the square root of 16?\nA) 2\nB) 6\nC) 4");
        String correctAnswer = "C";
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase(correctAnswer)){
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Incorrect! the correct answer was " + correctAnswer);
        }
    }
}
