class Solution {
    double out=1d;
    boolean possible=false;
   
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        HashMap<Integer, ArrayList<double[]>>map=new HashMap<>();
        int edgesLength=edges.length,i;
        double prob=1d;
        int[] visited=new int[n];
        double[] probArray=new double[n];
        probArray[start_node]=1d;
        PriorityQueue<double[]> q=new PriorityQueue<>(new Comparator<double[]>(){
            public int compare(double[] a, double[] b){
                if(a[1]>b[1]){
                    return -1;
                }
                else if(a[1]==b[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
        });
        for(i=0;i<edgesLength;i++){
            ArrayList<double[]> temp1=map.getOrDefault(edges[i][0],new ArrayList<>());
            temp1.add(new double[]{edges[i][1], succProb[i]});
            map.put(edges[i][0],temp1);
            ArrayList<double[]> temp2=map.getOrDefault(edges[i][1],new ArrayList<>());
            temp2.add(new double[]{edges[i][0], succProb[i]});
            map.put(edges[i][1],temp2);

        }
       
      
       q.add(new double[]{start_node, 1d});
       while(q.isEmpty()==false){
           double[] pollout=q.poll();
           visited[(int) pollout[0]]=1;
           ArrayList<double[]> c=map.getOrDefault((int)pollout[0], new ArrayList<double[]>());
           int size=c.size();
           for(i=0;i<size;i++){
               
               double[] bnode=c.get(i);
               if(visited[(int)bnode[0]]==0){
              
                   probArray[(int)bnode[0]]=Math.max(probArray[(int)bnode[0]],pollout[1]*bnode[1]);
                    q.add(new double[]{bnode[0],probArray[(int)bnode[0]] });
               }
           }
       }
        return probArray[end_node];
    }
}