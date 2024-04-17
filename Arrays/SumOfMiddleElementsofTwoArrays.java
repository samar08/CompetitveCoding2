/*
 * Question: https://www.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1
 */
class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int i=0,l=0,count=0;
        int sum=0;
        boolean a1=false,a2=false;
        while((count<n+1) && (i<n && l<n)){
            if(ar1[i]<=ar2[l]){
                i+=1;
                count+=1;
                a1=true;
                a2=false;
            }
            else{
                l+=1;
                count+=1;
                a2=true;
                a1=false;
            }
            if((count==n) && (i<n && l<n)){
                if(a1==true && a2==false){
                    sum+=ar1[i-1];
                }
                else{
                    sum+=ar2[l-1];
                }
            }
        }
        if(i==n && count==n){
            sum+=ar1[i-1];
            count+=1;
            l+=1;
            a1=false;
            a2=true;
        }
        else if(l==n && count==n){
            sum+=ar2[l-1];
            count+=1;
            i+=1;
            a1=true;
            a2=false;
        }
        if(count==n+1){
             if(a1==true && a2==false){
                    sum+=ar1[i-1];
                }
                else{
                    sum+=ar2[l-1];
                }
        }
        return sum;
    }
}