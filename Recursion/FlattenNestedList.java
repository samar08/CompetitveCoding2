/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    ArrayList<Integer> list;
    int size=0;
    int index=0;
    public void recursive(List<NestedInteger> nestedList){
         int sizeOfNested=nestedList.size(),i=0;
        for(i=0;i<sizeOfNested;i++){
            NestedInteger n=nestedList.get(i);
            if(n.isInteger()==true){
               // System.out.println("Integer found: "+n.getInteger());
                list.add((int)n.getInteger());
            }
            else{
                recursive(n.getList());
            }
        }
    }
    public NestedIterator(List<NestedInteger> nestedList){
        list=new ArrayList<>();
       recursive(nestedList);
       size=list.size();
    }

    @Override
    public Integer next() {
      
            return list.get(index++);
        
    }

    @Override
    public boolean hasNext() {
        if(index<size){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */