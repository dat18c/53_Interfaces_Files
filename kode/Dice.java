import java.util.*;

public class Dice
{

   private String faceUp;
   
   //konstruktør
   public Dice()
   {
      //this.faceUp = "";
      roll();
   }
   
   public String getEyes()
   {
      return this.faceUp;
   }
   
   public void setEyes(String eyes)
   {
      this.faceUp = eyes;
   }
   
   
   public void roll()
   {
      //instantier random object
      Random r = new Random();
      //lav tilfældigt tal mellem 1 og 6 og konverter til streng
      this.faceUp = Integer.toString(r.nextInt(6)+1);
   }
   
   public String toString()
   {
      return this.faceUp;
   }

}