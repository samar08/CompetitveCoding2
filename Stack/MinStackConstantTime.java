import java.util.*;

public class MinStackConstantTime {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int opt=0;
        Stack<Integer> st=new Stack<Integer>();
        int min=Integer.MAX_VALUE;
        System.out.println("Press 1 for push");
        System.out.println("Press 2 for pop");
        System.out.println("Press 3 for getMin");
        System.out.println("Press 4 for exit");

        while(1==1){
            System.out.println("Enter your choice: ");
            opt=sc.nextInt();
            if(opt==1){
                System.out.println("Enter the number you want to input: ");
                int curr=sc.nextInt();
                if(curr>=min){
                    st.push(curr);
                }
                else{
                    st.push(2*curr - min);
                    min=curr;
                }
                
            }
            else if(opt==2){
                if(st.isEmpty()==true){
                    System.out.println("Stack is empty");
                    continue;
                }
                int peek=st.peek();
                if(peek>=min){
                    st.pop();
                }
                else{
                    int temp=st.pop();
                    min=2*min-temp;
                }
            }
            else if(opt==3){
                if(st.isEmpty()==true){
                    System.out.println("Stack is empty");
                    continue;
                }
                System.out.println(min);
            }
            else{
                System.exit(0);
            }
        }
    }
}
