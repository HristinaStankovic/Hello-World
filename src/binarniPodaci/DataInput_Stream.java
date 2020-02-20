package binarniPodaci;
import java.io.*;
public class DataInput_Stream {

   public static void main(String args[])throws IOException {

      // writing string to a file encoded as modified UTF-8
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("test.txt"));
      dataOut.writeUTF("aaahhjj2255");
      dataOut.writeUTF("bllll");

      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("test.txt"));

      while(dataIn.available()>0) {
         String k = dataIn.readUTF();
         System.out.print(k+" ");
      }
   }
}