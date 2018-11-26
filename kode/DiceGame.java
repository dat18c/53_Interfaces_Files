import java.util.*;

public class DiceGame{

   public static void main(String[] args){
      ArrayList<Dice> dices = new ArrayList<Dice>();
      for (int i=0;i<3;i++)
      {
         dices.add(new Dice());
         dices.add(new LudoDice());
      }
                  
      for (Dice d : dices){
         d.roll();
         System.out.println(d);
      }
  
   }


}