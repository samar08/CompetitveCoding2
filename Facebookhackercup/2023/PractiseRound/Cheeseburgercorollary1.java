import java.util.*;

public class Cheeseburgercorollary1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1,t,s,d,k,buns=0,cheese=0,patty=0,reqbuns=0,reqcheese=0,reqpatty=0;
        t=sc.nextInt();
        String out="";
        
        while(t-->0)
        {
            s=sc.nextInt();
            d=sc.nextInt();
            k=sc.nextInt();
            buns=(s*2)+(d*2);
            cheese=s+(d*2);
            patty=s+(d*2);
            reqbuns=k+1;
            reqcheese=k;
            reqpatty=k;
            if(buns>=reqbuns && cheese>=reqcheese && patty>=reqpatty){
               out="YES";
            }
            else{
                out="NO";   
            }   
            System.out.println("Case #"+(i++)+": "+out);
            
        }
    }
}
