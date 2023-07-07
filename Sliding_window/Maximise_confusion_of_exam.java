class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
     int i=0,n=s.length();
     int st=0;
     int ans=0;
     int t=0,f=0;
     int c=0;
     while(i<n){
         if(s.charAt(i)=='T'){
             t+=1;
         }
         else{
             f+=1;
         }
         while(t>k && f>k){
             if(s.charAt(st)=='T'){
                 t--;
             }
             else{
                 f--;
             }
            st++;
         }
         ans=Math.max(ans,i-st+1);
         i++;
     } 
     return ans;
    }
}