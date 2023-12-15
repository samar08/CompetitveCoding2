class Solution {
    public String destCity(List<List<String>> paths) {
        int i=0,n=paths.size();
        boolean first=true;
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(i=0;i<n;i++){
           ArrayList<String> temp= map.getOrDefault(paths.get(i).get(0),new ArrayList<String>());
           temp.add(paths.get(i).get(1));
           map.put(paths.get(i).get(0),temp);
        }
        Set<String> visited=new HashSet<>();
        Set<String> set=new HashSet<String>();
        set=map.keySet();
        Iterator keys=set.iterator();
        Queue<String> que=new LinkedList<>();
        while(keys.hasNext()==true){
            String key=(String)keys.next();
            if(visited.contains(key)==true){
                continue;
            }
            else{
                visited.add(key);
                que.add(key);
                while(que.size()>0)
                {
                    String dequedkey=que.poll();
                    visited.add(dequedkey);
                     ArrayList<String> nextStations=map.getOrDefault(dequedkey,null);
                if(nextStations==null){
                    return dequedkey;
                }
                else{
                    int size=nextStations.size();
                    for(i=0;i<size;i++){
                        if(visited.contains(nextStations.get(i))==false){
                            que.add(nextStations.get(i));
                        }
                    }
                }
                }
               
            }
        }
        return "";

    }
}