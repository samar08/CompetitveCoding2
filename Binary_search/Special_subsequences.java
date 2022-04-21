public class Solution {
    public int binsearch(int ind,ArrayList<Integer>arrG){
        int low=0,mid;
        int high=arrG.size()-1;
        int n=arrG.size();
        while(low<=high){
            mid=(int)(low+high)/2;
            if(arrG.get(mid)>ind){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return n-low;


    }
    public int solve(String A) {
        int n=A.length();
        ArrayList<Integer>arrA=new ArrayList<Integer>();
        ArrayList<Integer>arrG=new ArrayList<Integer>();
        int i,countA=0,countG=0;
        for(i=0;i<n;i++){
           if(A.charAt(i)=='A'){
               countA+=1;
               arrA.add(i);
           }
           else if(A.charAt(i)=='G'){
             countG+=1;
             arrG.add(i);
           }
        }
        if(countA==0 || countG==0){
            return 0;
        }
        int sumi=0;
        for(i=0;i<countA;i++){
            int ind=arrA.get(i);
           sumi+=binsearch(ind,arrG);
        }
        return sumi;

    }
}

