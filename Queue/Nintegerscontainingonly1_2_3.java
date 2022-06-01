public class Solution {
    public ArrayList<Integer> solve(int A) {
        ArrayList<Integer>out=new ArrayList<Integer>();
        int i=0,p=1,j=0,index=1,prevx=0,prevy=0,z=1,temp=0;
        while(index<=A){
            for(j=i;j<i+Math.pow(3,p) && index<=A;j++){
                if(p==1){
                    out.add(j+1);
                }
                else{
                    if(temp<=prevy){
                        String val=Integer.toString(z)+Integer.toString(out.get(temp));
                        out.add(Integer.parseInt(val));
                        temp++;
                    }
                    else{
                        z=(z+1);
                        if(z>3){
                            z=1;
                        }
                        temp=prevx;
                        String val=Integer.toString(z)+Integer.toString(out.get(temp));
                        out.add(Integer.parseInt(val));
                        temp++;

                    }

                }
               index++;

            }
            prevx=i;
            prevy=j-1;
            i=j;
             p+=1;
             z=1;
             temp=prevx;

        }
        return out;
        

    }
}
