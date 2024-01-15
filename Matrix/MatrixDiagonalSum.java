class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length,sum=0,i;
        for(i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(n%2!=0){
            sum-=mat[(int)n/2][(int)n/2];
        }
       return sum;
        
    }
}