/*
 * Initialize all the three threads
 */
class Thread1 extends Thread{
    Display display;
    String name="Thread1";
    Thread1(Display display){
        this.display=display;
    }
    public void run(){
        display.print(name,0);
    }
}
class Thread2 extends Thread{
    Display display;
    String name="Thread2";
    Thread2(Display display){
        this.display=display;
    }
    public void run(){
        display.print(name,1);
    }
}
class Thread3 extends Thread{
    Display display;
    String name="Thread3";
    Thread3(Display display){
        this.display=display;
    }
    public void run(){
        display.print(name,2);
    }
}
/*
 * Display class contains code for printing the current executing thread and the sequence number if it is
 * not locked.
 * 
 * Display class uses the synchronized block to synchronize the threads from accessing the code which 
 * checks if the current thread has to execute or not.
 */
class Display{
    int counter=0;
    int max=10;
    
public void print(String name, int number){
    while(counter<max){
        synchronized(this){
        if(counter%3==number && counter<max){
            System.out.println(name+"-"+(counter+1));
            counter+=1;
        }
    }
    }
    
}

}
public class SynchronizationPractise {
    public static void main(String[] args) {
        Display display=new Display();
        Thread1 thread1=new Thread1(display);
        Thread2 thread2=new Thread2(display);
        Thread3 thread3=new Thread3(display);
        thread1.start();
        thread2.start();
        thread3.start(); 
    }
    
    
    
}
