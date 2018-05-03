import java.io.*;
public class Car implements Serializable, CarInfo{

   private String model;
   private int power;
   
   //constructor
   public Car(String mod, int pow){
      this.model = mod;
      this.power = pow;
   }
   
   //getters & setters
   public void setPower(int pow){
      this.power = pow;
   }
   
   public int getPower(){
      return power;
   }
   
   //check nummerplade
   public void checkModel(){
      System.out.println("Model: " + model);
   }
   
   //pæn print
   public String toString(){
      return model + ": " + power + " hk";
   }
   
   public void printInfo(){
      checkModel();
   }
}