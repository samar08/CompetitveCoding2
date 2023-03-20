class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0,i=0,ln=flowerbed.length;
       if(ln==1)
       {
           if(flowerbed[i]==0){
               count+=1;
           }
           if(count>=n){
               return true;
           }
           else{
               return false;
           }
       }
        for(i=0;i<ln;i++){
            if(i==0){
                if(flowerbed[i]==0){
                    if(flowerbed[i+1]==0){
                        count+=1;
                        flowerbed[i]=1;
                    }
                }
            }
            else if(i==ln-1){
                if(flowerbed[i]==0){
                    if(flowerbed[i-1]==0){
                        count+=1;
                        flowerbed[i]=1;
                    }
                }
            }
            else{
                if(flowerbed[i]==0){
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        count+=1;
                        flowerbed[i]=1;
                    }
                }
            }
            
          
        }
          if(count>=n){
                return true;
            }
            return false;
    }
}