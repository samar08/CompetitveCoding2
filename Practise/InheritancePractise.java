public class InheritancePractise {
    public static void main(String[] args){
        Parent p= new Child();
        p.run();
    }
}
class Parent{
    public void walk(){
        System.out.println("Parent walk");
    }
    public void run(){
        System.out.println("Parent run");
        walk();
    }
}
class Child extends Parent{
    public void walk(){
        System.out.println("Child walk");
        super.walk();
    }
    public void run(){
        System.out.println("Child run");
        super.run();
    }
}
