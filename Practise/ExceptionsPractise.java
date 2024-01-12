import java.util.*;
public class Main
{
    public static void divide() throws ArithmeticException{
        System.out.println("divide called");
       sampleFunction();
    }
    public static void sampleFunction() throws ArithmeticException{
          System.out.println("sampleFunction called");
        orgFunction();
    }
    public static void orgFunction() throws ArithmeticException{
          System.out.println("orgFunction called");
        int res= 10/0;
         //throw new ArithmeticException("arithmetic exception called");
    }
	public static void main(String[] args) {
	    try{
	        divide();
	    }
	    catch(Exception e){
	        System.out.println(e.getMessage());
	    }
	   //File myObj = new File("filename.txt");
    //   Scanner myReader = new Scanner(myObj);
    //   while (myReader.hasNextLine()) {
    //     String data = myReader.nextLine();
    //     System.out.println(data);
		
	}
}