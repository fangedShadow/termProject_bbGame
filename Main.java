package com.CSCI185;

public class Main {

    public static void main(String[] args) {
	    // All the used states are called here
        State.gameMode = new gameMode();
        State.playerAttribute = new playerAttribute();
        State.tipOff = new tipOff();
        State.current = State.gameMode;
        State.Def = new Def();
        State.Off = new Off();
        State.MoM = new MoM();
        State.SoM = new SoM();
        State.defBoard = new defBoard();
        State.offBoard = new offBoard();
        State.missSit = new missSit();
        State.Time = new Time();
        State.end = new end();
        // Current Runs
        while (true){
            State.current.enter();
            State.current.update();
        }
    }
}
