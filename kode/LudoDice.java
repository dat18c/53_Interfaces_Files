import java.util.*;

public class LudoDice extends Dice
{
   
   public void roll()
   {
      //slå med Dice
      super.roll();
      String eyes = super.getEyes();
      //Hvis det blev 3 eller 5 erstattes med stjerne og globus
      if (eyes.equals("3")){
         super.setEyes("Star");
      }
      else if (eyes.equals("5")){
         super.setEyes("Globe");
      }
   }
   
}