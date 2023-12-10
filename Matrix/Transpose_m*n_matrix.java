class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length,i,j;
        int[][] newmatrix=new int[m][n];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
             
                    newmatrix[j][i]=matrix[i][j];
                
            }
        }
        return newmatrix;

    }
}