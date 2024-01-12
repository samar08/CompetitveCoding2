class MedianFinder {
    int size;
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    int maxHeapSize=0;
    int minHeapSize=0;
    public MedianFinder() {
        this.maxHeap=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(a>b){
                    return -1;
                }
                else if(a<b){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });

        this.minHeap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(size==0){
            maxHeap.add(num);
            maxHeapSize+=1;
            size+=1;
        }
        else{
         if((maxHeapSize+minHeapSize)%2!=0){
             if(num>maxHeap.peek()){
                 minHeap.add(num);
                 minHeapSize++;
             }
             else{
                 maxHeap.add(num);
                 maxHeapSize++;
             }
            if(maxHeapSize>minHeapSize){
                int polledValue=maxHeap.poll();
                maxHeapSize--;
                minHeap.add(polledValue);
                minHeapSize++;
            }
            // else{

            // }

         }
         else{
            if(num>maxHeap.peek()){
                minHeap.add(num);
                minHeapSize++;
            }
            else{
                maxHeap.add(num);
                maxHeapSize++;
            }
            if(minHeapSize>maxHeapSize){
                int polledValue=minHeap.poll();
                minHeapSize--;
                maxHeap.add(polledValue);
                maxHeapSize++;
            }
         }
        }
    }
    
    public double findMedian() {
      if((maxHeapSize+minHeapSize)%2!=0){
          return (double)maxHeap.peek();
      }
      else{
           return ((double)(maxHeap.peek()+minHeap.peek()))/2;
      }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */