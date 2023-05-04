package com.CSCI185;

import java.util.Scanner;

class playerAttribute extends State{
    //Called GM variable from Gamemode state
    gameMode GM  = new gameMode();
    // all the attribute
    private static String playerName;
    private static int player3pt;
    private static int midRange;
    private static int drive;
    private static int dunk;
    private static int offBord;
    private static int defBord;
    private static int steal;
    private static int block;
    private static int contest;
    // all the attribute's setter and getter
    public static void setPlayerName(String playername) {
    }

    public static int getPlayer3pt() {
        return player3pt;
    }

    public static void setPlayer3pt(int player3Pt) {
                player3pt = player3Pt;
    }

    public static int getMidRange() {
        return midRange;
    }

    public static void setMidRange(int midrange) {
        midRange = midrange;
    }

    public static int getDrive() {
        return drive;
    }

    public static void setDrive(int Drive) {
        drive = Drive;
    }

    public static int getDunk() {
        return dunk;
    }

    public static void setDunk(int Dunk) {
        dunk = Dunk;
    }

    public static int getOffBord() {
        return offBord;
    }

    public static void setOffBord(int offbord) {
        offBord = offbord;
    }

    public static int getDefBord() {
        return defBord;
    }

    public static void setDefBord(int defbord) {
        defBord = defbord;
    }

    public static int getSteal() {
        return steal;
    }

    public static void setSteal(int Steal) {
        steal =  Steal;
    }

    public static int getBlock() {
        return block;
    }

    public static void setBlock(int Block) {
        block = Block;
    }

    public static int getContest() {
        return contest;
    }

    public static void setContest(int Contest) {
        contest = Contest;
    }
    // calling poss from Time state
    Time poss = new Time();

    void enter(){
        //what to do after gameMode is select
        if (GM.getGM() == 1){
            System.out.println("Welcome to 1 vs 1");
            System.out.println("Give me Your Player's Attribute");
        }
        else if (GM.getGM() == 2){
            System.out.println("Currently Unavailable");
        }
        else if (GM.getGM() == 3){
            System.out.println("Currently Unavailable");
        }
        else if (GM.getGM() == 4) {
            System.out.println("Currently Unavailable");
        }
        else {
            System.out.println("Not getting a number");
        }
    }
    void update(){
        Scanner keyboard = new Scanner(System.in);
        // what to do after if and else
        if (GM.getGM() == 1){
            //getting input for player's name
            System.out.println("Give me your Player's Name");
            setPlayerName(keyboard.nextLine());
            int player3pt, midRange, dunk, drive, offBord, defBord, steal, block, contest, pos;
            //getting input for player's 3pt
            do {
                System.out.println("Give me your Player's 3PT% (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                player3pt = keyboard.nextInt();
            } while (player3pt < 0 || player3pt > 100);
            setPlayer3pt(player3pt);
            //getting input for player's mid Range
            do {
                System.out.println("Give me your Mid Range% (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                midRange = keyboard.nextInt();
            } while (midRange < 0 || midRange > 100);
            setMidRange(midRange);
            //getting input for player's Dunk
            do {
                System.out.println("Give me your Dunk % (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                dunk = keyboard.nextInt();
            } while (dunk < 0 || dunk > 100);
            setDunk(dunk);
            //getting input for player's Drive
            do {
                System.out.println("Give me your Drive % (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                drive = keyboard.nextInt();
            } while (drive < 0 || drive > 100);
            setDrive(drive);
            //getting input for player's offense rebound
            do {
                System.out.println("Give me your Offensive Rebound% (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                offBord = keyboard.nextInt();
            } while (offBord < 0 || offBord > 100);
            setOffBord(offBord);
            //getting input for player's block
            do {
                System.out.println("Give me your Block% (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                block = keyboard.nextInt();
            } while (block < 0 || block > 100);
            setBlock(block);
            //getting input for player's steal
            do {
                System.out.println("Give me your Steal% (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                steal = keyboard.nextInt();
            } while (steal < 0 || steal > 100);
            setSteal(steal);
            //getting input for player's contest
            do {
                System.out.println("Give me your Shot Contest % (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                contest = keyboard.nextInt();
            } while (contest < 0 || contest > 100);
            setContest(contest);
            //getting input for player's defensive Rebound
            do {
                System.out.println("Give me your Defensive Rebound % (between 0 and 100):");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer between 0 and 100.");
                    keyboard.next();
                }
                defBord = keyboard.nextInt();
            } while (defBord < 0 || defBord > 100);
            setDefBord(defBord);
            //getting input for Number of possession to be played
            do {
                System.out.println("Number of possession you want to play for");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please enter an integer.");
                    keyboard.next();
                }
                pos = keyboard.nextInt();
            } while (pos < 0 || pos > 100);
            poss.setPossession(pos);
            current = tipOff;
        }
        else if (GM.getGM() == 2){
            current = gameMode;
        }
        else if (GM.getGM() == 3){
            current = gameMode;
        }
        else if (GM.getGM() == 4) {
            current = gameMode;
        }
        else {
            current = gameMode;
        }
    }

}