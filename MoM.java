package com.CSCI185;

class MoM extends State{
    //calling variable from offense state
    Off YN = new Off();
    //calling variable from Stop or miss state
    SoM opScore = new SoM();
    //when you enter the state
    void enter(){
        System.out.println("Did you make the Shot?");
        if (YN.getSuccessOff() == "Yes"){
            System.out.println("Yes!");
            System.out.println("Score : "+YN.getMyScore()+" : "+ opScore.getOppScore());
        }
        else {
            System.out.println("No!");
            System.out.println("Score : "+YN.getMyScore()+" : "+ opScore.getOppScore());
        }
    }
    void update(){
        // for what to do next
        if (YN.getSuccessOff() == "Yes"){
            current = Time;
            lastPoss = MoM;
        }
        else {
            current = missSit;
        }
    }
}