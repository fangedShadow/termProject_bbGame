package com.CSCI185;

import java.util.Random;

class offBoard extends State{
    //calling for player attribute
    playerAttribute OB = new playerAttribute();
    Random rnd = new Random();
    //when you enter the state
    void enter(){
        int RN = rnd.nextInt(50)+1;
        System.out.println(RN);
        System.out.println("Did you Get the board?");
        if (RN*OB.getOffBord() > 1000){
            System.out.println("You got the Offensive Board");
        }
        else {
            System.out.println("No! you didn't get the board");
        }
    }
    void update(){
        int RN = rnd.nextInt(50)+1;
        System.out.println(RN);
        //if else for the next state
        if (RN*OB.getOffBord() > 1000){
            current = Off;
            lastPoss = offBoard;
        }
        else {
            current = Time;
            lastPoss = offBoard;
        }
    }
}