
class Solution {
    public void permutation(int index,String[] arr, int n, HashSet<String> outSet,HashSet<Integer> set,String s){
        if(s.length()==n){
            //String output=new String(s);
            outSet.add(s);
            return;
        }
        
        int i;
        for(i=0;i<n;i++){
            if(set.contains(i)==false){
                s+=arr[i];
                set.add(i);
                permutation(i+1,arr,n,outSet,set,s);
                set.remove(i);
                s=s.substring(0,s.length()-1);
            }
            
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        int n=S.length(),i=0;
          String[] arr=new String[n];
        for(i=0;i<n;i++){
            arr[i]=""+S.charAt(i);
        }
        Arrays.sort(arr);
        LinkedHashSet<String> outSet=new LinkedHashSet<>();
        List<String> out=new ArrayList<String>();
        HashSet<Integer> set=new HashSet<>();
        String s="";
        permutation(0,arr,n,outSet,set,s);
        Iterator it=outSet.iterator();
        while(it.hasNext()){
            out.add((String)it.next());
        }
        return out;
      
    }
}