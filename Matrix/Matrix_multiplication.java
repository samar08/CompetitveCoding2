class Solution
{
    public void  Multiply(int[][] matrixA, int[][] matrixB)
    {
        // code here
         int n=matrixA.length,sum=0,i,j;
        int i1=0,j1=0,i2=0,j2=0;
        int[][] out=new int[n][n];
        while(i1<n){
            sum=0;
            while(j2<n){
                
            j1=0;
            while(j1<n){
                sum+=matrixA[i1][j1]*matrixB[j1][j2];
                j1+=1;
            }
            out[i1][j2]=sum;
            sum=0;
            j2+=1;
            }
            j2=0;
            
            i1+=1;
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
             matrixA[i][j]=out[i][j];   
            }
          
        }
    }
}