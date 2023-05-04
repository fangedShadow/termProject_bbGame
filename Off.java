package com.CSCI185;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Off extends State{
    // variable if you score
    private static String successOff;
    //variable for the score
    private static int myScore = 0;
    //setter and getter for th variable
    public static String getSuccessOff() {
        return successOff;
    }

    public static void setSuccessOff(String succesoff) {
        successOff = succesoff;
    }

    public static int getMyScore() {
        return myScore;
    }

    public static void setMyScore(int myscore) {
        myScore = myscore;
    }

    Random rnd = new Random();
    //calling for player's attribute
    playerAttribute OFF = new playerAttribute();
    //when you enter offense state
    void enter(){
        System.out.println("Your Are in the Offense");
    }
    void update(){
        Scanner keyboard = new Scanner(System.in);
        //generating random number for chances
        int RN1 = rnd.nextInt(50)+1;
        int RN2 = rnd.nextInt(50)+1;
        int RN3 = rnd.nextInt(50)+1;
        int RN4 = rnd.nextInt(50)+1;
        // running while so that it doen't choose anything else the except the option
        while(true){
            // to catch if you input string instead of a variable
            try {
                //asking for inut
                System.out.println("What will you go for?");
                System.out.println("1) 3pt");
                System.out.println("2) Mid Range");
                System.out.println("3) Dunk");
                System.out.println("4) Drive");

                int input = keyboard.nextInt();
                // what to do after it is choosen
                if (input == 1){
                    //if user makes the chosen shot
                    if(RN2*OFF.getPlayer3pt() >= 1500){
                        setSuccessOff("Yes");
                        setMyScore(getMyScore()+3);
                    }
                    //if user misses the chosen shot
                    else {
                        setSuccessOff("No");
                    }
                    current = MoM;
                    return;
                }
                else if (input == 2){
                    //if user makes the chosen shot
                    if(RN1*OFF.getMidRange() >= 1500){
                        setSuccessOff("Yes");
                        setMyScore(getMyScore()+2);
                    }
                    //if user misses the chosen shot
                    else {
                        setSuccessOff("No");
                    }
                    current = MoM;
                    return;
                }
                else if (input == 3){
                    //if user makes the chosen shot
                    if(RN4*OFF.getDunk() >= 1500){
                        setSuccessOff("Yes");
                        setMyScore(getMyScore()+2);
                    }
                    //if user misses the chosen shot
                    else {
                        setSuccessOff("No");
                    }
                    current = MoM;
                    return;
                }
                else if (input == 4){
                    //if user makes the chosen shot
                    if(RN3*OFF.getDrive() >= 1500){
                        setSuccessOff("Yes");
                        setMyScore(getMyScore()+2);

                    }
                    //if user misses the chosen shot
                    else {
                        setSuccessOff("No");
                    }
                    current = MoM;
                    return;
                }
                else {
                    System.out.println("Error!! choose one of the correct Options");
                }
            } catch (InputMismatchException e) {
                // msg if you input a string
                System.out.println("Invalid input. Please enter the right choice.");
                // Consume the invalid input
                keyboard.next();
            }
        }
    }
}