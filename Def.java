package com.CSCI185;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Def extends State{
    //variable for the classs to see if we made a stop or not
    private static String successDef;
    //setter and getter for the variable
    public static String getSuccessDef() {
        return successDef;
    }

    public static void setSuccessDef(String succesdef) {
        successDef = succesdef;
    }
    //calling for player attributes
    playerAttribute DEF = new playerAttribute();
    Random rnd = new Random();
    //when current enters the state
    void enter(){
        System.out.println("Your Are in the Defense");
    }
    void update(){
        Scanner keyboard = new Scanner(System.in);
        int RN1 = rnd.nextInt(50)+1;
        int RN2 = rnd.nextInt(50)+1;
        int RN3 = rnd.nextInt(50)+1;
        //to stop unnecessary inputs
        while(true){
            //to stop a string input
            try {
                //option
                System.out.println("What will you go for:");
                System.out.println("1) Steal");
                System.out.println("2) Block");
                System.out.println("3) Contest");
                int input = keyboard.nextInt();
                if (input == 1){
                    //if you made the stop or not
                    if(DEF.getSteal()*RN1 >= 1500){
                        setSuccessDef("Yes");
                    }
                    else {
                        setSuccessDef("No");
                    }
                    current = SoM;
                    return;
                }
                else if (input == 2){
                    //if you made the stop or not
                    if(DEF.getBlock()*RN2 >= 1500){
                        setSuccessDef("Yes");
                    }
                    else {
                        setSuccessDef("No");
                    }
                    current = SoM;
                    return;
                }
                else if (input == 3){
                    //if you made the stop or not
                    if(DEF.getContest()*RN3 >= 1500){
                        setSuccessDef("Yes");
                    }
                    else {
                        setSuccessDef("No");
                    }
                    current = SoM;
                    return;
                }
                else {
                    System.out.println("Error!! choose one of the correct Options");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the right choice.");
                // Consume the invalid input
                keyboard.next();
            }
        }
    }
}