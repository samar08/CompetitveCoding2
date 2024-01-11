import java.util.*;
class Employee{
    private int id;
    private String name;
    private int hashCode;
    Employee(int id, String name){
        this.id=id;
        this.name=name;
        this.hashCode=Objects.hash(id, name);
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Employee other=(Employee)o;
        return (id==other.getId() && (name.equals(other.getName())));
    }
    @Override
    public int hashCode(){
        return this.hashCode;
    }
}
public class EmployeeClassAsKey {
    public static void main(String[] args){
    HashMap<Employee, String> map=new HashMap<>();
    Employee e1=new Employee(1, "Samar");
    Employee e2=new Employee(1,"Samar");
    map.put(e1, "main");
    map.put(e2, "main1");
    Iterator it=map.keySet().iterator();
    while(it.hasNext()){
        Employee key=(Employee)(it.next());
        System.out.println(key.getName() +" "+ key.getId());
        System.out.println(map.get(key));
    }
    
    }
    
}
