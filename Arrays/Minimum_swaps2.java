/*
Problem Description
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)]. It is allowed to swap any two elements (not necessarily consecutive).

Find the minimum number of swaps required to sort the array in ascending order.



Problem Constraints
1 <= N <= 100000
0 <= A[i] < N

*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        int i,j;
        int count=0,temp=0;
        i=0;
        while(i<n){
            if(A.get(i)!=i){
                temp=A.get(A.get(i));
                A.set(A.get(i),A.get(i));
                A.set(i,temp);
                count+=1;
            }
            else{
                i+=1;
            }
        }
        return count; 
    }
}
