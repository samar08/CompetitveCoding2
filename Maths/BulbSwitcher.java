import java.lang.*;
class Solution {
    public int bulbSwitch(int n) {
        int i=0;
        int out=0;
        for(i=1;i<=n;i++){
             double v=Math.sqrt(i);
             //System.out.println(v);
        int iv=(int)v;
        if(v-iv==0){
            out+=1;
        }
        }
       return out;
    }
}