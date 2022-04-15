public class Floyd_warshall
{
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        int m=matrix.length;
        int n=matrix[0].length;
        int i,j,k;
        //int[][]d=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        for(k=0;k<m;k++){
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if((i!=j) && (i!=k && j!=k)){
                    if(matrix[i][k]!=Integer.MAX_VALUE && matrix[k][j]!=Integer.MAX_VALUE){
                        matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);
                    }
                }
            }
        }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[i][j]==Integer.MAX_VALUE){
                    matrix[i][j]=-1;
                }
            }
        }
        
    }
}
