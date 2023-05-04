package com.CSCI185;

import java.util.InputMismatchException;
import java.util.Scanner;

class gameMode extends State{
    // GM is the Int so that other states know about the Selected Game mode
    private static int GM;
    // setter for GM
    public static void setGM(int gm){
        GM = gm;
    }
    // getter for GM
    public int getGM(){
        return GM;
    }
    // Enter method when the current state enter Game mode state
    void enter(){
        System.out.println("Select the gameMode");
    }
    void update(){
        // while loop for the state so that it doesn't accept anything except the option
        while (true) {
            //Gamemode option to choose
            System.out.println("1) 1v1");
            System.out.println("2) 2v2");
            System.out.println("3) 3v3");
            System.out.println("4) 5v5");
            Scanner keyboard = new Scanner(System.in);
            try {
                int input = keyboard.nextInt();
                setGM(input);
                // if else used to tell what happens after the selection is made
                if (input == 1) {
                    current = playerAttribute;
                    return;
                } else if (input == 2) {
                    current = playerAttribute;
                    return;
                } else if (input == 3) {
                    current = playerAttribute;
                    return;
                } else if (input == 4) {
                    current = playerAttribute;
                    return;
                } else {
                    System.out.println("Error choose a Correct Game mode");
                }
            } catch (InputMismatchException e) {
                //Exception for if a String is input instead of Integer
                System.out.println("Invalid input. Please enter the right choice.");
                // Consume the invalid input
                keyboard.next();
            }
        }
    }
}