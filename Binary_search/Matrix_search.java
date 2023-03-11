public class Solution {
    public int binsearchrow(int[][] A,int B,int n,int m){
        int low=0,high=n-1,mid;
        while(low<=high){
            mid=low+(int)(high-low)/2;
            if(A[mid][0]==B){
                return mid;
            }
            else if(A[mid][0]>B){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
    public int binsearchcol(int[][] A,int B,int n,int m,int row){
        int low=0,high=m-1,mid;
        while(low<=high){
            mid=low+(int)((high-low)/2);
            if(A[row][mid]==B){
                return mid;
            }
            else if(A[row][mid]>B){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public int searchMatrix(int[][] A, int B) {
        int n=A.length,m=A[0].length,i,j;
        int row=binsearchrow(A,B,n,m);
        if(row<0 || row>=n){
            return 0;
        }
        if(A[row][0]==B){
            return 1;
        }
        int col=binsearchcol(A,B,n,m,row);
        if(col!=-1){
            return 1;
        }
        return 0;
    }
}
