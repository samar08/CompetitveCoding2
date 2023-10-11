/*
 * 
 * Array based hashmap
 */
public class DesignHashMap {
    int[] dict;
    int maxi=(int)(Math.pow(10,6));
       public MyHashMap() {
           dict=new int[maxi+1];
           for(int i=0;i<=maxi;i++){
               dict[i]=-1;
           }
       }
       
       public void put(int key, int value) {
           dict[key]=value;
       }
       
       public int get(int key) {
           
           return dict[key];
       }
       
       public void remove(int key) {
           dict[key]=-1;
       }
}

/*
 * LinkedList based hashmap
 */
class Node{
        int key;
        int value;
        Node next;
        Node(int key, int value){
            this.key=key;
            this.value=value;
            this.next=null;
        }
}
class MyHashMap {
    int num=1000;
    LinkedList<Node>[] buckets;
    
    public MyHashMap() {
        buckets=new LinkedList[num];
        for(int i=0;i<num;i++){
            buckets[i]=new LinkedList<>();
        }
    }
    
    public void put(int key, int value) {
        int index=key%num;
        LinkedList<Node> list=buckets[index];
        for(Node node: list){
            if(node.key==key){
                node.value=value;
                return;
            }
        }
        list.add(new Node(key,value));
    }
    
    public int get(int key) {
        int index=key%num;
         LinkedList<Node> list=buckets[index];
        for(Node node: list){
            if(node.key==key){
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
       int index=key%num;

       LinkedList<Node> list=buckets[index];
       Node toremove=null;
        for(Node node: list){
            if(node.key==key){
                toremove=node;
                break;
            }
        }
        if(toremove!=null){
            list.remove(toremove);
        }
        
        

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */