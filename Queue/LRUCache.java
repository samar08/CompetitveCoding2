class LRUCache {
    int capacity;
    PriorityQueue<int[]> pq;
    HashMap<Integer,int[]> map;
    int pqcap;
    int time;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.pqcap=0;
        this.time=0;
        this.map=new HashMap<>();
        this.pq=new PriorityQueue<>(new Comparator<int[]>(){
        public int compare(int[] a, int[] b){
            if(a[2]>b[2]){
                return 1;
            }
            else if(a[2]==b[2]){
                return 0;
            }
            else{
                return -1;
            }
        }
    });
    
    }
    public int[] findAndUpdate(int key, int value, int times){
        int[] ar=map.get(key);
        pq.remove(ar);
        int[] val=new int[]{key,value,times};
        pq.add(val);
        return val;
    }
    public int get(int key) {
        if(this.map.containsKey(key)==true){
            int[] arr=this.map.get(key);
              int val2=arr[1];
            int[] val=findAndUpdate(key,val2,time);
            
            this.map.put(key,val);
               time++;
        
            return arr[1];
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(this.map.containsKey(key)==true){
            int[] arr=this.map.get(key);
            int[] val=findAndUpdate(key,value,time); 
            
            this.map.put(key,val);
            time++;
        }
        else{
            if(this.pq.size()<this.capacity){
                int[] item=new int[]{key,value,time};
                this.map.put(key,item);
                this.pq.add(item);
                time++;
                this.pqcap+=1;
            }
            else{
                int[] temp=this.pq.poll();
                
            this.map.remove(temp[0]);
            int[] item=new int[]{key,value,time};
            this.map.put(key,item);
            this.pq.add(item);
            time++;
            }
            
        }
       
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(this.capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */