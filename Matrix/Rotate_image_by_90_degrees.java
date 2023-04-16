class Solution {
    public void transpose(int[][] matrix,int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i>j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }   
    public void reverse(int[][] matrix, int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<(int)(n/2);j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        transpose(matrix,n);
        reverse(matrix,n);
    }
}