/*
 * Question link: https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
 *
 */
class Solution{
    static List<Integer> minPartition(int N)
    {
        int i,l;
        int[] coins=new int[10];
        ArrayList<Integer> out=new ArrayList<>();
        coins[0]=1;
        coins[1]=2;
        coins[2]=5;
        coins[3]=10;
        coins[4]=20;
        coins[5]=50;
        coins[6]=100;
        coins[7]=200;
        coins[8]=500;
        coins[9]=2000;
        //int[] target=new int[N+1];
        int[][] mat=new int[10][N+1];
        for(l=0;l<=N;l++){
            mat[0][l]=l;
        }
        for(i=1;i<10;i++){
            for(l=1;l<=N;l++){
                if(coins[i]>l){
                    mat[i][l]=mat[i-1][l];
                }
                else{
                    mat[i][l]=1+mat[i][l-coins[i]];
                }
            }
        }
        //System.out.println(mat[9][N]);
        i=9;
        int temp=N;
        while(temp!=0){
        while(coins[i]>temp){
            i--;
        }
        out.add(coins[i]);
        temp-=coins[i];
        }
        return out;
    }
}