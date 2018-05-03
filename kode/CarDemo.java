import java.util.*;
import java.io.*;

public class CarDemo{

   public static void main(String[] args) throws IOException, ClassNotFoundException {
      ArrayList<Car> carList = new ArrayList<Car>();
      carList.add(new Car("Kea C'eed", 120));
      carList.add(new Car("Skoda City", 55));
      carList.add(new Car("Panzer Mk IV", 750));

      for (Car c : carList){
         c.printInfo();
      }

      FileOutputStream fo = new FileOutputStream("carList.ser");
      ObjectOutputStream output = new ObjectOutputStream(fo);
      output.writeObject(carList);
      output.close();
      fo.close();
      System.out.println("Saved to carList.ser");
      System.out.println(carList);      

      ArrayList<Car> carShop = new ArrayList<Car>();
      
      FileInputStream fi = new FileInputStream("carList.ser");
      ObjectInputStream input = new ObjectInputStream(fi);
      carShop = (ArrayList<Car>) input.readObject();
      input.close();
      fi.close();
      System.out.println("Read from carList.ser");
      System.out.println(carShop);
      
   }


}