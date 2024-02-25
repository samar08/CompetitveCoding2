import java.util.*;
import java.lang.Math.*;
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int r=matrix.length;
        int col=matrix[0].length;
        int[][]c= new int[r][col];
        int i,j,maxi=-9999;
        for(i=0;i<r;i++){
            for(j=0;j<col;j++){
                if(i==0 || j==0){
                    c[i][j]=Integer.parseInt(String.valueOf(matrix[i][j]));
                   
                }
                else if(matrix[i][j]=='1'){
                    c[i][j]=Math.min(Math.min((c[i-1][j]),(c[i][j-1])),(c[i-1][j-1]))+1;
                }
                else{
                    c[i][j]=0;
                }
                 if(c[i][j]>maxi){
                        maxi=c[i][j];
                    }
            }
        }
       for(i=0;i<r;i++){
           for(j=0;j<col;j++){
               System.out.print(c[i][j]+" ");
           }
           System.out.println();
       }
        return (maxi*maxi);
        
    }
}