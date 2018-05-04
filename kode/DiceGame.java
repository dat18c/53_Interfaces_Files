import java.util.*;

public class DiceGame{

   public static void main(String[] args){
      ArrayList<Dice> dices = new ArrayList<Dice>();
      dices.add(new Dice());
      dices.add(new LudoDice());
      //cheat
      Dice cd = new Dice();
      cd.cheat(true);
      dices.add(cd);
      Dice cld = new LudoDice();
      cld.cheat(true);
      dices.add(cld);
                  
      for (Dice d : dices){
         d.roll();
         d.tell();
      }
      //lav alle terninger til normale terninger
      for (Dice d : dices){
         d.cheat(false);
         d.roll();
         d.tell();
      }
      //lav alle terninger til snydeterninger
      for (Dice d : dices){
         d.cheat(true);
         d.roll();
         d.tell();
      }
  
   }


}