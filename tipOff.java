package com.CSCI185;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class tipOff extends State{
    // calling for player atributes
    playerAttribute tipoff = new playerAttribute();
    Random rnd = new Random();
    // generating Random number
    int RN = rnd.nextInt(50)+1;
    int RN2 = rnd.nextInt(50)+1;
    //enter method
    void enter(){
        System.out.println("Welcome to the tip off");
    }
    //update method
    void update(){
        Scanner keyboard = new Scanner(System.in);
        //while loop so it doesn't choose wrong option
        while(true){
            try {
                System.out.println("1) Start");
                System.out.println("2) Back");
                int input = keyboard.nextInt();
                // if you start the game
                if(input == 1){
                    if (((RN*tipoff.getOffBord()+RN2*tipoff.getDefBord())/2)> 1000){
                        System.out.println("You have won the Tip off");
                        current = Off;
                        return;
                    }
                    else {
                        System.out.println("You have Lost the Tip Off");
                        current = Def;
                        return;
                    }
                }
                //if you go back to Game mode
                else if (input == 2){
                    current = gameMode;
                    return;
                }
                else {
                    System.out.println("Error!! Choose the Correct Option");
                }
                return;
            } catch (InputMismatchException e) {
                // error catching if you put String instead of int
                System.out.println("Invalid input. Please enter the right choice.");
                // Consume the invalid input
                keyboard.next();
            }
        }

    }
}