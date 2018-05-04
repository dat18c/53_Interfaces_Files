import java.util.*;

public class Dice{

   private String faceUp="";
   
   public String getEyes(){
      return faceUp;
   }
   
   public void setEyes(String eyes){
      faceUp = eyes;
   }
   
   public void roll(){
      Random r = new Random();
      faceUp = Integer.toString(r.nextInt(6)+1);
   }
   
   public void tell(){
      System.out.println(faceUp);
   }

}