class Solution {
    public void rotate(int[][] matrix) {
        int i,j;
        int n=matrix.length,m=matrix[0].length;
        int times=(int)(n/2);
        int i1=0,i2=0,j1=0,j2=m-1,k1=n-1,k2=m-1,l1=n-1,l2=0;
        while(times>0){
            
            
            int temp1=i2,temp2=j1,temp3=k2,temp4=l1;
            int len=j2-i2;
            while(len>0){
                int temp=matrix[i1][temp1];
                matrix[i1][temp1]=matrix[temp4][l2];
                matrix[temp4][l2]=matrix[k1][temp3];
                matrix[k1][temp3]=matrix[temp2][j2];
                matrix[temp2][j2]=temp;
                len--;
                temp1++;temp2++;temp3--;temp4--;
            }
            i1++;j2--;k1--;l2++;
            i2++;j1++;k2--;l1--;
            times--;
        }

       
    }
   
}