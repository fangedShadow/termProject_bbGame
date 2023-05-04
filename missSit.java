package com.CSCI185;

import java.util.InputMismatchException;
import java.util.Scanner;

class missSit extends State{
    //when enter the state
    void enter(){
        System.out.println("So, You missed your Shot");
        System.out.println("What will you do");
    }
    void update(){
        Scanner keyboard = new Scanner(System.in);
        //to stop unnecessary input
        while(true){
            //to catch Scanner String error
            try {
                System.out.println("1) Go for the Offensive Board");
                System.out.println("2) Go back to defense");
                int input = keyboard.nextInt();
                // option for next state
                if (input == 1) {
                    current = offBoard;
                    return;
                }
                else if (input == 2){
                    current = Time;
                    lastPoss = missSit;
                    return;
                }
                else {
                    System.out.println("Error! Choose the Correct Option");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the right choice.");
                // Consume the invalid input
                keyboard.next();
            }
        }
    }
}