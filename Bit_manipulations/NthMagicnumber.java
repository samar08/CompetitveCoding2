class Solution{
    static long nthMagicNo(int n){
        //complete the function here
        StringBuilder sb=new StringBuilder();
        int t=n,rem;
        while(t>0){
            rem=t%2;
            sb.append(Integer.toString(rem));
            t=(int)(t/2);
        }
        //System.out.println(sb.toString());
        int p=0;
        int ln=sb.length();
        long number=0;
        long sumi=0;
        long maxi=(long)Math.pow(10,9)+7;
        while(p<ln){
            if(sb.charAt(p)=='1'){
                sumi=(sumi%maxi+((long)Math.pow(5,p+1))%maxi)%maxi;
            }
            p++;
        }
        return sumi;
    }
}