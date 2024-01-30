import java.util.*;
public class ConstructorChaining {
    int i=0;
    int size=10;
    public ConstructorChaining(){
        System.out.println("1");
    }
    public ConstructorChaining(ArrayList<Integer> list){
        /*
         * the call to the same Constructor with different arguments should be made at the first line
         * inside the calling constructor.
         * 
         * If we call the same constructor inside the constructor, it will throw an recursive constructor invocation error
         * during compiling itself 
         */
            this();
            i++;
            System.out.println("Called "+ i+" times");
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>();
        ConstructorChaining constructorChaining=new ConstructorChaining(input);
    }
}
