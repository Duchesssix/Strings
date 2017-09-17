package com.company;
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //create scanner to read user input
        int correctCnt = 0; //declare and initialize variable for count of correct answers
        String answer = "";
        boolean match = false;

        //Display instructions
        System.out.println("Complete these ad slogans by entering the missing word.");  //prompt user for input

        //Ask user Q1
        System.out.println("Yellow Pages: Let your __________ do the walking.");  //prompt user for input
        answer = scanner.next();  //get user input as string

        //check if answer is correct
        correctCnt = checkAnswer("fingers", answer, correctCnt);

        //Ask user Q2
        System.out.println("Wendy's: Where's the _________?");  //prompt user for input
        answer = scanner.next();  //get user input as string

        //check if answer is correct
        correctCnt = checkAnswer("beef", answer, correctCnt);

        //Ask user Q3
        System.out.println("Secret: __________ enough for a man; but made for a woman.");  //prompt user for input
        answer = scanner.next();  //get user input as string

        //check if answer is correct
        correctCnt = checkAnswer("Strong", answer, correctCnt);

        //Ask user Q4
        System.out.println("Amex: Don't leave _________ without it.");  //prompt user for input
        answer = scanner.next();  //get user input as string

        //check if answer is correct
        correctCnt = checkAnswer("home", answer, correctCnt);

        //Ask user Q5
        System.out.println("AT&T: Reach out and ________ someone.");  //prompt user for input
        answer = scanner.next();  //get user input as string

        //check if answer is correct
        correctCnt = checkAnswer("touch", answer, correctCnt);

        //display number of questions answered correctly
        System.out.println("You answered " + correctCnt + " out of 5 questions correctly.");
    }

    public static int checkAnswer (String rightanswer, String answer, int correctCnt) {
        boolean match = false;  //declare initialize variable for answer match

        //compare user input string to correct answer tring, ignoring case
        match = rightanswer.equalsIgnoreCase( answer );

        //if answer is correct dispya appropriate message to user and increment correctcnt +1
        if (match == true) {
            System.out.println("\033[0;32m" + "CORRECT!!!" + "\033[0m");
            correctCnt += 1;
            return correctCnt;
        } else {
            System.out.println("\033[0;31m" + "Nice try but incorrect."+"\033[0m");
            return correctCnt;
        }
    }
}
