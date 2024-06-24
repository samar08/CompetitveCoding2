/*
 * the idea is to use merge technique in merge sort to traverse the arrays and add the values of the two arrays to their respective variable and the result will be the max of those two variables
 */

class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        int i=0,l=0,result=0,sum1=0,sum2=0;
        int n=ar1.length;
        int m=ar2.length;
        while(i<n && l<m){
            if(ar1[i]>ar2[l]){
                sum2+=ar2[l++];
            }
            else if(ar1[i]<ar2[l]){
                sum1+=ar1[i++];
            }
            else{
                result+=Math.max(sum1,sum2);
                sum1=0;
                sum2=0;
                while((i<n && l<m) && (ar1[i]==ar2[l])){
                    result+=ar1[i++];
                    l++;
                }
            }
        }
        while(i<n){
            sum1+=ar1[i++];
        }
        while(l<m){
            sum2+=ar2[l++];
        }
        result+=Math.max(sum1,sum2);
        return result;
    }
}