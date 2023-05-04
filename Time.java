package com.CSCI185;

class Time extends State{
    //variable for the state
    private static int possession;
    public static int NoP = 1;
    //setter and getter for the variables
    public static int getPossession() {
        return possession;
    }
    public static void setPossession(int Possession) {
        possession = Possession;
    }
    //when you enter the state
    void enter(){
        System.out.println("Possession ended!");
        //calculated the number of possession played
        if((lastPoss == MoM)||(lastPoss == SoM)||(lastPoss == defBoard)||(lastPoss == missSit)||(lastPoss == offBoard)) {
            NoP = NoP + 1;
        }
    }
    void update(){
          System.out.println("Next Possession");
          //tells what to do after the last possession
          if (NoP <= getPossession()){
              if (lastPoss == MoM){
                  current = Def;
              }
              else if(lastPoss == SoM){
                  current = Off;
              }
              else if(lastPoss == defBoard){
                  current = Off;
              }
              else if(lastPoss == missSit){
                  current = Def;
              }
              else if(lastPoss == offBoard){
                  current = Def;
              }
          }
          else {
              current = end;
          }
    }
}