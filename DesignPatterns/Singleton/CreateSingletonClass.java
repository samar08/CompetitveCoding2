
public class CreateSingletonClass {

    public static void main(String[] args){
        SingletonClass obj1=SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();
        if(obj1==obj2){
            System.out.println("Both objects are equal");
        }
        else{
            System.out.println("Both objects are not equal");
        }
    }
    
}
