class Solution {
    public int findMinArrowShots(int[][] points) {
        int i,j,n=points.length;
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[0]>b[0]){
                    return 1;
                }
                else if(a[0]==b[0]){
                    if(a[a.length-1]>b[b.length-1]){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        });
        for(i=0;i<n;i++){
            System.out.println(points[i][0]+" "+points[i][1]);
        }
        // return 0;
        
        i=0;
        j=1;
        ArrayList<ArrayList<Integer>>out=new ArrayList<ArrayList<Integer>>();
        //out.add(new ArrayList<Integer>(Arrays.toList(0)));
        HashSet<Integer>set=new HashSet<Integer>();
        while(i<n){
            
                //set.add(i);
            int mini=points[i][1];
            ArrayList<Integer>temp=new ArrayList<Integer>();
            temp.add(i);
            j=i+1;
            
            while(j<n){
            if(points[j][0]<=points[i][1] && (points[j][0]<=mini)){
                temp.add(j);
                mini=Math.min(mini,points[j][1]);
                j++;
            }
            else{
                break;
            }
            }
            i=j;
            System.out.println(temp);
            out.add(temp);
    
        }
        System.out.println(out);
        return out.size();
        
    }
}
