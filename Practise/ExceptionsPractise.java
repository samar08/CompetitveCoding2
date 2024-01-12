import java.io.*;
import java.util.*;
public class ExceptionsPractise {
    
    public static void main(String[] args) throws FileNotFoundException{
        File myObj = new File("./Practise/sample.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
    }
}
}
