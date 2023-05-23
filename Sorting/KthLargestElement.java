class KthLargest {
    TreeMap<Integer,Integer>map;
    int k;
    ArrayList<Integer>list;
    int size;
    int pre;
    public KthLargest(int k, int[] nums) {
        size=0;
        list=new ArrayList<Integer>(); 
        int i=0,n=nums.length;
        for(i=0;i<n;i++){
            list.add(nums[i]);
            size+=1;
        }
        this.k=k;
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return Integer.compare(b,a);
            }
        });
        
        if(k>n){
            pre=Integer.MIN_VALUE;
        }
        else{
            list=new ArrayList<Integer>(list.subList(0,k));
            size=k;
            pre=list.get(k-1);
        }
        
    }
    
    public int add(int val) {
        if(val<=pre){
            return pre;
        }
        else{
            list.add(val);
            size+=1;
            Collections.sort(list, new Comparator<Integer>(){
                public int compare(Integer a,Integer b){
                    return Integer.compare(b,a);
                }
            });
            if(size>k){
            list.remove(k);
            size-=1;
            }
            pre=list.get(k-1);
            return list.get(k-1);
       
        }
       
      
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */