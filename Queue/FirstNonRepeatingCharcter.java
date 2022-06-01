public class Solution {
    public String solve(String A) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        Deque<Character>deque=new LinkedList<Character>();
        int i,n=A.length();
        for(i=0;i<n;i++){
            if(map.containsKey(A.charAt(i))==true){
                map.put(A.charAt(i),map.get(A.charAt(i))+1);
            }
            else{
                map.put(A.charAt(i),1);
                deque.addLast(A.charAt(i));
            }
            while(deque.isEmpty()==false && map.get(deque.peek())>1){
                deque.removeFirst();
            }
            if(deque.isEmpty()==true){
                sb.append('#');
            }
            else{
                sb.append(deque.peek());
            }
        }
        return sb.toString();
    }
}
