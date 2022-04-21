public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> mat=new ArrayList<ArrayList<Integer>>();
        int i,j;
        for(i=0;i<A;i++){
            ArrayList<Integer>row=new ArrayList<Integer>();
            for(j=0;j<A;j++){
                row.add(0);
            }
            mat.add(row);
        }
       int top=0,bottom=A-1,left=0,right=A-1;
       int dir=0;
       int k=1;
       while(top<=bottom && left<=right){
          if(dir==0){
            for(j=left;j<=right;j++){
               mat.get(top).set(j,k);
               k+=1;
               
            }
            top+=1;
          }
          else if(dir==1){
              
            for(i=top;i<=bottom;i++){
                mat.get(i).set(right,k);
                k+=1;
            }
            right-=1;
          }
          else if(dir==2){
              for(j=right;j>=left;j--){
                  mat.get(bottom).set(j,k);
                  k+=1;
              }
              bottom-=1;

          }
          else if(dir==3){
            for(i=bottom;i>=top;i--){
                mat.get(i).set(left,k);
                k+=1;
            }
            left+=1;
          }
          dir=(dir+1)%A;
       }
       return mat;

    }
}
