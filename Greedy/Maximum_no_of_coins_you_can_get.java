class Solution {
    public int maxCoins(int[] piles) {
     Arrays.sort(piles);
     int ln=piles.length;
     int l=ln-1,b=0,m=l-1;
     int n=(int)(ln/3);
     int myscore=0;
     while(m>b){
         myscore+=piles[m];
         b++;
         m-=2;
         l-=2;
     }   
     return myscore;
    }
}