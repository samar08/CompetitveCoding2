class Solution {
    public double find(HashMap<String,HashMap<String,Double>> map, String a, String b,HashSet<String> set,double prev){
        if(map.get(a).containsKey(b)==true){
            return prev*map.get(a).get(b);
        }
        double out=-1d;
        if(set.contains(a)!=true){

      set.add(a);
        for(String child: map.get(a).keySet()){
               // System.out.println(prev);
               if(set.contains(child)!=true){
               prev=prev*map.get(a).get(child);
                out=find(map,child,b,set,prev);
            if(out!=-1d){
                return out;
            }
             prev=prev/map.get(a).get(child);
               }
            
        }
        //set.remove(a);
        }
        return out;
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,HashMap<String,Double>>map=new HashMap<String,HashMap<String,Double>>();
        int i,n=equations.size(),m=queries.size();
        double[] output=new double[m];
        
        for(i=0;i<n;i++){
            String a=equations.get(i).get(0);
            String b=equations.get(i).get(1);
            HashMap<String,Double> submap1=map.getOrDefault(a,new HashMap<String,Double>());
            HashMap<String,Double> submap2=map.getOrDefault(b,new HashMap<String,Double>());
            submap1.put(b,values[i]);
            double rev=(double)(1d/values[i]);
            submap2.put(a,rev);
            map.put(a,submap1);
            map.put(b,submap2);
        }
        for(i=0;i<m;i++){
                String a=queries.get(i).get(0);
                String b=queries.get(i).get(1);
                if(map.containsKey(a)==true){
                    if(a.equals(b)){
                        //System.out.println("A==B");
                        output[i]=1d;
                    }
                    else if(map.get(a).containsKey(b)==true){
                        output[i]=map.get(a).get(b);
                    }
                    else{
                        HashSet<String>set=new HashSet<String>();
                        double prev=1d;
                        output[i]=find(map,a,b,set,prev);
                    }
                }
                else{
                    output[i]=-1d;
                }
            }
            return output;
    }
}