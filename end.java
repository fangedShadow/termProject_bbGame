package com.CSCI185;

class end extends State{
    //calling for variable from other states
    SoM oScore = new SoM();
    Off myScore = new Off();
    void enter(){
        //what to print after the game has ended
        System.out.println("Game Ended!");
        if (oScore.getOppScore() > myScore.getMyScore()){
            System.out.println("You Lost!!");
            System.out.println("Final Score: "+oScore.getOppScore()+" : "+ myScore.getMyScore());
        }
        else if (oScore.getOppScore() < myScore.getMyScore()){
            System.out.println("You Won!!");
            System.out.println("Final Score: "+oScore.getOppScore()+" : "+ myScore.getMyScore());
        }
        else {
            System.out.println("Tie Game!");
            System.out.println("Final Score: "+oScore.getOppScore()+" : "+ myScore.getMyScore());
        }

    }
    //sends you to the play the next Game mode
    void update(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Going to the Start");
        current = gameMode;
    }
}