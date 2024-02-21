public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int n=A.size(),i,sum=0,maxi=0,start=0,end=0;
    boolean found=false;
    ArrayList<Integer> out=new ArrayList<>();
    for(i=0;i<n;i++){
        
        sum+=A.get(i);
        if(sum==0){
            found=true;
            if(maxi<i+1){
                maxi=i+1;
                start=0;
                end=i;
            }
        }
        if(map.containsKey(sum)==true){
            found=true;
            if( i-map.get(sum)>maxi){
                maxi= i-map.get(sum);
                start=map.get(sum)+1;
                end=i;
            }
           
        }
        else{
           map.put(sum,i); 
        }
        
    }
    if(found==true){
        for(i=start;i<=end;i++){
        out.add(A.get(i));
    }
    }
    
    return out;
    }
}
