import java.util.*;

public class MaxStackConstantTime {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int opt=0;
        Stack<Integer> st=new Stack<Integer>();
        int max=Integer.MIN_VALUE;
        System.out.println("Press 1 for push");
        System.out.println("Press 2 for pop");
        System.out.println("Press 3 for getMax");
        System.out.println("Press 4 for exit");

        while(1==1){
            System.out.println("Enter your choice: ");
            opt=sc.nextInt();
            if(opt==1){
                System.out.println("Enter the number you want to input: ");
                int curr=sc.nextInt();
                if(curr<=max){
                    st.push(curr);
                }
                else{
                    st.push(2*curr - max);
                    max=curr;
                }
                
            }
            else if(opt==2){
                if(st.isEmpty()==true){
                    System.out.println("Stack is empty");
                    continue;
                }
                int peek=st.peek();
                if(peek<=max){
                    st.pop();
                }
                else{
                    int temp=st.pop();
                    max=2*max-temp;
                }
            }
            else if(opt==3){
                if(st.isEmpty()==true){
                    System.out.println("Stack is empty");
                    continue;
                }
                System.out.println("Maximum element is: "+max);
            }
            else{
                System.exit(0);
            }
        }
    }
}
