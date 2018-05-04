import java.util.*;

public class DiceGame{

   public static void main(String[] args){
      ArrayList<Dice> dices = new ArrayList<Dice>();
      dices.add(new Dice());
      dices.add(new LudoDice());
      
      for (Dice d : dices){
         d.roll();
         d.tell();
      }   
   }


}