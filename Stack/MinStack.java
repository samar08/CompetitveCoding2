class Solution {
    Stack<Integer>min=new Stack<Integer>();
    Stack<Integer>st=new Stack<Integer>();
    public void push(int x) {
        if(min.isEmpty()==true){
            min.push(x);
            st.push(x);
        }
        else{
            if(x<=min.peek()){
                min.push(x);
            }
            else{
                min.push(min.peek());
            }
            st.push(x);
        }

        
    }

    public void pop() {
        if(st.isEmpty()==false){
            st.pop();
            min.pop();
        }
        
    }

    public int top() {
        if(st.isEmpty()==false){
            return st.peek();
        }
        else{
            return -1;
        }
     
        
    }

    public int getMin() {
        if(min.isEmpty()==false){
            return min.peek();
        }
        else{
            return -1;
        }
        
    }
}
