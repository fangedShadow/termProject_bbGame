package com.CSCI185;

import java.util.Random;

class defBoard extends State{
    //calling for player attributes
    playerAttribute DB = new playerAttribute();
    Random rnd = new Random();
    int RN = rnd.nextInt(50)+1;
    //when you enter the state
    void enter(){
        System.out.println("You went for Rebound");
        if (RN*DB.getDefBord() > 1000){
            System.out.println("You got the Defensive Board");
        }
        else {
            System.out.println("No! you didn't get the board");
            System.out.println("Get back on Defense");
        }
    }
    void update(){
        //tells if you get the rebound or not
        if (RN*DB.getDefBord() > 1000){
            current = Time;
            lastPoss = defBoard;
        }
        else {
            current = Def;
            lastPoss = defBoard;
        }
    }
}