import java.io.*;

public class AppendToFile{
   public static void main(String[] args) throws IOException {
      File f = new File("test.txt");
      FileWriter fw = new FileWriter(f, true); //true appender
      PrintWriter pw = new PrintWriter(fw);
      pw.println("Extra text");
      pw.println("Blank linie");
      pw.close();
   } 
}