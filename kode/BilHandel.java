import java.util.*;

public class BilHandel{

   public static void main(String[] args) {
      ArrayList<Bil> biler = new ArrayList<Bil>();
      biler.add(new Bil("Sherman", 550));
      biler.add(new Bil("Kia C'eed", 120));
      biler.add(new Bil("Bugatti Veyron", 1000));
      
      for (Bil b : biler){
         b.printInfo();
      }      
   }

}