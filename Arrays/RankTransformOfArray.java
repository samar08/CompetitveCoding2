class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int i,n=arr.length,rank=1;
        int[] newarr= new int[n];
        for(i=0;i<n;i++){
            newarr[i]=arr[i];
        }
        Arrays.sort(newarr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++){
            if(!map.containsKey(newarr[i])==true){
                map.put(newarr[i],rank);
                rank+=1;
            }
        }
        for(i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}