public class SingletonClass {
    static SingletonClass singletonClass=new SingletonClass();
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        return singletonClass;
    } 
}
