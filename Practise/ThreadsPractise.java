import java.util.*;
import java.lang.*;
class Work extends Thread{

    public void run(){
        try{
            Thread.sleep(11000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(Thread.currentThread().getName());
    }
}
class RunnableThread implements Runnable{
    public void run(){
        try{
            Thread.sleep(11000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadsPractise {
    public static void main(String[] args){
        Work w=new Work();
        RunnableThread runnableThread=new RunnableThread();
        System.out.println(Thread.currentThread().getName());
        Thread thread2=new Thread(runnableThread);
        w.start();
        
        thread2.start();
    }
    
}
