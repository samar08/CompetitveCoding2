class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length,n=matrix[0].length;
        int i=0,j=n-1,u=0,d=m-1,mid=0;
        
        while(u<=d){
            mid=u+(int)((d-u)/2);
            if(matrix[mid][0]==target)
            {
                return true;
            }
            else if(matrix[mid][0]>target){
                d--;
            }
            else{
                u++;
            }
        }
        if(d<0){
            return false;
        }
        while(i<=j){
            mid=i+(int)((j-i)/2);
            if(matrix[d][mid]==target){
                return true;
            }
            else if(matrix[d][mid]>target){
                j--;
            }
            else{
                i++;
            }
        }
       return false;


    }
}