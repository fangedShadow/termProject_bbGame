package com.CSCI185;

import java.util.Random;

class SoM extends State{
    //calling variable from other states
    Def YN = new Def();
    Off YNO = new Off();
    //variable for opponents score
    private static int oppScore = 0;
    //setter and getter for the variable
    public static int getOppScore() {
        return oppScore;
    }

    public static void setOppScore(int oppscore) {
        oppScore = oppscore;
    }
    Random rnd = new Random();
    //when you enter the state
    void enter(){
        int RN = rnd.nextInt(2)+2;
        //tells you if you made a stop of not
        System.out.println("Did you make a Stop?");
        if (YN.getSuccessDef() == "Yes"){
            System.out.println("You got the stop!");
            System.out.println("Score : "+YNO.getMyScore()+" : "+getOppScore());
        }
        else {
            System.out.println("No!");
            setOppScore(getOppScore()+RN);
            System.out.println("Score : "+YNO.getMyScore()+" : "+getOppScore());
        }
    }
    void update(){
        //what to do if you made a stop of not
        if (YN.getSuccessDef() == "Yes"){
            current = defBoard;
        }
        else {
            current = Time;
            lastPoss = SoM;
        }
    }
}