class Solution {
    public double myPow(double x, int n) {
        double res;
        if(n==1){
            return x;
        }
        else if(n==0){
            return ((double)1);
        }
        else if(n==-1){
            return (double)(1/x);
        }
        if(n%2==0){
            double pro1=myPow(x,(int)(n/2));
            res=pro1*pro1;
        }
        else{
            double pro2=(myPow(x,(int)(n/2)));
            if(n>=0)
            res=x*pro2*pro2;
            else
                res=((double)1/x)*pro2*pro2;
                
        }
        return res;
    }
}
