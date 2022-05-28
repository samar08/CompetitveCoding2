public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A) {
        int i,j,n=A.size();
        if(n==1){
            return A.get(0);
        }
        int maxi=Integer.MIN_VALUE;
        ArrayList<Integer>outleft=new ArrayList<Integer>();
	       
	        Stack<Integer>stleft=new Stack<Integer>();
	        for(i=0;i<n;i++){
	            if(stleft.isEmpty()==true){
	                outleft.add(-1);
	                stleft.push(i);
	            }
	            else{
	                while(stleft.isEmpty()==false && A.get(i)<=A.get(stleft.peek())){
	                    stleft.pop();
	                }
	                if(stleft.isEmpty()==true){
	                    outleft.add(-1);
	                    stleft.push(i);
	                }
	                else{
	                    outleft.add(stleft.peek());
	                    stleft.push(i);
	                }
	            }
	        }
            //System.out.println(outleft);
 ArrayList<Integer>outright=new ArrayList<Integer>();
	       
	        Stack<Integer>stright=new Stack<Integer>();
	        for(i=n-1;i>=0;i--){
	            if(stright.isEmpty()==true){
	                outright.add(n);
	                stright.push(i);
	            }
	            else{
	                while(stright.isEmpty()==false && A.get(i)<=A.get(stright.peek())){
	                    stright.pop();
	                }
	                if(stright.isEmpty()==true){
	                    outright.add(n);
	                    stright.push(i);
	                }
	                else{
	                    outright.add(stright.peek());
	                    stright.push(i);
	                }
	            }
	        }
            for(i=0;i<(int)n/2;i++){
                int temp=outright.get(n-i-1);
                outright.set(n-i-1,outright.get(i));
                outright.set(i,temp);
            }
             // System.out.println(outright);
            for(i=0;i<n;i++){
                maxi=Math.max(maxi,((outright.get(i)+1)-(outleft.get(i)+1)-1)*A.get(i));
            }
            return maxi;

        
    }
}
