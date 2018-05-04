import java.util.*;

public class Dice implements CheatDice{

   private String faceUp="";
   // cheat state
   private boolean cheat = false;
   
   public String getEyes(){
      return faceUp;
   }
   
   public void setEyes(String eyes){
      faceUp = eyes;
   }
   
   public boolean getCheat(){
      return cheat;
   }
   
   public void setCheat(boolean cheat){
      this.cheat = cheat;
   }
   
   public void roll(){
      //check cheat
      if (cheat){
         faceUp = Integer.toString(6);
      }
      else{
         Random r = new Random();
         faceUp = Integer.toString(r.nextInt(6)+1);
      }
   }
   
   public void tell(){
      System.out.println(faceUp);
   }
   
   //cheat fra interface CheatDice
   public void cheat(boolean cheatonoff){
      this.cheat = cheatonoff;
   }

}