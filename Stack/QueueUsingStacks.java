import java.util.*;
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1= new Stack<Integer>();
        stack2= new Stack<Integer>();
    }
    
    public void push(int x) {
        while(stack2.isEmpty()==false){
            stack1.push(stack2.pop());
        }
        stack1.push(x);
    }
    
    public int pop() {
        while(stack1.isEmpty()==false){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    
    public int peek() {
        int out=0;
        while(stack1.isEmpty()==false){
            stack2.push(stack1.pop());
        }
        out=stack2.peek();
        while(stack2.isEmpty()==false){
            stack1.push(stack2.pop());
        }
        return out;

    }
    
    public boolean empty() {
        if(stack1.isEmpty()==true && stack2.isEmpty()==true){
            return true;
        }
        else{
            return false;
        }
    }
}