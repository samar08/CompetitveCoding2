import java.util.*;
import java.io.*;
public class ExceptionsPractise
{
    public static void divide(){
        System.out.println("divide called");
       sampleFunction();
    }
    public static void sampleFunction(){
          System.out.println("sampleFunction called");
        orgFunction();
    }
    public static void orgFunction(){
          System.out.println("orgFunction called");
        //int res= 10/0;
         throw new IOException("arithmetic exception called");
    }
    public static void readFile() throws FileNotFoundException{
      readThisFile();
    }
    public static void readThisFile() throws FileNotFoundException
    {
        /*
         * Unchecked exception
         */
        //int output=10/0;

        /*
         * Checked exception
         */
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
    }

    public static void throwcheck() throws Exception{
        //try{
            throw new Exception("Exception check");
      //  }
      //   catch(Exception e){
      //      System.out.println(e.getMessage());
      //   }
        
    }

	public static void main(String[] args) throws FileNotFoundException {
	  try{
	       divide();
	   }
	    catch(Exception e){
	        System.out.println(e.getMessage());
	    }
        try{
        readFile();
        //throwcheck();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            }
	}
}