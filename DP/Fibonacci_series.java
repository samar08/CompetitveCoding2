import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int[]dp=new int[A+1];
    if(A<=1){
        System.out.println(A);
    }
    else{
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=A;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        System.out.println(dp[A]);
    }
    }
}