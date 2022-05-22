public class Solution {
    public long mergeAndCount(ArrayList<Integer>A,int left,int mid,int right){
        ArrayList<Integer>l=new ArrayList<Integer>();
        ArrayList<Integer>r=new ArrayList<Integer>();
        for(int i=left;i<mid+1;i++){
            l.add(A.get(i));
        }
        for(int i=mid+1;i<=right;i++){
            r.add(A.get(i));
        }
        int i=0,j=0,k=left;
        long count=0;
        int n1=l.size(),n2=r.size();
        while(i<n1 && j<n2){
            if(l.get(i)<=r.get(j)){
                A.set(k,l.get(i));
                k++;
                i++;
            }
            else{
                A.set(k,r.get(j));
                k++;
                j++;
                count+=(mid+1)-(left+i);
            }
        }
        while(i<n1){
            A.set(k,l.get(i));
                k++;
                i++;
        }
        while(j<n2){
            A.set(k,r.get(j));
                k++;
                j++;
        }
        return count;
    }
    public long mergeSortAndCount(ArrayList<Integer> A,int left,int right){
        long count=0;
        long maxi=(long)Math.pow(10,9)+7;
        if(left<right){
            int mid=(int)(left+right)/2;
            count=((count)%maxi+(mergeSortAndCount(A,left,mid))%maxi)%maxi;
            count=((count)%maxi+(mergeSortAndCount(A,mid+1,right))%maxi)%maxi;
            count=((count)%maxi+(mergeAndCount(A,left,mid,right))%maxi)%maxi;
            return count%maxi;
        }
        return count;
    }
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        int left=0;
        int right=n-1;
        
        return (int)mergeSortAndCount(A,left,right);
    }
}

